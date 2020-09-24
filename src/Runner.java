import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
        ArrayList <Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car(94,2002,"black", "Ford", "Focus"));
        vehicleList.add(new Car(75,2014,"Silver", "VW", "Polo"));
        vehicleList.add(new Car(105,2014,"Silver", "Ford", "Focus"));
        vehicleList.add(new Motorbike(105,2020,"Black", "Honda", "Unknown"));

        System.out.println(vehicleList);
    }
}
