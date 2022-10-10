package oop;

import java.math.BigDecimal;

/**
 * 使用匿名对象
 */
public class User {
    public static void main(String[] args) {
        new Phone().playCall("华为");    //创建匿名对象
    }

}

/**
 * 手机类
 */
class Phone{
    String board;
    BigDecimal price;

    public Phone(String board, BigDecimal price) {
        this.board = board;
        this.price = price;
    }

    public Phone() {
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void playCall(String board){
        System.out.println( board + "品牌手机可以打电话");
    }
}
