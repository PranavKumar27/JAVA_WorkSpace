package EnemyPackage;
import Friendship.India;

public class PAK_DiffPackNonSubClassIndia {
    public void show()
    {
        India ind = new India();
        // Pak can access only d which is public
        // Pak Can't access Private,Default amd Protected variables
        System.out.println("Value = " + (ind.d));
    }
}
