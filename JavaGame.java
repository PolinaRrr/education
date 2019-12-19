import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int guess = -1;
		int number = random.nextInt(10);
		while(count < 3 && guess !=number) {
			System.out.print("Guess the number 0...9^");
			guess = scanner.nextInt();
		}
	}
}