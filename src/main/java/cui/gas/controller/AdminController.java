package cui.gas.controller;

import cui.gas.controller.results.Result;
import cui.gas.domain.Admin;
import cui.gas.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 16:05 2022-03-07
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @PostMapping("login")
    public Result login(String username, String password){
        Admin admin=new Admin();

        Admin login = adminService.login(admin);
        return new Result(login!=null?141:140,login);
    }
}
