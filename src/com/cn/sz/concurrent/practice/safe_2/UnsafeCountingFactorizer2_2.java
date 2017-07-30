package com.cn.sz.concurrent.practice.safe_2;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 
 * @Description 2.2原子性，想要实现一个访问计数<br>
 * 1.UnsafeCountingFactorizer2_2不是线程安全的<br>
 * 2.count++非原子操作，count++（读取-修改-写入）多线程中存在竞态条件RaceCondition
 * @author HuWeiLiang
 * @date 2017年7月29日 下午1:29:41
 */
public class UnsafeCountingFactorizer2_2 extends BaseServlet {

    private long count=0;
    
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        ++count;
        encodeIntoResponse(resp, factors);
    }

}
