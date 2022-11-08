package oop;

/**
 * 多态关系 计算机类
 */
public class Computer {
    private String board;
    private String model;

    public Computer(String board, String model) {
        this.board = board;
        this.model = model;
    }

    public Computer(){

    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void get(){
        System.out.println("电脑类");
    }
}
