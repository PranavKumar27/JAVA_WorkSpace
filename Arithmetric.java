public class Arithmetric {
    public static void main(String args[])
    {
        int a = 14,b=5;

        int c = a/b;
        int r = a%b;

        System.out.println("TYPE 1 ");
        System.out.println("c="+c);
        System.out.println("r="+r);


        float p = (float)a/b;
        float q = a%b;

        System.out.println("TYPE 2 ");
        System.out.println("p="+p);
        System.out.println("q="+q);


        float m = 14.7f,n=3.2f;

        float h = m/n;
        float k = m%n;

        System.out.println("TYPE 3 ");
        System.out.println("h="+h);
        System.out.println("k="+k);

        byte o=10;
        short y=15;

        int f=o+y;

        System.out.println("TYPE 4 ");
        System.out.println("f="+f);



        float g=12.5f;
        long x=123l;

        float j=g*x;
        System.out.println("TYPE5");
        System.out.println("j="+j);

        float nu=12.5f;
        double z=123;

        double kl=nu*z;
        System.out.println("TYPE6");
        System.out.println("kl="+kl);

        char cc =40;
        int nn=30;

        int dd=cc-nn;
        System.out.println("TYPE6");
        System.out.println("dd="+dd);

        System.out.println("10+20/2="+(10+20/2));

        System.out.println("(10+20)/2="+((10+20)/2));

        System.out.println("10/2*5="+(10/2*5));

        System.out.println("10/(2*5)="+(10/(2*5)));

    }
}
