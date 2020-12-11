package com.seven.lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2020-12-11 17:55
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "444";
        String s = stringSupplier.get();
        System.out.println(s);

        Supplier<Double> doubleSupplier = () -> 45d;
        System.out.println(doubleSupplier.get());

        IntSupplier supplier = () -> 100;
        System.out.println(supplier.getAsInt());

    }



}
