package com.xr.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

@RestController
@Api(tags = "权限相关接口")
@RequestMapping("jurisdiction")
public class SyEmpController {
    @ApiOperation("验证码图片化")
    @GetMapping(value = "/ImageCode")
    public BufferedImage  getImageCode(String code){
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
        return image;
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
}
