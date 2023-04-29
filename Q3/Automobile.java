/**
 * Automobile: This is a class that represents objects that represent used cars in Q3 
 * 
 * @author Suhyeon Jo
 * @since 2023-04-28
 * @version v0.2
 *
 */
public class Automobile {

	/** Data members in Automobile */
	private String model;
	private String milesPerGallon;
	private String numberOfCylinders;
	private String displacement;
	private String grossHorsePower;
	private String rearAxleRatio;
	private String weight;
	private String quaterMileTime;
	private String engine; 			
	private String transmission; 	
	private String numberOfForwardGears;
	private String numberOfCarburetors;

	/**
	 * Constructor: There are no arguments in constructor
	 * It initializes all data member of the class to NA
	 */
	public Automobile() {
		model = milesPerGallon = numberOfCylinders = displacement = grossHorsePower = rearAxleRatio = weight = 
				quaterMileTime = engine = transmission = numberOfForwardGears = numberOfCarburetors = "NA";
	}
	
	/**
	 * Constructor: There is only one argument in constructor: model
	 * It initialize model data member's value model
	 * This constructor is associated with a constructor that takes all variables as input 
	 * @param model
	 */
	public Automobile(String model) {
		this(model, "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA");
	}
	
	/**
	 * Constructor: This constructor receives all data member in class
	 * It initializes all data member of the class to specific value 
	 * @param model
	 * @param milesPerGallon
	 * @param numberOfCylinders
	 * @param displacement
	 * @param grossHorsePower
	 * @param rearAxleRatio
	 * @param weight
	 * @param quaterMileTime
	 * @param engine
	 * @param transmission
	 * @param numberOfForwardGears
	 * @param numberOfCarburetors
	 */
	public Automobile(String model, String milesPerGallon, String numberOfCylinders, String displacement, 
			String grossHorsePower, String rearAxleRatio, String weight, String quaterMileTime, String engine, 
			String transmission, String numberOfForwardGears, String numberOfCarburetors) {
		
		this.model = model;
		this.milesPerGallon = milesPerGallon;
		this.numberOfCylinders = numberOfCylinders;
		this.displacement = displacement;
		this.grossHorsePower = grossHorsePower;
		this.rearAxleRatio = rearAxleRatio;
		this.weight = weight;
		this.quaterMileTime = quaterMileTime;
		this.engine = engine;
		this.transmission = transmission;
		this.numberOfForwardGears = numberOfForwardGears;
		this.numberOfCarburetors = numberOfCarburetors;
		
	}
	
	/**
	 * This function return data member(model)
	 * @return model
	 */
	public String getModel() {
        return model;
    }
	
	/**
	 * This function set data meber(model) to input data
	 * @param model
	 */
    public void setModel(String model) {
        this.model = model;
    }

    /**
	 * This function return data member(milesPerGallon)
	 * @return milesPerGallon
	 */
    public String getMilesPerGallon() {
        return milesPerGallon;
    }

    /**
	 * This function set data meber(milesPerGallon) to input data
	 * @param milesPerGallon
	 */
    public void setMilesPerGallon(String milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    /**
	 * This function return data member(numberOfCylinders)
	 * @return numberOfCylinders
	 */
    public String getNumberOfCylinders() {
        return numberOfCylinders;
    }

    /**
	 * This function set data meber(numberOfCylinders) to input data
	 * @param numberOfCylinders
	 */
    public void setNumberOfCylinders(String numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    /**
	 * This function return data member(displacement)
	 * @return displacement
	 */
    public String getDisplacement() {
        return displacement;
    }

    /**
	 * This function set data meber(displacement) to input data
	 * @param displacement
	 */
    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    /**
	 * This function return data member(grossHorsePower)
	 * @return grossHorsePower
	 */
    public String getGrossHorsePower() {
        return grossHorsePower;
    }

    /**
	 * This function set data meber(grossHorsePower) to input data
	 * @param grossHorsePower
	 */
    public void setGrossHorsePower(String grossHorsePower) {
        this.grossHorsePower = grossHorsePower;
    }

    /**
	 * This function return data member(rearAxleRatio)
	 * @return rearAxleRatio
	 */
    public String getRearAxleRatio() {
        return rearAxleRatio;
    }

    /**
	 * This function set data meber(rearAxleRatio) to input data
	 * @param rearAxleRatio
	 */
    public void setRearAxleRatio(String rearAxleRatio) {
        this.rearAxleRatio = rearAxleRatio;
    }

    /**
	 * This function return data member(weight)
	 * @return weight
	 */
    public String getWeight() {
        return weight;
    }

    /**
	 * This function set data meber(weight) to input data
	 * @param weight
	 */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
	 * This function return data member(quaterMileTime)
	 * @return quaterMileTime
	 */
    public String getQuaterMileTime() {
        return quaterMileTime;
    }

    /**
	 * This function set data meber(quaterMileTime) to input data
	 * @param quaterMileTime
	 */
    public void setQuaterMileTime(String quaterMileTime) {
        this.quaterMileTime = quaterMileTime;
    }
    
    /**
	 * This function return data member(transmission)
	 * @return transmission
	 */
    public String getTransmission() {
        return transmission;
    }

    /**
	 * This function set data meber(transmission) to input data
	 * @param transmission
	 */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    /**
	 * This function return data member(engine)
	 * @return engine
	 */
    public String getEngine() {
        return engine;
    }

    /**
	 * This function set data meber(engine) to input data
	 * @param engine
	 */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
	 * This function return data member(numberOfForwardGears)
	 * @return numberOfForwardGears
	 */
    public String getNumberOfForwardGears() {
        return numberOfForwardGears;
    }

    /**
	 * This function set data meber(numberOfForwardGears) to input data
	 * @param numberOfForwardGears
	 */
    public void setNumberOfForwardGears(String numberOfForwardGears) {
        this.numberOfForwardGears = numberOfForwardGears;
    }
    
    /**
	 * This function return data member(numberOfCarburetors)
	 * @return numberOfCarburetors
	 */
    public String getNumberOfCarburetors() {
        return numberOfCarburetors;
    }

    /**
	 * This function set data meber(numberOfCarburetors) to input data
	 * @param numberOfCarburetors
	 */
    public void setNumberOfCarburetors(String numberOfCarburetors) {
        this.numberOfCarburetors = numberOfCarburetors;
    }
    
    /**
     * This function print object's all data member
     */
    public void printStatus() {
    	System.out.println("Model: " + model);
    	System.out.println("Miles/(US) gallon: " + milesPerGallon);
    	System.out.println("Number of cylinders: " + numberOfCylinders);
    	System.out.println("Displacement (cu.in.): " + displacement);
    	System.out.println("Gross horsepower: " + grossHorsePower);
    	System.out.println("Rear axle ratio: " + rearAxleRatio);
    	System.out.println("Weight (1000 lbs): " + weight);
    	System.out.println("1/4 mile time: " + quaterMileTime);
    	System.out.println("Engine (0 = V-shaped, 1 = straight): " + engine);
    	System.out.println("Transmission (0 = automatic, 1 = manual): " + transmission);
    	System.out.println("Number of forward gears: " + numberOfForwardGears);
    	System.out.println("Number of carburetors: " + numberOfCarburetors);
    }

}
