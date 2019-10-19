package itSovy.carConsumption.detail;

public class Car {

    public double fuelCapacity;
    public double fuelConsumption;
    public String brand;
    public int year;
    public String type;
    public String horsePower;
    private Engine engine;
    public Color color;

    public Car(double fuelCapacity, double fuelConsumption, String brand,int year,String type,int horsePower, char fuel, int engineCylinder, int power, int volume,Color color){
      this.fuelCapacity = fuelCapacity;
      this.fuelConsumption = fuelConsumption;
      this.brand = brand;
      this.year = year;
      this.type = type;
      this.horsePower = horsePower + "kW";
      this.color = color;
      engine = new Engine(engineCylinder, power, volume, fuel);
    }

    public void enduranceDistance(double pricePaid){
        double distance=0;
        double fuelPrice = 1.361;
        double litreBought = (Math.round( (pricePaid/fuelPrice)*100.0)) /100.0;
        if((fuelCapacity-litreBought)>0){
            distance=    Math.round((litreBought/(fuelConsumption/100))*100.0) /100.0;
            System.out.println("\nYou bought "+ litreBought+"l of fuel");
            System.out.println("Your possible enduranceDistance is "+ distance+" KM");
        }else{
            double returnCash = (fuelCapacity-litreBought)*-1;
            distance=   Math.round((fuelCapacity/(fuelConsumption/100))*100.0) /100.0;
            returnCash = (Math.round((returnCash*fuelPrice)*100.0))/100.0;
            System.out.println("\nYou fully fill your fuelCapacity");
            System.out.println("Money for return "+returnCash+"EUR");
            System.out.println("Your possible enduranceDistance is "+ distance+" KM");
        }
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public int getYear() {
        return year;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void print() {
        System.out.println("\nfuelCapacity "+fuelCapacity+"\nfuelConsumption "+fuelConsumption+"\nbrand "+brand+"\nyear "+year+"\ntype "+type);
    }
    public void printDetail(){
        print();
        System.out.println("Engine details \nPower: "+engine.getPower()+"\nVolume: "+engine.getVolume()+"\nengineCylinder "+engine.getEngineCylinder()+"\nfuel "+engine.getFuel()+"\nColor "+color );

    }
}
