import java.util.Scanner;

/*
 * 기존의 코드는 유지하되 뺄셈 연산 로직을 작성 후 git merge 를 이용해 병합하세요.
 */

public class KimMintae {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("X 와 Y 값을 입력받아 덧셈 연산을 하시오.");
		
		System.out.print("Input X value : ");
		int x = scanner.nextInt();
		System.out.print("Input Y value : ");
		int y = scanner.nextInt();
		
		int sum = x + y;
		System.out.print("값 : " + sum);
		
		//Write a minus operation code below.
		
		scanner.close();
	}
}