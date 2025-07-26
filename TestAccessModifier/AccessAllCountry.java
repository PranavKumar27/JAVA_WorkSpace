import EnemyPackage.PAK;
import EnemyPackage.Turkey;
import Friendship.Russia;
import Friendship.USA;

public class AccessAllCountry {
    public static void main(String args[])
    {
        System.out.println("Diff Package EnemyPackage  Non SubCLass = PAK " );
        PAK_DiffPackNonSubClassIndia p1 = new PAK_DiffPackNonSubClassIndia();
        p1.show();

        System.out.println("Diff Package EnemyPackage  SubCLass = Turkey " );
        Turkey_DiffPackSubClassIndia t1 = new Turkey_DiffPackSubClassIndia();
        t1.display();

        System.out.println("Same Package Friendship SubCLass = Russia " );
        Russia_SamePackSubClassIndia r1 = new Russia_SamePackSubClassIndia();
        r1.display();

        System.out.println("Same Package Friendship Non-SubCLass = USA " );
        USA_SamePackNonSubClassINDIA u1 = new USA_SamePackNonSubClassINDIA();
        u1.display();
    }
}
