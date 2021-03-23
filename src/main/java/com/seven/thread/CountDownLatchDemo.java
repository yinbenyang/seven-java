package com.seven.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021-01-08 12:00
 */
public class CountDownLatchDemo {

    static AtomicInteger count = new AtomicInteger(0);
    static CountDownLatch countDown = new CountDownLatch(1000);

    public static void main(String[] args) {
        try {
            SubCountDownLatch latch = new SubCountDownLatch();
            for(int i = 0; i< 1000 ; i++){
                new Thread(latch).start();
            }

            countDown.await();
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static class SubCountDownLatch implements Runnable{

        private void count(){
            for(int i = 0; i < 1000; i++){
                count.addAndGet(1);
            }
        }

        @Override
        public void run() {
            count();
            countDown.countDown();
        }
    }

}
