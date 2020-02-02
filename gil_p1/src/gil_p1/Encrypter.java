package gil_p1;

public class Encrypter {
	// when called, returns encrypted data
	public static int encrypt (int dataToEncrypt) {
		int encryptedData = -1;
		int firstDigit  = 0;
		int secondDigit = 0;
		int thirdDigit  = 0;
		int fourthDigit = 0;
		int tempDigit   = 0;
		
		// adding 7 and getting remainder divided by 10 for each digit.
		firstDigit  = (((dataToEncrypt / 1   ) % 10) + 7) % 10;
		secondDigit = (((dataToEncrypt / 10  ) % 10) + 7) % 10;
		thirdDigit  = (((dataToEncrypt / 100 ) % 10) + 7) % 10;
		fourthDigit = (((dataToEncrypt / 1000) % 10) + 7) % 10;
		
		// swaps firstDigit and thirdDigit
		tempDigit  = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = tempDigit;
		
		// swaps secondDigit and fourthDigit
		tempDigit = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = tempDigit;
		
		// putting in the values to encryptedData
		encryptedData = firstDigit + (secondDigit * 10) + (thirdDigit * 100) + (fourthDigit * 1000);
		
		return encryptedData;
	}
	
}
