package demo;

public class Keyboard implements IUSB{
    @Override
    public void openDevice(){
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice(){
        System.out.println("关闭键盘");
    }

    public void input(){
        System.out.println("键盘输入");
    }
}
