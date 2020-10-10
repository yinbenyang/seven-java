package com.seven.base;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: 单例模式
 * @date 2020-10-09 17:44
 */
public class SingletonPattern {

    public static void main(String[] args) {
        SingletonPattern1 pattern1 = SingletonPattern1.getInstance();
        SingletonPattern1 pattern1_1 = SingletonPattern1.getInstance();
        System.out.println(pattern1);
        System.out.println(pattern1_1);
        SingletonPattern4 pattern4 = SingletonPattern4.getInstance();
        SingletonPattern4 pattern4_4 = SingletonPattern4.getInstance();
        System.out.println(pattern4);
        System.out.println(pattern4_4);
        SingletonPattern5 pattern5 = SingletonPattern5.INSTANCE;
        SingletonPattern5 pattern5_5 = SingletonPattern5.INSTANCE;
        pattern5.anyMethod();
        pattern5_5.anyMethod();
    }


}

/**
 * @description: 饿汉式（线程安全；类加载就初始化实例，可能内存浪费。）
 * @author yinbenyang
 * @date 2020-10-10 09:56
 * @version 1.0
 */
class SingletonPattern1{

    private final static SingletonPattern1 INSTANCE = new SingletonPattern1();

    private SingletonPattern1(){

    }

    public static SingletonPattern1 getInstance(){
        return INSTANCE;
    }

}

/**
 * @description: 懒汉式（线程不安全；第一次使用才会初始化实例）
 * @author yinbenyang
 * @date 2020-10-10 09:59
 * @version 1.0
 */
class SingletonPattern2{
    private static SingletonPattern2 instance = null;

    private SingletonPattern2(){

    }

    public static SingletonPattern2 getInstance(){
        if(instance == null){
            instance = new SingletonPattern2();
        }
        return instance;
    }
}

/**
 * @description: 双重检查懒汉式（double check线程安全；第一次使用才会初始化实例）
 * @author yinbenyang
 * @date 2020-10-10 10:09
 * @version 1.0
 */
class SingletonPattern3{
    private static volatile SingletonPattern3 instance;

    private SingletonPattern3(){

    }

    public static SingletonPattern3 getInstance(){
        if(instance == null){
            synchronized (SingletonPattern3.class){
                if(instance == null){
                    instance = new SingletonPattern3();
                }
            }
        }
        return instance;
    }
}

/**
 * @description: 静态内部类
 * @author yinbenyang
 * @date 2020-10-10 10:13
 * @version 1.0
 */
class SingletonPattern4{

    private SingletonPattern4(){

    }

    private static class SingletonPatternInstance{
        private static final SingletonPattern4 INSTANCE = new SingletonPattern4();
    }

    public static SingletonPattern4 getInstance(){
        return SingletonPatternInstance.INSTANCE;
    }
}

/**
 * @description: 枚举方式
 * @author yinbenyang
 * @date 2020-10-10 11:09
 * @version 1.0
 */
enum SingletonPattern5{
    INSTANCE;

    public void anyMethod(){
        System.out.println("anyMethod");
    }
}

