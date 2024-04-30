import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		
		do {
			System.out.println("입력 Q는 종료.");
			input=scan.nextLine();
			System.out.println(input);
		}while(!input.equalsIgnoreCase("Q"));
		System.out.println("종료");
		
	}
}
