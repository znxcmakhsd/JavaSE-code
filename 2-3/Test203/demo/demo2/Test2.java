package SE.Test203.demo.demo2;

import SE.Test203.demo.Test;

public class Test2 extends Test{
    public void func() {
        System.out.println(this.a);
    }
    public static void main(String[] args) {
      /*  Test test = new Test();
        System.out.println(test.a);*/
        Test2 test2 = new Test2();
        test2.func();
    }
}
