package com.cn.sz.concurrent.practice.safe_2;

/**
 * 
 * @Description 2.3.2重入<br>
 *              1.如果一个线程试图获得一个已经由它自己持有的锁，那么这个请求就会成功。<br>
 *              2.重入原理：为每个锁关联一个获取计数值和一个所有者线程。当计数值为0时，这个锁就被认为是没有被任何线程持有。
 *              当线程请求一个未被持有的锁时，JVM将记下锁持有者，并且将获取计数值置为1。如果同一个线程再次获取这个锁，计数值将递增，
 *              当线程退出同步代码块时，计数器会相应的递减。当计数值为0时，这个锁将被释放。<br>
 *              3.重入可以避免死锁。
 *              
 * @author HuWeiLiang
 * @date 2017年7月30日 上午10:37:41
 */
public class ReEnter2_3_2 {
    public static void main(String[] args) {
        LoggingWidget loggingWidget = new LoggingWidget();
        loggingWidget.doSomething();
    }

}

class Widget {
    public synchronized void doSomething() {

    }

}

class LoggingWidget extends Widget {

    @Override
    public synchronized void doSomething() {
        // TODO Auto-generated method stub
        super.doSomething();
    }
}
