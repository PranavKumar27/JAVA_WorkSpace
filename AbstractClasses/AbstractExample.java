// package AbstractClasses;

abstract class Super {
    public Super() {
        System.out.println("Default Constructor of Super");
    }

    protected void display() {
        System.out.println("Super");
    }

    abstract public void printData(String S);
    // abstract public void CompareData(String S1,String S2);
}

class Sub extends Super {
    public Sub() {
        System.out.println("Default Constructor of Sub");
    }

    @Override
    public void display() {
        System.out.println("Sub");
    }

    public void printData(String s) {
        System.out.println("Data = " + s);
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        Super Superb = new Sub();
        Superb.display();
        Superb.printData("hello");
    }
}
