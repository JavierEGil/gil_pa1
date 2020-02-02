package gil_p1;

public class Decrypter {
	// when called, returns decrypted data
	public static int decrypt (int dataToDecrypt) {
		int decryptedData = -1;
		int firstDigit  = 0;
		int secondDigit = 0;
		int thirdDigit  = 0;
		int fourthDigit = 0;
		int tempDigit   = 0;
		
		// getting each digit.
		firstDigit  = (dataToDecrypt / 1   ) % 10;
		secondDigit = (dataToDecrypt / 10  ) % 10;
		thirdDigit  = (dataToDecrypt / 100 ) % 10;
		fourthDigit = (dataToDecrypt / 1000) % 10;
		
		// swaps firstDigit and thirdDigit
		tempDigit  = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = tempDigit;
				
		// swaps secondDigit and fourthDigit
		tempDigit = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = tempDigit;
		
		// final restoration
		firstDigit  = (firstDigit  + 3) % 10;
		secondDigit = (secondDigit + 3) % 10;
		thirdDigit  = (thirdDigit  + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;
		
		// putting in the values to encryptedData
		decryptedData = firstDigit + (secondDigit * 10) + (thirdDigit * 100) + (fourthDigit * 1000);
		
		return decryptedData;
	}
	
}
