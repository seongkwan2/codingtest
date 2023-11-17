package level0_2;

/*
문제 : 조건 문자열

문제 설명
문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

두 수가 n과 m이라면
">", "=" : n >= m
"<", "=" : n <= m
">", "!" : n > m
"<", "!" : n < m
두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 
그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n, m ≤ 100

입출력 예
ineq	eq	n	m	result
"<"	"="	20	50	1
">"	"!"	41	78	0

입출력 예 설명

입출력 예 #1
20 <= 50은 참이기 때문에 1을 return합니다.

입출력 예 #2
41 > 78은 거짓이기 때문에 0을 return합니다.

 */

public class Quiz18 {
	public int solution(String ineq, String eq, int n, int m) {
		 if(ineq.equals(">")) {
	            if(eq.equals("=")) {
	                if(n >= m) {
	                    return 1;
	                } else {
	                    return 0;
	                }
	            } else {
	                if(n > m) {
	                    return 1;
	                } else {
	                    return 0;
	                }
	            }
	        } else {
	            if(eq.equals("=")) {
	                if(n <= m) {
	                    return 1;
	                } else {
	                    return 0;
	                }
	            } else {
	                if(n < m) {
	                    return 1;
	                } else {
	                    return 0;
	                }
	            }
	        }
	    }


	public static void main(String[] args) {
		Quiz18 quiz = new Quiz18();

		int n1 = 5, m1 = 3;
		int n2 = 5, m2 = 5;
		String ineq1 = "<", eq1 = "=";
		String ineq2 = ">", eq2 = "!";

		int result1 = quiz.solution(ineq1, eq1, n1, m1);
		int result2 = quiz.solution(ineq2, eq2, n2, m2);

		System.out.println("Result 1: " + result1); // 예상 결과: 0
		System.out.println("Result 2: " + result2); // 예상 결과: 1
	}
}
