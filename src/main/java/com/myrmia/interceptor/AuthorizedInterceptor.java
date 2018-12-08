package com.myrmia.interceptor;

import com.myrmia.model.UsersDO;
import com.myrmia.service.UsersService;
import com.myrmia.utils.cookie.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** auto login interceptor
 * Created by Ellery on 2018/12/8.
 */
public class AuthorizedInterceptor implements HandlerInterceptor {

    @Resource
    private CookieUtils cookieUtils;

    private UsersService usersService;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object o) throws Exception {

        // 加密后用户名和密码的 cookie 名称
        String cookieNameEncrypt = cookieUtils.getEncryptName("MyrmiaCookieName");
        String cookiePassEncrypt = cookieUtils.getEncryptName("MyrmiaCookiePass");

        Cookie cookieName = cookieUtils.getCookieByName(request, cookieNameEncrypt);
        Cookie cookiePass = cookieUtils.getCookieByName(request, cookiePassEncrypt);

        if (cookieName != null && cookiePass != null &&
                !"".equals(cookieName.getValue()) && !"".equals(cookiePass.getValue())) {
            String adminName = cookieName.getValue();
            String adminPwdEncrypted = cookiePass.getValue();

            UsersDO usersDO = usersService.queryUsersByName(adminName);

            if (usersDO != null) {
                String tempPwd = cookieUtils.getEncryptValue(usersDO.getPassword());
                if (adminPwdEncrypted.equals(tempPwd)) {
                    // cookie 正确
                    System.out.println("auto login.");
                    request.getSession(true).setAttribute("usersDO", usersDO);
                }
            }
        } else {
            System.out.println("[error] cookie 不存在或不正确，需重新登陆");
            response.sendRedirect(request.getContextPath() + "/admin/login");
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}
