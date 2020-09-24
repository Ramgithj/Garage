
public class Motorbike extends Vehicle {
	 private boolean hasTwoSeats;
	 private String doWheelie;

	    public Motorbike(int bhp, int year, String colour, String make, String model) {
	        super(bhp, year, colour, make, model);
	    }
	    
	    
	    
	    public void rev(String revSound){
	        System.out.println("Broom Broom!");
	    }
	}

