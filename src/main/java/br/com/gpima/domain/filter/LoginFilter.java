/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gpima.domain.filter;

import br.com.gpima.domain.Login;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/pages/*")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest requisicao, ServletResponse resposta, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) requisicao;
        HttpServletResponse response = (HttpServletResponse) resposta;
        HttpSession session = request.getSession();
        Login login = (Login) session.getAttribute("login");
        if (login == null) {
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.xhtml");
//            dispatcher.forward(request, response);
            response.sendRedirect("gpima/index.xhtml");
            chain.doFilter(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {}

    
    
}
