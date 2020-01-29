
public class Encrypter {

	public int [] encryptInteger( int [] data) {
	
	//add 7 mod 10
		for(int c = 0 ; c < data.length; c++) {
			data[c] += 7;
			data[c] = data[c] % 10; 
		}
		
	//initializes array value to integer variables
		
		int firstDigit = data[0];
		int thirdDigit = data[2];
		int secondDigit = data[1];
		int fourthDigit = data[3];
		
	//swap 1 and 3 and 2 and 4 
		
		data[0] = thirdDigit;
		data[1] = fourthDigit;
		data[2] = firstDigit;
		data[3] = secondDigit;
			
		return data;
	}

}
