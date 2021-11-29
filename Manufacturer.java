class Factory  {
    private int EngineCC;
    private int Gear;
    //Encapsulation
    public void showDisplay() {
        System.out.println("EngineCC: "+" "+ this.EngineCC + " Gear: "+" "+this.Gear);
    }
 
    public int getEngineCC() {
        return EngineCC;
    }
 
    public void setEngineCC(int EngineCC) {
        this.EngineCC = EngineCC;
    }
 
    public int getGear() {
        return Gear;
    }
 
    public void setGear(int Gear) {
        this.Gear= Gear;
    }
}
//Inherited Factory class
class Truck extends Factory {
  public void Start() {
        System.out.println("Truck started");
    }
    public void Stop() {
        System.out.println("Truck stopped.");
    }
}
class Ducati extends Truck{
    //@override
public void Start() {
        System.out.println("Bike started");
    }
    public void Stop() {
        System.out.println("Bike stopped.");
    }
}
//Abstaction
abstract class Vehicle
{
    abstract public void vehicle1() ; 
      abstract public void vehicle2();
}
class Model extends Vehicle
{
    public void vehicle1() 
    {
        System.out.println("The Truck is ready");
    }
     public void vehicle2() 
    {
        System.out.println("The Bike is ready");
    }
}
public class Manufacturer {
    public static void main(String[] args) {
   Vehicle V = new Model();
   V.vehicle1();
  
   Truck Truck1 = new Truck();
   Truck1.Start();
   Truck1.setGear(6);
   Truck1.setEngineCC(5000);
   Truck1.showDisplay();
   Truck1.Stop();
   
   System.out.println("---------------------------------");
   
   V.vehicle2();
   Ducati Duc1 = new Ducati();
   Duc1.Start();
   Duc1.setGear(6);
   Duc1.setEngineCC(1500);
   Duc1.showDisplay();
   Duc1.Stop();
   
    }
}