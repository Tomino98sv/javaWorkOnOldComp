import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Database db = new Database("root","");
//        Car skoda1 = new Car("Skoda Favorit","white",'P',"KE 707DH",200);
//        db.addCar(skoda1);
//
        List<Car> priceCARS = db.getCarsByRegion("KE");
        for (Car car:priceCARS){
            System.out.println(car.getBrand()+"|"+car.getColor()+"|"+car.getFuel()+"|"+car.getSpz()+"|"+car.getPrice());
        }

        db.generateXML();

    }
}
