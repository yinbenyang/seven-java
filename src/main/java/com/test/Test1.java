package com.test;


/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2020-11-25 11:13
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 inc = new Test1();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);

    }
    void fermin(int i){
        i++;
    }
}
