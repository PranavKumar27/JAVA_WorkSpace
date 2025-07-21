// package String;

import java.util.Scanner;

public class IPRegexValidation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the ip : ");
        String s = sc.next();
        

        String Arr[] = s.split("\\.");
        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i].matches("[0-9]{1}"))) // no of chars is less than 3 or more
            {
                Arr[i] = "00"+ Arr[i];
            }
            else if((Arr[i].matches("[0-9]{2}"))) // no of chars is less than 3 or more
            {
                Arr[i] = "0"+ Arr[i];
            }
            // System.out.println(Arr[i]);
        }

        String Formated_IP="";
        for(int i=0;i<Arr.length-1;i++)
        {

            Formated_IP = Formated_IP +  Arr[i]+ ".";
        }
        if(Arr.length>0)
            Formated_IP = Formated_IP + Arr[Arr.length-1];
        System.out.println("IP Entered ="+Formated_IP);

        String Regex = "([0-9]{1,2}|(0|1)[0-9]{2}|2[0-4][0-9]|25[0-5])";
        String completeRegex = "^" + Regex + "[\\.]" + Regex + "[\\.]" + Regex + "[\\.]" + Regex + "$"  ;
        System.out.println(Formated_IP.matches(completeRegex));


    }
}
