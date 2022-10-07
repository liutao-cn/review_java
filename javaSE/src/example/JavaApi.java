package example;

/**
 * 自定义生成javaApi文档
 * @version 1.1 版本
 * @author liutao   作者
 * @since 1.8  jdk版本
 */
public class JavaApi {

    //名字
    private String name;

    /**
     * @since 1.8
     * @param name 输入名称
     * @return 返回名称
     */
    public String getName(String name) {
        return name;
    }


    public static void main(String[] args) {
        //打印乘法表
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

        System.out.println("=================================");
        //打印三角形
        for (int i = 0; i < 5; i++) {        //外循环控制行，内循环控制个数
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
