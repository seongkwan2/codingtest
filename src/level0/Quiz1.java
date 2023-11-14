package level0;

import java.util.Scanner;

/*
문제 : a와 b출력하기

문제 설명
정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

제한사항
-100,000 ≤ a, b ≤ 100,000

입출력 예
입력 #1
4 5

출력 #1
a = 4
b = 5
 */
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (-100000 <= a && a <= 100000 && -100000 <= b && b <= 100000) {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}else {
			System.out.println("입력값이 제한사항을 충족하지 않습니다.");
		}
	}
}