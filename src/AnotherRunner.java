import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args){
        // create an array with the known types
        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car("Camry", 8400);
        Car car3 = new Car("Ram", 17200);
        Car car4 = new Car("Accent", 1980);
        Car car5 = new Car("Cruiser", 10500);
        Car[] carArray = {car1, car2, car3, car4, car5};
        System.out.println("Changes");

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
