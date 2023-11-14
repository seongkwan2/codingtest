package level0;

import java.util.Scanner;

/*
문제 : 덧셈식 출력하기

문제 설명
두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
a + b = c

제한사항
1 ≤ a, b ≤ 100

입출력 예

입력 #1
4 5

출력 #1
4 + 5 = 9
*/
public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;

        if(1<=a && a<= 100 && 1<=b && b<=100) {
        	System.out.println(a+" + "+ b +" = "+ c);
        }else {
        	System.out.println("입력값이 제한사항을 충족하지 않습니다.");
        }
        
    }
}












