package demo;

public class Computer {
    public void powerOn() {
        System.out.println("打开电脑");
    }

    public void powerOff() {
        System.out.println("关闭电脑");
    }

    public void useDevice(IUSB iusb) {
        iusb.openDevice();
        if (iusb instanceof Mouse) {
            Mouse mouse = (Mouse)iusb;
            mouse.click();
        } else if (iusb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard)iusb;
            keyboard.input();
        }
        iusb.closeDevice();
    }
}
