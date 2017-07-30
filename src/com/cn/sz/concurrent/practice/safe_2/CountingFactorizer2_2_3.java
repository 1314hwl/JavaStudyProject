package com.cn.sz.concurrent.practice.safe_2;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.runner.notification.RunListener.ThreadSafe;
/**
 * 
 * @Description 2.2.3复合操作<br>
 * 1.使用Atomic类型的变量，在java.util.concurrent.atomic包中包含一些原子变量类，确保原子性。
 * 2.在实际情况中，应该尽可能的使用现有的线程安全对象（如atomic）来管理类的状态，与非线程安全的对象相比，判断线程安全对象的可能状态及其状态转换情况要更为容易，从而也更容易维护和验证线程的安全性。
 * @author HuWeiLiang
 * @date 2017年7月29日 下午1:48:11
 */
@ThreadSafe
public class CountingFactorizer2_2_3 extends BaseServlet {

    private final AtomicLong count = new AtomicLong();

    public long getCount() {
        return count.get();
    }


    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        count.incrementAndGet();
        encodeIntoResponse(resp, factors);
    }

}
