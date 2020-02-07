package com.xr.boot.controller.basicPackage;

import com.xr.boot.entity.BasAssociateMember;
import com.xr.boot.service.basicPackage.BasAssociatememberService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basAssociateMemberController")
@Slf4j
public class BasAssociateMemberController {
    @Autowired
    private BasAssociatememberService basAssociatememberService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/findBasAssociateMember")
    public Object findBasAssociateMember() {
        Object findBasAssociateMember = null;
        if (redisUtil.hasKey("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember")) {
            log.debug("从redis中取出值");
            return redisUtil.get("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
        } else {
            try {
                findBasAssociateMember = basAssociatememberService.findBasAssociateMember();
                return findBasAssociateMember;
            } catch (Exception e) {
                log.info("获取数据库资源异常。。。。");
                return null;
            }
        }
    }
    @PostMapping("/upBasAssociateMemberById")
    public int upBasAssociateMemberById(BasAssociateMember basAssociateMember){
        basAssociatememberService.upBasAssociateMemberById(basAssociateMember);
        redisUtil.del("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
        return 1;
    }
    @PostMapping("/saveBasAssociateMember")
    public int saveBasAssociateMember(BasAssociateMember basAssociateMember){
        List<String> member = basAssociatememberService.findBasAssociateMemberByEmpNo(basAssociateMember);
        if(member.size()>0){
            return 0;
        }
        basAssociatememberService.saveBasAssociateMember(basAssociateMember);
        redisUtil.del("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
        return 1;
    }
    @PostMapping("/delBasAssociateMemberById")
    public int delBasAssociateMemberById(BasAssociateMember basAssociateMember){
       basAssociatememberService.delBasAssociateMemberById(basAssociateMember);
        redisUtil.del("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
        return 1;
    }
}
