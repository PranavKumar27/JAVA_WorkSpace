// package String;

public class StringPractise {
    public static void main(String[] args)
    {
        String str1 = "Java Program";
        String str2 = new String("JAVA");

        char c[] = {'H','e','l','l','0'};
        String str3 = new String(c);

        byte b[] = {65,66,67,68,69,70};
        String str4 = new String(b);

       

        String str5 = new String(b,2,2);
        String str6 = new String(b,0,2);
        String str7= new String(b,1,3);

         System.out.println(str1 + "\n " + str2 + "\n" + str3 + "\n" +str4 + "\n" + str5 + "\n" + str6+ "\n" + str7);

        // Stroing data in Pool and Heap
         String s1 = "Java";
         String s2 = "Java";
         

         System.out.println(s1==s2);

        String s3 = "java";     
        System.out.println(s1==s3);

        String s4 = new String("Java");
        System.out.println(s1==s4);

    }

}
