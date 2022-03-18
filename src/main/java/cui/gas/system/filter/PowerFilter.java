package cui.gas.system.filter;


import cui.gas.domain.Admin;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class PowerFilter implements Filter {
    /**
     * 需要排除的页面
     */

    private String excludedPages;
    private String[] excludedPageArray;
    private String ones;
    private String[] oneArray;
    private String twos;
    private String[] twoArray;
    private String threes;
    private String[] threeArray;
    private String fours;
    private String[] fourArray;
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String reqServletPath = req.getServletPath();
        System.out.println(reqServletPath);
        HttpSession session = req.getSession();
        if (reqServletPath.endsWith(".css") || reqServletPath.endsWith(".js")|| reqServletPath.endsWith(".jpg")|| reqServletPath.endsWith(".png")|| reqServletPath.endsWith(".ico")|| reqServletPath.endsWith(".json")) {
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            boolean isExcludedPage = false;
            String servletPath = reqServletPath.replace("//", "");
            System.out.println(servletPath);
            for (String page : excludedPageArray) {//判断是否在过滤url之外
                if(servletPath.equals(page)){
                    isExcludedPage = true;
                    break;
                }
            }
            if (isExcludedPage){
                filterChain.doFilter(servletRequest, servletResponse);
            }else {
                Admin admin = (Admin) session.getAttribute("admin");
                if (admin != null && !String.valueOf(admin.getAid()).trim().equals("")) {
                    if (admin.getRoleId().getRid()==0){
                        // 如果现在存在了session，则请求向下继续传递
                        filterChain.doFilter(servletRequest, servletResponse);
                    }else if (admin.getRoleId().getRid()==1){

                    }else if(admin.getRoleId().getRid()==2){

                    }else if(admin.getRoleId().getRid()==3){

                    }else{
                        // 跳转到提示登陆页面
                        servletRequest.getRequestDispatcher("/login.html").forward(servletRequest, servletResponse);
                    }
                } else {
                    // 跳转到提示登陆页面
                    servletRequest.getRequestDispatcher("/login.html").forward(servletRequest, servletResponse);
                }
            }
        }

    }


    @Override
    public void destroy() {

    }

    /**
     * 初始化函数，获取需要排除在外的url
     */

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        excludedPages = fConfig.getInitParameter("excludedPages");
        if (StringUtils.isNotEmpty(excludedPages)) {
            excludedPageArray = excludedPages.split(",");
        }
        ones = fConfig.getInitParameter("one");
        if (StringUtils.isNotEmpty(ones)) {
            oneArray = ones.split(",");
        }
        twos = fConfig.getInitParameter("two");
        if (StringUtils.isNotEmpty(twos)) {
            twoArray = twos.split(",");
        }
        threes = fConfig.getInitParameter("three");
        if (StringUtils.isNotEmpty(threes)) {
            threeArray = threes.split(",");
        }
        fours = fConfig.getInitParameter("four");
        if (StringUtils.isNotEmpty(fours)) {
            fourArray = fours.split(",");
        }
        return;
    }
}
