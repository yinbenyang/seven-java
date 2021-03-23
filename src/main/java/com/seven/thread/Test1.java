package com.seven.thread;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021-01-27 10:54
 */
public class Test1 implements Runnable{

    private int i = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("test1");
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println("111");
        new Thread(test1).run();
        System.out.println("222");
    }
}
