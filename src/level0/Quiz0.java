package level0;

import java.util.Scanner;

/*
문제 : 문자열 출력하기

문제 설명
문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 1,000,000
str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.

입출력 예
입력 #1
HelloWorld!

출력 #1
HelloWorld!
 * 
 * */
public class Quiz0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // 문자열의 길이가 1 이상 1,000,000 이하이고 공백이 없는지 확인
        if(1<= str.length() && str.length() <= 1000000 && !str.contains(" ")) {
        	System.out.println(str);
        }else {
        	System.out.println("입력값이 제한사항을 충족하지 않습니다.");
        }
    }
}