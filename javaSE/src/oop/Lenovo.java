package oop;

/**
 * 联想电脑
 */
public class Lenovo extends Computer {

    //重新父类方法
    @Override
    public void get() {
        super.setBoard("全国都在用的联想");
        super.setModel("isul");
        System.out.println(super.getBoard()+super.getModel());
    }

    /**
     * 玩游戏的方法   子类特有的方法
     * @param game
     */
    public void play(String game){
        System.out.println("游戏的名字叫做"+game);
    }

    /**
     * 多态的特点:
     * 1。没有继承就没有多态
     * 2。多态是方法的多态，属性没有多态
     * 3.父类引用指向子类
     *
     * 面向对象三大特征的作用：  1.封装，用作保护属性，   2.继承，提高代码的重用率      3、多态 提高代码的可扩展性
     */

    public static void main(String[] args) {
        Computer computer=new Computer();
        Computer computer_=new Lenovo();
        computer.get();

        //类型判断使用instanceof，
        Object object = new Computer();
        if (object instanceof  Computer){
            System.out.println("Object类型为一个Computer类型");
        }
        Computer computer1=new Lenovo();   //向上转型
        if (computer1 instanceof Lenovo){
            //向下转型调用子类的方法
            ((Lenovo) computer1).play("王者荣耀");
        }


    }
}
