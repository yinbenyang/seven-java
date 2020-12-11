package com.seven.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2020-12-11 18:01
 */
public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> stringConsumer = (x) -> System.out.println("hello," + x);
        stringConsumer.accept("yinbenyang");

        Consumer<String> stringConsumer1 = (y) -> System.out.println("欢迎" + y );
        stringConsumer.andThen(stringConsumer1).accept("yby");

        IntConsumer consumer = (x) -> System.out.println(x + 100);
        consumer.accept(99);

        BiConsumer<Integer, String> biConsumer = (x, y) -> System.out.println("姓名：" + y + "，年龄:" + x);
        biConsumer.accept(24, "seven");

    }
}
