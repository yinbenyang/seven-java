package com.seven.lambda;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2020-12-11 18:24
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> stringPredicate = (x) -> StringUtils.equals(x,"yinbenyang");
        System.out.println(stringPredicate.test("yby"));

        Predicate<String> stringPredicate1 = (x) -> StringUtils.equals(x,"yby");
        System.out.println(stringPredicate1.test("yby"));

        System.out.println(stringPredicate.and(stringPredicate1).test("yby"));
        System.out.println(stringPredicate.or(stringPredicate1).test("yby"));

        System.out.println(stringPredicate.negate().test("yby"));

        IntPredicate intPredicate = (x) -> x > 10;
        System.out.println(intPredicate.test(20));

        BiPredicate<Integer, String> biPredicate = (x, y) -> StringUtils.equals(y, "yby") ? x > 10 : x > 20 ;
        System.out.println(biPredicate.test(15,"test"));
        System.out.println(biPredicate.test(15,"yby"));
    }

}
