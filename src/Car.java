
public class Car extends Vehicle {
	private int numOfDoors;
    private boolean hasArmRest;
    

    public Car(int bhp, int year, String colour, String make, String model) {
        super(bhp, year, colour, make, model);
    }

	public void rev(String revSound){
        System.out.println("Croom Croom!");
    }
    
}
