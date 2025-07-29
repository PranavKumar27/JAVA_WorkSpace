// package JavaLangObject;

public class StringWrapper {
    public static void main(String[] args) {
        String S1 = new String("Hello");
        StringBuffer S2 = new StringBuffer("World");
        StringBuilder S3 = new StringBuilder("Welcome");

        String S11 = S1.concat(" India");
        S2.append(" Tour");
        S3.append(" to Possibility");

        System.out.println("S1 = "+S1);
        System.out.println("S11 = "+S11);
        System.out.println("S2 = "+S2);
        System.out.println("S3 = "+S3);

    }
}
