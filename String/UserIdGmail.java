public class UserIdGmail
{
    public static void main(String args[])
    {
        // Assume email Address is Valid

        String email = args[0];

        int idx = email.indexOf('@');

        String domain = email.substring(idx+1);

        System.out.println("Domain is gmail ? = " + domain.startsWith("gmail"));

        int type_idx = domain.indexOf('.');

        String type = domain.substring(type_idx+1);

        String Company_Domain = domain.substring(0,type_idx);

        String UserName = email.substring(0,idx);

        System.out.println("username = "+ UserName  + "\nDomain Name = " +Company_Domain + "\nRegion/Typp = " + type);

    }
}