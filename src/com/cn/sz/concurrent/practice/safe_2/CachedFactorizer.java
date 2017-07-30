package com.cn.sz.concurrent.practice.safe_2;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.runner.notification.RunListener.ThreadSafe;

/**
 * 
 * @Description CachedFactorizer优点: <br>
 *              1.lastNumber,lastfactors没有使用原子变量，程序中使用了同步代码块来构造原子操作，
 *              而使用两种不同的同步机制不仅会带来混乱，也不会在性能和安全性上带来好处。<br>
 *              2.实现了简单些和并发性之间的平衡。<br>
 *              3.要判断同步代码块的合理大小，需要在各种设计需求之间进行权衡，包括安全性，简单性和性能，有时候，在简单性和性能之间会发生冲突，
 *              但二者之间可以找到合理的平衡。
 *              4.当执行时间较长的计算或者可能无法快速完成的操作时（网络I/O或控制台I/O），一定不要持有锁。
 * @author HuWeiLiang
 * @date 2017年7月30日 上午11:19:50
 */
@ThreadSafe
public class CachedFactorizer extends BaseServlet {

    private BigInteger lastNumber;

    private BigInteger[] lastfactors;

    private long hits;

    private long cacheHits;

    public synchronized long getHits() {
        return hits;
    }

    public synchronized double getCacheHitRatio() {
        return (double) cacheHits / (double) hits;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        // 这个Servlet能正确的缓存最新计算的结果，但是并发性却非常糟糕，不要这么做。
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = null;
        synchronized (this) {
            ++hits;
            if (i.equals(lastNumber)) {
                ++cacheHits;
                factors = lastfactors.clone();
            }
            if (factors == null) {
                factors = factor(i);
                synchronized (this) {
                    lastNumber = i;
                    lastfactors = factors.clone();
                }
            }
            encodeIntoResponse(resp, lastfactors);
        }

    }

}
