package com.bankaya.poke.shared;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class IpContextFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Context.ip.set(request.getRemoteAddr());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}
}