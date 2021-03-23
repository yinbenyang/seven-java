package com.seven.thread;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021-01-08 12:27
 */
public class VolatileDemo {
    // 验证可见性
    public static void main(String[] args) {
        MyData myData = new MyData();
        new Thread("AAA") {
            public void run() {
                try {
                    Thread.sleep(3000);
                    // 睡3秒后调用changeNumber方法将number改为60
                    System.err.println(Thread.currentThread().getName()
                            +  " update number to " + myData.changeNumber());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();
        // 主线程
        while (myData.number == 0) {
            System.out.println("数据没有改变");
        }
        // 如果主线程读取到的一直都是最开始的0，
        //将造成死循环，这句话将无法输出
        System.err.println(Thread.currentThread().getName()
                + " get number value is " + myData.number);
    }
}

// 验证可见性
class MyData {
    int number = 0; // 没加volatile关键字
//    volatile int number = 0;
    int changeNumber() {
        return this.number = 60;
    }
}
