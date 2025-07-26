import MyPack1.Demo1;
import MyPack1.Demo3;
import MyPack1.inner.Demo2;

public class CallDemo {
    public static void main(String[] args)
    {
        Demo1 d1 = new Demo1();
        Demo3 d3 = new Demo3();
        Demo2 d2 = new Demo2();
        d2.display();
    }
}
