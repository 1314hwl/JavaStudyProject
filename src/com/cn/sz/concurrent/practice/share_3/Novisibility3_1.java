package com.cn.sz.concurrent.practice.share_3;

/**
 * 
 * @Description 3.1可见性 Reordering<br>
 *              1.Novisibility3_1可能会持续循环下去，因为读线程可能永远看不到ready的值。<br>
 *              2.Novisibility3_1可能输出0，因为读线程可能看到了写入ready的值。但却没有看到number的值<br>
 *              3.Novisibility3_1只要在某个线程中无法检测到重排序情况，那么就无法确保线程中的操作按照程序中指定的顺序来执行。
 *              当线程首先写入number，然后在没有同步的情况下写入ready,那么读线程看到的排序可能与写入的顺序完全相反。
 *              4.总结：在没有同步的情况下，编译器，处理器以及运行时等都可能对操作的执行顺序进行一些意想不到的调整。
 *              在缺乏足够同步的多线程程序中，要想对内存操作的执行顺序进行判断，几乎无法得出正确的结论。
 * @author HuWeiLiang
 * @date 2017年7月30日 下午3:42:02
 */
public class Novisibility3_1 {
    private static boolean ready;

    private static int number;

    public static void main(String[] args) {
        new ReaderThead().start();
        number = 42;
        ready = true;
    }

    private static class ReaderThead extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
                System.out.println("number:" + number);
            }
        }

    }

}
