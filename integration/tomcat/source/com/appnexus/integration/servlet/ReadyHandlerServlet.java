package com.appnexus.integration.servlet;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Ira Klotzko
 * Date: Apr 28, 2009
 * Time: 4:05:15 PM
 *
 * // returns 1 when called
 */
public class ReadyHandlerServlet extends HttpServlet {

    private static final Logger LOG = Logger.getLogger(ReadyHandlerServlet.class);
    @Override
    protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        LOG.debug("service:==> ready handler is being called");
        httpServletResponse.getWriter().write("1");
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        LOG.debug("doGet:==> ready handler is being called");
        httpServletResponse.getWriter().write("1");
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        LOG.debug("doPost:==> ready handler is being called");
        httpServletResponse.getWriter().write("1");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        LOG.debug("service(simple):==> ready handler is being called");
        servletResponse.getWriter().write("1");
    }
}
