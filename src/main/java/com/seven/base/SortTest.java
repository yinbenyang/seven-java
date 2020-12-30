package com.seven.base;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: 排序
 * @date 2020-12-28 14:13
 */
public class SortTest {

    private static int[] arrs = new int[]{5,1,9,2,7,3,34,13,8};

    static {
        List<Integer> list = Lists.newArrayList();
        for(int i = 1; i<= 1000; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        arrs = list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        bubbleSort();
        selectionSort();
        System.out.println((System.currentTimeMillis() - start));
    }

    /**
     * @description: 冒泡排序，依次比较两个相邻数据的大小，将大数往后移
     * @author yinbenyang
     * @date 2020-12-30 14:11
     * @version 1.0
     */
    public static void bubbleSort(){
        for(int i = 0; i < arrs.length; i ++){
            for(int j = 0; j < arrs.length - 1 - i; j ++){
                if(arrs[j] > arrs[j+1]){
                    arrs[j] = arrs[j] + arrs[j+1];
                    arrs[j+1] = arrs[j] - arrs[j+1];
                    arrs[j] = arrs[j] - arrs[j+1];
                }
            }
//            Arrays.stream(arrs).forEach((a) -> System.out.print(a + "\t"));
//            System.out.println();
        }
//        Arrays.stream(arrs).forEach(System.out::println);
        System.out.println(Arrays.toString(arrs));
    }

    /**
     * @description: 选择排序，找最小的数下标，然后进行数据交换
     * @author yinbenyang
     * @date 2020-12-30 14:19
     * @version 1.0
     */
    public static void selectionSort(){
        for(int i = 0; i < arrs.length; i++){
            int minIndex = i;
            for(int j = i; j < arrs.length; j ++){
                if(arrs[minIndex] > arrs[j]){
                    minIndex = j;
                }
            }
            arrs[i] = arrs[i] + arrs[minIndex];
            arrs[minIndex] = arrs[i] - arrs[minIndex];
            arrs[i] = arrs[i] - arrs[minIndex];
        }
        System.out.println(Arrays.toString(arrs));
    }

}
