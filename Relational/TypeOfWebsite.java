// package Relational;

import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class TypeOfWebsite {
    public static void main(String []Args)
    {
        System.out.println("Enter the web page URL :");
        Scanner sc = new Scanner(System.in);
        String url = sc.next();

        int idx = url.indexOf(":");
        String protocol = url.substring(0,idx);
        System.out.println("protocol = "+protocol);

        switch(protocol)
        {
            case "http": System.out.println("Hyper Text Transfer Protocol");
                    break;
            case "ftp": System.out.println("File Transfer Protocol");
                    break;
            default:System.out.println("Unknown Protocol");
        }

        int idx2 = url.lastIndexOf(".");
        String type = url.substring(idx2+1);

        if(type.equals("com"))
        {
            System.out.println("type = Commercial");
        }
        else if(type.compareTo("org")==0)
        {
            System.out.println("type = Organizational");
        }
        else if(type == "gov")
        {
            System.out.println("type = Governmental");
        }
        else if(type.equals("next"))
        {
            System.out.println("type = Network");
        }
        else if((type.compareToIgnoreCase("biz")==0))
        {
            System.out.println("type = Business");
        }
        else
        {
            System.out.println("type = "+type);
        }


        

    }
}
