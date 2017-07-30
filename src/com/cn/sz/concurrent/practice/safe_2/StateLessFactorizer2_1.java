package com.cn.sz.concurrent.practice.safe_2;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.runner.notification.RunListener.ThreadSafe;

/**
 * 
 * @Descriptionb 2.1什么是线程安全:<br>
 *               1.线程安全的定义：当多个线程访问某个类时，不管运行时环境采用何种调度方式或者这些线程将如何交替执行，
 *               并且在主调代码中不需要任何额外的同步或协同，这个类都能表现出正确的行为，那么就称这个类是线程安全的。<br>
 *               2.StateLessFactorizer是无状态的：它不包含任何域，也不包含任何对其它类中域的引用。
 *               计算中的临时状态仅存在与线程栈上的局部变量中，并且只能由执行的线程访问。
 *               访问StateLessFactorizer的线程不会影响另一个访问同一个StateLessFactorizer的线程计算结果，
 *               因为这两个线程并没有共享状态，就好像它们都在访问不同的实例。 由于线程访问无状态对象的行为不会影响其它线程中操作的正确性，
 *               因此无状态对象是线程安全的。 <br>
 *               3.总结：无状态对象一定是线程安全的。
 * 
 * @author HuWeiLiang
 * @date 2017年7月29日 下午12:04:06
 */
@ThreadSafe
public class StateLessFactorizer2_1 extends BaseServlet {
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        encodeIntoResponse(resp, factors);
    }

 

}
