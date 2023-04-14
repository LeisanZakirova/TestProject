package com.example.testproject.web.config.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;


public class MySimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

        protected Log logger = LogFactory.getLog(this.getClass());

        private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
        public void onAuthenticationSuccess(HttpServletRequest request,
                                            HttpServletResponse response, Authentication authentication)
                throws IOException {

            handle(request, response, authentication);
            clearAuthenticationAttributes(request);
        }

    protected void handle(HttpServletRequest request,
                          HttpServletResponse response, Authentication authentication)
            throws IOException {

        String targetUrl = determineTargetUrl(authentication);

        if (response.isCommitted()) {
            logger.debug(
                    "Response has already been committed. Unable to redirect to "
                            + targetUrl);
            return;
        }

        redirectStrategy.sendRedirect(request, response, targetUrl);
    }

    protected String determineTargetUrl(Authentication authentication) {
        boolean isUser = false;
        boolean isAdmin = false;

        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (final GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals("USER")) {
                isUser = true;
                break;
            } else if (grantedAuthority.getAuthority().equals("ADMIN")) {
                isAdmin = true;
                break;
            }
        }
        if (isUser) {
            return "/pageForUser";
        } else if (isAdmin) {
            //return "Admin.html";              //не может найти страницу (выскакивает ошибка 404)
            //return "PageForAdmin";            //не может найти страницу (выскакивает ошибка 404)
            //return "PageForAdmin.ftlh";       //не может найти страницу (выскакивает ошибка 404)
            //return "redirect:/pageForAdmin";  //ничего не происходит вообще (мы остаемся на той же странице: /signIn)
            return "/pageForAdmin";
        } else {
            throw new IllegalStateException();
        }
    }

        protected void clearAuthenticationAttributes(HttpServletRequest request) {
            HttpSession session = request.getSession(false);
            if (session == null) {
                return;
            }
            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        }

        public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
            this.redirectStrategy = redirectStrategy;
        }
        protected RedirectStrategy getRedirectStrategy() {
            return redirectStrategy;
        }
}

