package com.xr.boot.controller.system;

import com.xr.boot.entity.SyEmp;
import com.xr.boot.ienum.Return;
import com.xr.boot.ienum.StausEnum;
import com.xr.boot.service.system.SyEmpService;
import com.xr.boot.util.AES;
import com.xr.boot.util.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@RestController
@Api(tags = "权限用户相关接口")
@RequestMapping("jurisdiction")
@Slf4j
public class SyEmpController {

    @Autowired
    private SyEmpService syEmpService;

    @ApiOperation("修改密码")
    @PutMapping("/uppassword")
    public void upPassWord(String empno,String ypwd,String xpwd){
        SyEmp syEmp=new SyEmp();

        String pwd="";
        try {
            syEmp.setPwd(AES.encryptAES(xpwd));
        } catch (Exception e) {
            e.printStackTrace();
        }
        syEmp.setEmpNo("007");
        syEmpService.upSyEmpById(syEmp);
    }


    @PostMapping("/login")
    @ApiOperation("登录")
    public Return login(SyEmp syEmp) throws Exception {
        SyEmp login = syEmpService.login(syEmp);
        login.getSyRolesMenus();
        String jwt = JwtUtil.createJwt(login.getEmpNo(), login.getEmpName(),
                login.getSyRolesMenus().get(0).getRoleNames().getRoleName(),login);
        return new Return(StausEnum.SUCCESS,jwt);
    }


    @ApiOperation("验证码图片化")
    @GetMapping(value = "/ImageCode")
    public void  getImageCode(String code, HttpServletRequest request, HttpServletResponse response){

        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            imageToCode(code,request, response);//输出验证码图片方法
        } catch (Exception e) {
            log.error("获取验证码失败>>>>   ", e);
        }
    }
    /**
     * 生成一个长度为4的字符串(随机包含大写字母，小写字母，数字)
     *
     * @return
     */
    @ApiOperation("获取验证码")
    @GetMapping("/getCode")
    public String getString() {
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(3);
            switch (num) {
                case 0:// 数字
                    int number = random.nextInt(10);
                    str += number;
                    break;
                case 1:// 小写字母
                    int lower = random.nextInt(26) + 97;
                    str += (char) lower;
                    break;
                case 2:// 大写字母
                    int upper = random.nextInt(26) + 65;
                    str += (char) upper;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        return str;
    }
    private void imageToCode(String code,HttpServletRequest request, HttpServletResponse response){
        // 创建一张图片
        int width = 120;
        int height = 25;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 创建一支画笔
        Graphics2D graphics = image.createGraphics();
        // 给画笔添加颜色
        graphics.setColor(Color.white);
        // 填充矩形
        graphics.fillRect(0, 0, width, height);
        String str = code;
        Random random = new Random();
        // 根据验证码长度随机画干扰线(颜色随机，位置随机，长度随机)
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Font font = new Font("微软雅黑", Font.BOLD, 22);
            graphics.setFont(font);
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            graphics.setColor(color);
            graphics.drawString(String.valueOf(c), 20 + i * 15, 20);
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int x2 = random.nextInt(width);
            int y2 = random.nextInt(height);
            graphics.drawLine(x1, y1, x2, y2);
        }
        // 把图像刷到BufferedImage对象中
        graphics.dispose();
        // 将图像写入 File，并指定图片格式
        //ImageIO.write(image, "jpg", arg1.getOutputStream());
        try {
            ImageIO.write(image, "JPEG", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
