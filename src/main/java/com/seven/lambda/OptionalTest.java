package com.seven.lambda;

import java.util.Optional;
import java.util.OptionalLong;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2020-12-14 11:31
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional optional = Optional.empty();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("option is null");
        }
        int i = 3;
        switch (i) {
            case 2:
                System.out.println(2);
                break;
            case 3:
            case 10:
                System.out.println("3或者10");
                break;
            default:
                System.out.println("default");
        }

//        OptionalLong optionalLong = OptionalLong.of(88);
//        System.out.println(optionalLong.getAsLong());

    }

}
