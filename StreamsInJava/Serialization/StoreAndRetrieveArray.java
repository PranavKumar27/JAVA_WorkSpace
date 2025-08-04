import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoreAndRetrieveArray {
    public static void main(String args[]) throws Exception
    {
        float FArr[] = {10.5f,12.6f,13.9f,14.896f};
        FileOutputStream out = new FileOutputStream("FloatArray.txt");
        DataOutputStream dos = new DataOutputStream(out);

        int sz = FArr.length;

        dos.writeInt(sz);
        for(float f:FArr)
        {
            dos.writeFloat(f);
        }
        // close in same order as created
        dos.close();
        out.close();

        // Reading from file

        FileInputStream fis = new FileInputStream("FloatArray.txt");
        DataInputStream dis = new DataInputStream(fis);

        int len = dis.readInt();
        for(int i=0;i<len;i++)
        {
            System.out.print(dis.readFloat() + " , ");
        }
        System.out.println("");
        
        // close in same order as created
        dis.close();
        fis.close();
    }
}
