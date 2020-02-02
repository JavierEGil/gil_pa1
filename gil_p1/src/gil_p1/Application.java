package gil_p1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int EncryptOrDecrypt = 2;
		int data = -1;
		
		// do while loop that allows multiple data inputs for encryption and ecryption
		do {
			// prompt and collecting data to encrypt, decrypt or leave program
			System.out.println("Enter 0 to encrypt, 1 to decrypt. Enter 2 to exit program. ");
			EncryptOrDecrypt = input.nextInt();
			
			// encryption 
			if (EncryptOrDecrypt == 0)
			{
				// collects value until good one given
				do {
					System.out.println("Enter value to encypt. ");
					data = input.nextInt();
				}
				while (data < 0 || data >= 10000);
				// calls and returns encrypter value
				System.out.printf("Encrypted value is: %04d\n", Encrypter.encrypt(data));
			}
			// decryption
			else if (EncryptOrDecrypt == 1)
			{
				// collects value until good one given
				do {
					System.out.println("Enter value to decypt. ");
					data = input.nextInt();
				}
				while (data < 0 || data >= 10000);
				// calls and returns decrypter value
				System.out.printf("Decrypted value is: %04d\n", Decrypter.decrypt(data));
			}
			// gives error print out and leads to another prompt of entry
			else if (EncryptOrDecrypt != 2)
			{
				System.out.println("Invalid entry. Try Again.");
			}
			
			// To enter loop again and encrypt/decrypt another number
			if (EncryptOrDecrypt == 1 || EncryptOrDecrypt == 0)
			{
				EncryptOrDecrypt = 3;
			}
		}
		while (EncryptOrDecrypt != 2);
		
	}

}
