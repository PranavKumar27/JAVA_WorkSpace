// package Arithmetic;

/*
 * 
 *  Area of Cuboid = top_area+bottom_area+left_side_area+right_side_area+front_side_area+back_side_area
 *  total 6 side
 *  top_area/bottom_area = len*breadth
 *  front_area/back_area = height * len
 *  left/right side area = height*breadth
 * 
 *   volume = len*br*height
 */
public class Cubiod {
    public static void main(String args[])
    {
        try
        {
            int len = Integer.parseInt(args[0]);
            int brdth = Integer.parseInt(args[1]);
            int ht = Integer.parseInt(args[2]);

            int front_ar = 2*ht*len;
            int left_ar = 2*ht*brdth;
            int top_ar = 2*len*brdth;

            int tot_ar = front_ar+left_ar+top_ar;

            int vol = len*brdth*ht;

            System.out.println("Area of Cuboid = "+tot_ar);
            System.out.println("Vol of Cuboid = "+vol);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Please provide Command Line Arguments");
        }
        
    }
}
