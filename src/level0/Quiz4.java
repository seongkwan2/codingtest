package level0;

import java.util.Scanner;

/*
문제 : 대소문자 바꿔서 출력하기

문제 설명
영어 알파벳으로 이루어진 문자열 str이 주어집니다.
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 20
str은 알파벳으로 이루어진 문자열입니다.

입출력 예

입력 #1
aBcDeFg

출력 #1
AbCdEfG
 */
public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // 문자열을 문자 배열로 변환하여 각 문자를 변환하고 출력
        char[] charArray = str.toCharArray();
        
        if(1<=str.length() && str.length() <= 20) {
        	for(char c : charArray) {
        		if(Character.isUpperCase(c)) {
        			System.out.print(Character.toLowerCase(c));
        		}else {
        			System.out.print(Character.toUpperCase(c));
        		}
        	}
        }
    }
}