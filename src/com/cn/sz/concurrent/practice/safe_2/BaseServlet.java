package com.cn.sz.concurrent.practice.safe_2;

import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class BaseServlet implements Servlet {

    @Override
    public void init(ServletConfig arg0) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    protected void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {

    }

    protected BigInteger[] factor(BigInteger i) {
        return null;
    }

    protected BigInteger extractFromRequest(ServletRequest req) {
        return null;
    }
}
