package example;

/**
 * 自增自减的注意事项，以及左移与右移的注意事项
 */
public class demo1 {
    public static void main(String[] args) {
        int num=1;
        int num2=num++;     //先执行完这行代码后在给num2赋值，然后在自增
        System.out.println(num2);

        int num3=3;
        int num4=++num3;       //执行完这行代码后，先自增在给NUM4赋值
        System.out.println(num4);


        System.out.println(2<<3);   // << 左移为*2  实列中为3个左移，等同为2的3次方
        System.out.println(8>>2);   // >> 右移为 /2  实列中为2个右移，等同为8/4
    }
}
