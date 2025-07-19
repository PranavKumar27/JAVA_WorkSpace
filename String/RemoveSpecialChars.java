//package String;

public class RemoveSpecialChars {
    public static void main(String args[])
    {
        remove_Special_Chars();
        remove_Empty_Spaces();
        countNoOfWords();
    } 
    
    static void countNoOfWords()
    {
        String s2 = "      abc      def     tyu     mnop    rtsuvw       xy     z    ";
        s2 = s2.replaceAll("\\s+"," ").trim();

        String words[] = s2.split("\\s");


        System.out.println("No Of Words = " +words.length);
    }
    static void remove_Empty_Spaces()
    {
        String s = "      abc      def     tyu     mnop    rtsuvw       xy     z    ";

        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        
        System.out.println("After removing Empty Spaces s ="+s);

        // Directly Use as

        String s2 = "      abc      def     tyu     mnop    rtsuvw       xy     z    ";
        System.out.println(s2.replaceAll("\\s+"," ").trim());
        

    }
    static void remove_Special_Chars()
    {
                // Solution 1 Using For loo
        // String s = "a!Bc#1$2%3";
        
        // for(int i =0;i<s.length();i++)
        // {
        //     char ch = s.charAt(i);
        //     String s_ch = String.valueOf(ch);
        //     if(s_ch.matches("[a-zA-Z0-9]"))
        //     {
        //         // No Action
        //     }
        //     else
        //     {
        //         s = s.replaceAll(String.valueOf(ch), "");
        //     }
        // }
        // System.out.println("Modified Str = " + s);

        // Solution 2 : Using replaceAll(regex,replacementStr)
        String S2 = "a!Bc#1$2%3";

        S2 = S2.replaceAll("([^a-zA-Z0-9]*)","");
        System.out.println("Modified Str S2 = " + S2);
    
        String s3 = "a7yt";
        System.out.println("a7.matches([a-z0-9]) = " + s3.matches("[a-z0-9]*"));
    } 
}
