package oop;

/**
 * 抽象类
 */
public abstract class Action {

    /**
     * 抽象方法，不存在方法体，需通过子类继承抽象类实现该抽象方法
     * @param name
     * @return
     */
    public abstract String getName(String name);

    /**
     * 抽象类中可以自定义方法，存在方法体可以实现
     * @param number
     * @return
     */
    public String getNumber(int number){
        return "数量为"+number;
    }
}

/**
 * 子类，继承抽象类
 */
class Movie extends Action{

    public Movie() {
    }

    //实现抽象类中的抽象方法
    @Override
    public String getName(String name) {
        return "我的名字为"+name;
    }

    //本类中的方法
    public String getNumber1(){
        return "-----------------";
    }


    public static void main(String[] args) {
        Action action = new Movie();

        System.out.println(action.getName("小明"));
        System.out.println(action.getNumber(12));

        Movie m= (Movie)action;    //转换成子类
        System.out.println(m.getNumber1());
    }
}
