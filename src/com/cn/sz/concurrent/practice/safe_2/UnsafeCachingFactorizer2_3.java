package com.cn.sz.concurrent.practice.safe_2;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @Description 2.3加锁机制<br>
 *              1.此例中尽管对set方法的每次调用都是原子的，但仍然无法同时更新lastNumber和lastFactors,
 *              如果只修改了其中一个变量，那么在这两次修改操作之间，其他线程将发现不变性条件被破坏。<br>
 *              2.要保持状态的一致性，就需要在单个的原子操作中更新所有相关的状态变量。
 * @author HuWeiLiang
 * @date 2017年7月29日 下午3:02:01
 */
public class UnsafeCachingFactorizer2_3 extends BaseServlet {
    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<>();

    private final AtomicReference<BigInteger[]> lastfactors = new AtomicReference<>();

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
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
