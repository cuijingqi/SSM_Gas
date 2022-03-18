package cui.gas.controller;

import cui.gas.controller.results.Result;
import cui.gas.domain.Admin;
import cui.gas.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 16:05 2022-03-07
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @PostMapping("login")
    public Result login(HttpServletRequest request,HttpServletResponse response){
        Admin admin=new Admin();
        Admin login = adminService.login(admin);
        if (true){
            return new Result(0);
        }else {
            request.setAttribute("msg", "fail");
        }

        return new Result(login!=null?141:140,login);
    }
    @PostMapping("quit")
    public Result quit(){
//        HttpServletResponse response = ServletActionContext.getResponse();
//        HttpServletRequest request = ServletActionContext.getRequest();
//        response.setContentType("text/html;charset=utf-8");
//        request.getSession().removeAttribute("admin");
//        return NONE;
        return new Result(0);
    }
    @RequestMapping("{one}/{two}")
    public String distribute(HttpServletRequest request,HttpServletResponse response,@PathVariable("one") String one,@PathVariable("two") String two) throws ServletException, IOException {
            //request.getRequestDispatcher("/page/"+one+"/"+two+".html").forward(request, response);
        return one+"/"+two;
    }
    @RequestMapping("{one}/{two}/{three}")
    public String distribute(HttpServletRequest request,HttpServletResponse response,@PathVariable("one") String one,@PathVariable("two") String two,@PathVariable("three") String three) throws ServletException, IOException {
        //request.getRequestDispatcher("/page/"+one+"/"+two+"/"+three+".html").forward(request, response);
        return one+"/"+two+"/"+three;
    }
}
