//this class calculates BMI with corresponding input weight, height,
//and option. option 1 is for imperial data, option 2 is for metric
//this class also displays BMI and category for corresponding input.
public class BMICalculator {
	
	//declare private variables
	
	private int weight;
	private int height;
	private int option;
	private double bmi;
	private String category;
	
	//reads user input from application class & accesses private methods
	
	public void readUserData(int option, int weight, int height) {
		readUnitType(option);
		readMeasurementData(weight, height);
	}
	
	//sets option to user input
	
	private void readUnitType(int option) {
			this.option = option;
	}
	
	//accesses corresponding method based on option
	
	private void readMeasurementData(int weight, int height) {
		if(this.option == 1) { //option 1 is imperial
			readImperialData(weight, height);
		}
		if(this.option == 2) { //option 2 is metric
			readMetricData(weight, height);
		}
	}
	
	//sets weight & height for metric
	
	private void readMetricData(int weight, int height) {
		setWeight(weight);
		setHeight(height);
	}
	
	//sets weight & height for imperial
	
	private void readImperialData(int weight, int height) {
		setWeight(weight);
		setHeight(height);
	}
	
	//calculates BMI and accessed category method
	
	public void calculateBmi() {
			if(this.option == 1 ) {
				bmi = 703 * (double)getWeight();
				bmi /= (Math.pow(getHeight(),2));
			}
			else if (this.option == 2 ){
			bmi = (double)getWeight() / (Math.pow(getHeight(),2));
			}
		calculateBmiCategory();
	}
	
	//sets category type string
	
	private void calculateBmiCategory() {
		if(bmi < 18.5 )
			category = "Underweight";
		else if(bmi >= 18.5 && bmi <= 24.9 ) {
			category = "Normal Weight";
		}
		else if ( bmi > 25 && bmi <= 29.9 ) {
			category = "OverWeight";
		}
		else
		{
			category = "Obesity";
		}
	}
	
	//displays BMI and category accessing get methods
	
	public void displayBmi() {
		calculateBmi();
		calculateBmiCategory();
		System.out.printf("\nYour BMI is: %.2f", getBmi());
		System.out.println();
		System.out.println("\nYour BMI Category is: " + getBmiCategory());
	}
	
	//sets private variable weight also terminates if weight is negative
	
	private void setWeight(int weight) {
		if(weight > 0) {
			this.weight = weight;
		}
		else {
			System.exit(0);
		}
		
	}
	
	//sets private variable height
	
	private void setHeight(int height) {
		if(height > 0 ) {
			this.height = height;
		}
		else {
			System.exit(0);
		}
	}
	
	//gets private variable weight
	
	public int getWeight() {
		return weight;
	}
	
	//gets private variable height
	
	public int getHeight() {
		return height;
	}
	
	//gets private variable bmi 
	
	public double getBmi() {
		return bmi;
	}
	
	//gets private variable category
	
	public String getBmiCategory() {
		return category; 
	}
	
}
