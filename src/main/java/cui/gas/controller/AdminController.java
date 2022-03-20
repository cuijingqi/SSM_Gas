package cui.gas.controller;

import cui.gas.controller.results.Result;
import cui.gas.domain.Admin;
import cui.gas.domain.Employee;
import cui.gas.service.AdminService;
import cui.gas.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 16:05 2022-03-07
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @Resource
    private EmployeeService employeeService;
    @PostMapping("login")
    @ResponseBody
    public Result login(HttpServletRequest request,HttpServletResponse response,@RequestBody Map data){
        Integer roleId = Integer.parseInt( (String) data.get("roleId"));
        String username = (String) data.get("username");
        String password = (String) data.get("password");
        HttpSession session = request.getSession();
        session.setAttribute("roleId",roleId);
        if (roleId==1){
            Admin admin=new Admin();
            admin.setAusername(username);
            admin.setApassword(password);
            Admin login = adminService.login(admin);
            session.setAttribute("admin",login);
            if (login!=null){
                return new Result(0,login,"login successful!");
            }else {
                return new Result(1,"login failure!");
            }
        }else if (roleId==2){
            Employee employee = new Employee();
            employee.setEusername(username);
            employee.setEpassword(password);
            Employee login = employeeService.login(employee);
            session.setAttribute("admin",login);
            if (login!=null){
                return new Result(0,login,"login successful!");
            }else {
                return new Result(1,"login failure!");
            }
        }
        return new Result(1,"login failure!");

    }
    @GetMapping("quit")
    @ResponseBody
    public Result quit(HttpServletRequest request){
        String aid = request.getParameter("aid");
        String eid = request.getParameter("eid");
        request.getSession().removeAttribute("admin");
        request.getSession().removeAttribute("roleId");
        return new Result(0);
    }
    @RequestMapping("{one}")
    public String distribute(HttpServletRequest request,HttpServletResponse response,@PathVariable("one") String one) throws ServletException, IOException {
        //request.getRequestDispatcher("/page/"+one+"/"+two+".html").forward(request, response);
        return one;
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
