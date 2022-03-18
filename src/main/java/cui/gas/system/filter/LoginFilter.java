package cui.gas.system.filter; /**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 17:05 2022-03-17
 */

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        chain.doFilter(request, response);
    }
}
