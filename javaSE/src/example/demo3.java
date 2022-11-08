package example;

/**
 *递归算法
 */
public class demo3 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    /**
     * 递归方法 阶乘模式
     * @param num 参数
     * @return
     */
    public static int f(int num){
        if (num ==1){
            return 1;
        }else {
            return num*f(num-1);
        }
    }
}
