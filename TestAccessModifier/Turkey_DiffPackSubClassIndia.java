package EnemyPackage;
import Friendship.India;

public class Turkey_DiffPackSubClassIndia extends India{
    public void display()
    {
        // Can't access Private and default a and b
        System.out.println("Value = " + (c+d));
    }
}
