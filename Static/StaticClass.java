// package Static;

// Only Inner Class can be static
// static class HondaCity -- Incorrect 
class HondaCity
{
    String brandName = "Honda";
    static long price = 10000000; // Price is same for all Cars

    // A non-static Method can access static member
    // A non-static Method can access non-statc member
    void getCurrentPrice()
    {
        System.out.println("BrandName = " + brandName);
        System.out.println("Ex-Showroom Price = " + price);
    }

    // A static Method can only access static member
    // A static Method CANNOT access non-statc member
    static void OnRoadPrice(String city)
    {
        // System.out.println("BrandName = " + brandName);
        switch(city)
        {
            case "MUM" : System.out.println("On Road Price in Mumbai = " + (price*1.1));
                            break;
            case "HYD":System.out.println("On Road Price in HYD = " + (price*1.08));
                            break;
            case "DEL":System.out.println("On Road Price in Del = " +(price*1.2));
                            break;
            case "BLR":System.out.println("On Road Price in BLR = " + (price*1.5));
                            break;
            default: System.out.println("On Road Price  = " +(price*1.3));
        }
    }
}

public class StaticClass {
    public static void main(String[] args) 
    {
        HondaCity h1 = new HondaCity();
        h1.getCurrentPrice();

        HondaCity.OnRoadPrice("BLR");   
        HondaCity.price = 1200000;

        
        HondaCity h2 = new HondaCity();
        h2.getCurrentPrice();
    }
}
