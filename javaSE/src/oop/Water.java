package oop;

/**
 * static学习
 */
public class Water {

    {
        System.out.println("匿名代码块");     //类被创建的时候同时产生，一般用作赋予初始值
    }

    static {
        System.out.println("静态代码块");     //类创建之前执行，只会被执行一次
    }

    //无参构造
    public Water() {
        System.out.println("无参构造");    //构建类的时候调用该方法
    }

    public static void main(String[] args) {
        Water water=new Water();    //静态代码块执行一次后，下面的类是不会在调用静态代码块，同一个类的情况下

        Water water2=new Water();
    }
}
