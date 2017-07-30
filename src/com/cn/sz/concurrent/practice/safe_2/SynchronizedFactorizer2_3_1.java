package com.cn.sz.concurrent.practice.safe_2;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @Description 2.3.1内置锁：synchronized<br>
 *              1.每个JAVA对象都可以用做一个实现同步的锁，这些锁被称为内置锁（Intrinsic lock）或监视器锁（Monitor
 *              Lock）。线程在进入同步代码块之前会自动获取锁，并且在退出同步代码块时自动释放锁，而无论是通过正常的控制路径退出，
 *              还是通过从代码块中抛出异常退出。获得内置锁的唯一途径就是进入由这个锁保护的同步代码块或方法<br>
 *              2.JAVA的内置锁相当于一种互斥体（或互斥锁），这意味着最多只有一个线程能持有这种锁，当线程A尝试获取一个由线程B持有的锁时，
 *              线程A必须等待或者阻塞，直到线程B释放这个锁。如果B永远不释放，那么A也将永远等待下去。<br>
 *              此例子的缺点:<br>
 *              1.由于service方法是一个synchronized方法，因此每次只有一个线程可以执行。这就背离了servlet框架的初衷。<br>
 *              2.当多个请求同时到达因数分解Servlet时，这些请求将排队等待处理，这种并发称为不良并发(Pool Concurrent)。
 * @author HuWeiLiang
 * @date 2017年7月29日 下午3:02:01
 */
public class SynchronizedFactorizer2_3_1 extends BaseServlet {
    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<>();

    private final AtomicReference<BigInteger[]> lastfactors = new AtomicReference<>();

    @Override
    public synchronized void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        // 这个Servlet能正确的缓存最新计算的结果，但是并发性却非常糟糕，不要这么做。
        BigInteger i = extractFromRequest(req);
        if (i.equals(lastNumber.get())) {
            encodeIntoResponse(resp, lastfactors.get());
        } else {
            BigInteger[] factors = factor(i);
            lastNumber.set(i);
            lastfactors.set(factors);
            encodeIntoResponse(resp, lastfactors.get());
        }

    }

}
