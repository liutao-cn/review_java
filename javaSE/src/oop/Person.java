package oop;

/**
 * 人类
 */
public class Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
    }
}

/**
 * 学生类
 */
class Student{
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    /**
     * 吃
     */
    public void eat(){
        System.out.println("吃饭");
    }
}
