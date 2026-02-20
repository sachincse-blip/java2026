class veg
{
    void display()
    {
        System.out.println("VEG IS GOOD FOR HEALTH");
    }
}
class A2B extends veg
{
    void roast()
    {
        System.out.println("NICE ROAST");
    }
}
class sangeethas extends veg
{
    void pongal()
    {
        System.out.println("NICE VENPONGAL");
    }
}
class Main 
{
    public static void main(String args[])
    {
        sangeethas obj1=new sangeethas();
        obj1.pongal();
        obj1.display();
        
        A2B obj2=new A2B();
        obj2.roast();
        obj2.display();
        
    }
}
