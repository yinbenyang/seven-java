package com.seven.lambda;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2020-12-11 18:14
 */
public class FunctionTest {

    public static void main(String[] args) {
        Function<Integer, String> stringFunction = (x) -> "你的年龄是：" + x;
        System.out.println(stringFunction.apply(31));

        IntFunction<Boolean> intFunction = (y) -> y > 30;
        System.out.println(intFunction.apply(90));

        Function<Object, Object> identity = Function.identity();
        System.out.println(identity.apply("456"));

        BiFunction<Integer, Integer, Boolean> biFunction = (x,y) -> x > y;
        System.out.println(biFunction.apply(10,20));


    }

}
