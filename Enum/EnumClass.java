enum Laptop{
    Macbook(3000), XPS(2500), ThinkPad(2000), Lenovo;

    private int price;

    

    private Laptop() {
        price = 200;
    }

    private Laptop(int price) 
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}


public class EnumClass
{
    public static void main(String args[])
    {
        
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }


    }
}