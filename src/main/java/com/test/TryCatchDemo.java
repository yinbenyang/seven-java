package com.test;

import com.google.common.collect.Lists;
import java.util.ArrayList;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: 测试try...catch...finally...return
 * @date 2021-01-08 18:14
 */
public class TryCatchDemo {

    public static void main(String[] args) {
        TryCatchDemo demo = new TryCatchDemo();
        System.out.println(demo.test1());
        System.out.println();
        System.out.println(demo.test2());
        System.out.println();
        System.out.println(demo.test3());
        System.out.println();
        System.out.println(demo.test4());
    }

    /**
     * @description: try中带有return
     * @param:
     * @return: int
     * @author yinbenyang
     * @date: 2021-01-08 18:20
     */
    private int test1(){
        int i = 1;
        try {
            i ++;
            System.out.println("try:" + i);
            return i;
        }catch (Exception e){
            i ++;
            System.out.println("catch:" + i);
        }finally {
            i ++;
            System.out.println("finally:" + i);
        }
        System.out.println("out:" + i);
        return i;
    }

    /**
     * @description: catch中带有return
     * @param:
     * @return: int
     * @author yinbenyang
     * @date: 2021-01-08 18:20
     */
    private int test2(){
        int i = 1;
        try {
            i ++;
            System.out.println("try:" + i);
            int x = i / 0;
        }catch (Exception e){
            i ++;
            System.out.println("catch:" + i);
            return i;
        }finally {
            i ++;
            System.out.println("finally:" + i);
        }
        System.out.println("out:" + i);
        return i;
    }

    /**
     * @description: finally中带有return
     * @param:
     * @return: int
     * @author yinbenyang
     * @date: 2021-01-08 18:20
     */
    private int test3(){
        int i = 1;
        try {
            i ++;
            System.out.println("try:" + i);
            return i;
        }catch (Exception e){
            i ++;
            System.out.println("catch:" + i);
            return i;
        }finally {
            i ++;
            System.out.println("finally:" + i);
            return i;
        }
    }

    private ArrayList<Integer> test4(){
        ArrayList<Integer> list = Lists.newArrayList();
        list.add(1);
        try {
            list.add(2);
            System.out.println("try:" + list.toString());
            return list;
        }catch (Exception e){
            list.add(3);
            System.out.println("catch:" + list.toString());
        }finally {
            list.add(4);
            System.out.println("finally:" + list.toString());
        }
        System.out.println("out:" + list.toString());
        return list;
    }

}
