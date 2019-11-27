import java.util.Scanner;
public class Begruessung {
	public static void main(String args[]){
		Scanner newScanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie Ihren Namen ein:\n");
		String name = newScanner.next();
		System.out.println("Hallo "+name);
	}
}