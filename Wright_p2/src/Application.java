import java.util.Scanner;
public class Application {
	public static void main(String [] args) {
		//allow user input
		
		Scanner in = new Scanner(System.in);
		
		//declarations
		
		int weight, height, option;
		
		//prompt user for input of weight/height/option
		
		System.out.print("Please enter weight (round to nearest whole number): ");
		weight = in.nextInt();
		System.out.print("\nPlease enter height: ");
		height = in.nextInt();
		System.out.print("\nPlease select 1 for Imperial or 2 for Metric: ");
		option = in.nextInt();
		
		//create constructor for BMI calculator class
		
		BMICalculator input = new BMICalculator();
		
		//access private methods through public method read user data
		
		input.readUserData(option, weight, height);
		
		//display BMI and category
		
		input.displayBmi();
	}	
}
