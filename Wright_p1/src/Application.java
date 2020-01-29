import java.util.Scanner;
public class Application {
	public static void main(String [] args) {
	//for taking user input	
		
		Scanner in = new Scanner(System.in);
		
	//declarations
		
		int integerData[] = new int [4];
		int encryptedData[] = new int[4];
		int decryptedData[] = new int [4];
		
	//prompt user to input four digit integer
		
		System.out.print("Please enter the digits to encrypt (seperate digits with a space): ");
		
	//for loop to store each integer in integer array 
		for(int c = 0; c < 4; c++) {
			integerData[c] = in.nextInt();
		}
	//call encrypt class
		
		Encrypter data1 = new Encrypter();
		encryptedData = data1.encryptInteger(integerData);
		
	//print encrypted data
		
		System.out.print("The new encrypted integer is: ");
		for ( int c = 0; c < 4; c++) {
			System.out.print(encryptedData[c]);
		}
	//prompt user to input encrypted data
		
		System.out.println();
		System.out.print("Please enter encrypted data to decrypt (seperate digits with a space): ");
		
	//for loop to store each integer in integer array
		
		System.out.println();
		for(int c = 0; c < 4; c++) {
			integerData[c] = in.nextInt();
		}
		
	//call decrypt class
		
		Decrypter data2 = new Decrypter();
		decryptedData = data2.decryptInteger(integerData);
		
	//print decrypted data
		
		System.out.print("The new Decrypted integer is: ");
		for(int c = 0; c < 4; c++) {
			System.out.print(decryptedData[c]);
		}
	}
}
