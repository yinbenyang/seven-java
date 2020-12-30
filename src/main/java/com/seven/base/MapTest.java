package com.seven.base;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: map遍历
 * @date 2020-12-28 14:13
 */
public class MapTest {

    private static Map<String, String> maps = Maps.newHashMap();

    static {
        maps.put("1001","北京");
        maps.put("1002","天津");
        maps.put("1003","广州");
        maps.put("1004", "上海");
        maps.putIfAbsent("1001", "北京2");
    }

    public static void main(String[] args) {
        test1();test2();
    }

    public static void test1(){
        for(String m : maps.keySet()){
            System.out.println("key:" + m + ",value:" + maps.get(m));
        }
        System.out.println("--------------------------------------------------");
    }

    public static void test2(){
        Iterator<Entry<String, String>> iterator = maps.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<String, String> next = iterator.next();
            System.out.println("key:" + next.getKey() + ",value:" + next.getValue());
        }
        System.out.println("--------------------------------------------------");
    }

    public static void test3(){

    }

}
