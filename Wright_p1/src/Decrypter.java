
public class Decrypter {
	
	public int [] decryptInteger(int [] data) {
	
	//initializes array values to integer variables 
		
		int firstDigit = data[0];
		int thirdDigit = data[2];
		int secondDigit = data[1];
		int fourthDigit = data[3]; 
		
	//undo swap digits
		
		data[0] = thirdDigit;
		data[1] = fourthDigit;
		data[2] = firstDigit;
		data[3] = secondDigit;
		
	//undo modules 10 and undo + 7
		
		for(int c = 0; c < data.length; c++) {
			
			if((data[c]) > 7){
				
				data[c] -= 7;
			}
			else {
				data[c] = (data[c] + 10);
				data[c] -= 7;
			}
		}
	
		return data;
	}

}
