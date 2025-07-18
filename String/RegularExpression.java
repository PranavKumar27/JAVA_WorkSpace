//package String;

public class RegularExpression {
    public static void main(String []Args)
    {
        String s1 = "f";
        System.out.println("f.matches(.) = " + s1.matches("."));

        String s2 = "ab";
        System.out.println("ab.macthes(.) = " + s2.matches("."));

        String s3 = "a7";
        System.out.println("a7.matches([a-z0-9]) = " + s3.matches("[a-z0-9]"));

        System.out.println("a7.matches([a-z][0-9]) = " + s3.matches("[a-z][0-9]"));

        System.out.println("a7.matches(^[a-z][0-9]) = " + s3.matches("^[a-z][0-9]"));

        String s4 ="@?";

        System.out.println("@?.matches(^[a-z][0-9]) = " + s4.matches("^[a-z][0-9]"));

        String s5 ="k";

        System.out.println("k.matches([a-z][0-9]) = " + s5.matches("[a-z][0-9]"));

        String s6 ="k$";

        System.out.println("k$.matches([a-z][0-9]) = " + s6.matches("[a-z][0-9]"));


        String s7 ="b";

        System.out.println("b.matches(a|b) = " + s7.matches("a|b"));

        
        String s8 ="s";

        System.out.println("s.matches(a|b) = " + s8.matches("a|b"));

        String s9 ="ab";

        System.out.println("ab.matches(abc) = " + s9.matches("abc"));

        String s10 ="abc";

        System.out.println("abc.matches(abc) = " + s10.matches("abc"));

        String s11 = "s" ;
        String  s12 = "5";
        String s13 = "s5";

        System.out.println("s.matches(\\w) = " + s11.matches("\\w")); // \\w is for single char either alphabet or digit

        System.out.println("5.matches(\\w) = " + s12.matches("\\w"));

         System.out.println("s5.matches(\\w) = " + s13.matches("\\w"));


        //  \\W is for single char other than  alphabet or digit

        System.out.println("s.matches(\\W) = " + s11.matches("\\W")); 

        System.out.println("5.matches(\\W) = " + s12.matches("\\W"));

         System.out.println("?.matches(\\W) = " + "?".matches("\\W"));


         String s14 = "a";
         String s15 = "6";

         System.out.println("a.matches(\\d) = " + s14.matches("\\d")); // \\d matches with different Single digit

         System.out.println("6.matches(\\d) = " + s15.matches("\\d"));

         String s16 = "a";
         String s17 = "6";

         System.out.println("a.matches(\\D) = " + s14.matches("\\D")); // \\D means match with non digits

         System.out.println("6.matches(\\D) = " + s15.matches("\\D"));



          // \\s matches with Spaces
         s16 = " ";
         s17 = "a";

         System.out.println(" .matches(\\s) = " + s16.matches("\\s")); // 

         System.out.println("a.matches(\\s) = " + s17.matches("\\s"));


         // \\S matches with Non- Spaces
         s16 = " ";
         s17 = "$";

         System.out.println(" .matches(\\s) = " + s16.matches("\\S")); // 

         System.out.println("a.matches(\\s) = " + s17.matches("\\S"));


         // Quantifier * + {X} {X,Y}

        String _s1 = "abcd def";

        System.out.println("abcd def.matches(.*) = " + _s1.matches(".*"));

        String _s2 = "abcd6def";

        System.out.println("abcd6def.matches([a-z]*) = " + _s2.matches("[a-z]*"));



        System.out.println("abcd6def.matches([a-z]*[0-9]*) = " + _s2.matches("[a-z]*[0-9]*"));

        String _s3 = "ababaabb";

        System.out.println("ababaabb.matches([ab]*) = " + _s3.matches("[ab]*"));

        System.out.println("ababaabb.matches([abc]+) = " + _s3.matches("[abc]+"));

        System.out.println("ababaabb.matches([ac]+) = " + _s3.matches("[ac]+"));

         String _s4 = "acc";

         System.out.println("acc.matches([abc]{3}) = " + _s4.matches("[abc]{3}"));

         _s4 = "ac";

         System.out.println("ac.matches([abc]{3}) = " + _s4.matches("[abc]{3}"));

        String _s5 = "accb";

         System.out.println("accb.matches([abc]{3}) = " + _s5.matches("[abc]{3}"));

         System.out.println("accb.matches([abc]{3,7}) = " + _s5.matches("[abc]{3,7}"));

         _s5 = "accbacc";
         System.out.println("accbacc.matches([abc]{3,7}) = " + _s5.matches("[abc]{3,7}"));

         _s5 = "accbaccb";
         System.out.println("accbaccb.matches([abc]{3,7}) = " + _s5.matches("[abc]{3,7}"));

         // Email validation

         String email1 = "john12@gmail.com";
         String email2 = "joh-n@gmail.com";
         String email3 = "john@gmail,com";

         String RegExp = "gmail";

         boolean b1 = email1.matches("\\w*[@]gmail[.]com");
         boolean b2 = email2.matches("[a-z]*[@]gmail[.]com");
         boolean b3 = email3.matches("[a-z]*[@]gmail[.]com");
         

         System.out.println("res = " + b1 + " " + b2 + " " + b3);



    }
}
