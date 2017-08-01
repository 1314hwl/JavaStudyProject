package com.cn.sz.concurrent.practice.share_3;

/**
 * 
 * @Description 3.1.1 失效数据<br>
 *              1.如果某个线程调用了set,那么另一个正在调用get的线程可能会看到更新之后的value值，也可能看不到，失效了；<br>
 *              2.加锁的含义不仅仅局限于互斥行为，还包括内存可见性。为了确保所有的线程都能看到共享数据的最新值，所有执行读操作或者写操作的线程都必须在同一个锁上同步。
 * @author HuWeiLiang
 * @date 2017年7月30日 下午3:58:50
 */
public class MutableInteger3_1_1 {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
//    public synchronized int getValue() {
//        return value;
//    }
//
//    public synchronized void setValue(int value) {
//        this.value = value;
//    }

}
