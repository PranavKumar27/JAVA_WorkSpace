//package String;

public class StringClassMethods {
    public static void main(String[] Args)
    {
        String str1 = "Java";

        int n = str1.length();
        System.out.format("Str len = %d\n",n);

        String str2 = str1.toLowerCase();
        str1 = str2.toUpperCase();  // Original String Modified Here 
        
        System.out.printf("%s , %s",str2,str1);

        String str4 = "        WELCOME              ";
        System.out.println(str4);
        String str5 = str4.trim();
        System.out.println("After Trim = "+str5);


        String str6 = "India is Great";
        String str7 = str6.substring(3);

        System.out.println("Sub string = " + str7);

        String str8 = str6.substring(3,10);  // from 3 to 9  (n-1) Only
        System.out.println("Sub string = " + str8);

        String str9 = str6.replace('a', 'K');
        System.out.println(str6+  " << string after replace a with k >> " + str9);

        stringMethods();
        stringMethods2();
    }

    static void stringMethods() // String 2
    {
        String s1 = "https://My.UnixMachine:5056/AdminConsoleUnix.org";
        boolean start1 = s1.startsWith("My");
        System.out.println("Starts with My at 0 =" + start1 + "\n");
        boolean ans = s1.startsWith("My", 8);
        System.out.println("Starts with My at 8 =" + ans + "\n");
        boolean start2 = s1.startsWith("https");

        boolean ends1 = s1.endsWith("com");
        boolean ends2 = s1.endsWith("org");

        System.out.println(start1 + "\n" + start2 + "\n" + ends1 + "\n" + ends2 + "\n");

        char ch = s1.charAt(6);
        System.out.printf("Char At: %6c\n",ch);

        int idx1 = s1.indexOf(".");
        int idx2 = s1.indexOf("Unix"); // Return first occureence of Unix from start
        int idx3 = s1.indexOf("Unix",12); // Find the occurence of Unix after index 12
        int idx4 = s1.indexOf('?'); // Return -1 if not found
        int idx5 = s1.indexOf('.',3); // Find dot (.) starting from index 3
        System.out.println("idx5 = index of start from idx = 3 =" + idx5);
        System.out.printf("indexOf: index1= %d , index2 = %d , index3 =%d , index4 =%d\n",idx1,idx2,idx3,idx4);


        int last_idx1 = s1.lastIndexOf('.'); // starting  from R->L Last indexof '.' 
        int last_idx2 = s1.lastIndexOf('.',30); // starting  from R->L Last indexof '.' from 30 to it's left 

        System.out.printf("LastIndexOf: index1= %d , index2 = %d  \n",last_idx1,last_idx2);

        for(int i=0;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i) + " ");
        }

    }

    static void stringMethods2()
    {
        String s1 = "java";
        String s2 = "Java";
        String s3= "python";
        String s4 = "python";

        boolean ans1 = s1.equals(s2);
        boolean ans2 = s3.equals(s4);

        System.out.println("ans1 = "+ ans1 + " ans2 = "+ans2 );


        boolean ans3 = s1.equalsIgnoreCase(s2);

        System.out.println("ans3 = "+ ans3 );


        // compareTo either return <0 , 0 or >0
        int v1 = s1.compareTo(s3); // java .compareTo(python);

        int v2 = s3.compareTo(s1); // python .compareTo(java)

         System.out.println("ans1 = "+ v1 + " ans2 = "+v2 );
    

        int v3 = s1.compareTo(s2); // java .compareTo(JAVA);

        int v4 = s3.compareTo(s4); // python .compareTo(python)

         System.out.println("ans1 = "+ v3 + " ans2 = "+v4 );


         int v5 = s1.compareToIgnoreCase(s2); // java .compareTo(JAVA);
         System.out.println("java.compareToIgnoreCase(Java) = "+ v5);

         // equals and == 

         String str1 = "java";
         String str2 = "java";

         String str3 = new String("java");

        System.out.println("Created on pool vs Created on pool java.equals.(java) ="+str1.equals(str2));
        System.out.println("Created on pool vs Created on pool java == java ="+ (str1==str1));

        System.out.println("Created on heap vs Created on pool java.equals(java) ="+ str3.equals(str1));
        System.out.println("Created on heap vs Created on pool java==java  ="+ (str3 ==str1));


        String t1 = "Burj Khalifa";
        String t2 = " is the tallest Building on Earth";

        System.out.println(t1+t2);
        System.out.println(t1.concat(t2)); // New string is formed t1 and t2 are immuatable
        System.out.println(t1.contains("Khalifa"));

        String val = String.valueOf(100);
        System.out.println("val = " + val);

    }
}
