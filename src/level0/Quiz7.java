package level0;

import java.util.Scanner;

/*
문제 : 문자열 돌리기

문제 설명
문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 10

입출력 예
입력 #1

abcde
출력 #1

a
b
c
d
e
*/
public class Quiz7 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(1<=str.length() && str.length()<=10) {
        	for(char c : str.toCharArray()) {
        		System.out.println(c);
        	}
        }else {
        	System.out.println("입력값이 제한사항을 충족하지 않습니다.");
        }
        
    }
}












