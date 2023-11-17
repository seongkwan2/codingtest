package level0_2;

/*
문제 : flag에 따라 다른 값 반환하기

문제 설명
두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, 
flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

제한사항
-1,000 ≤ a, b ≤ 1,000

입출력 예
a	b	flag	result
-4	7	true	3
-4	7	false	-11

입출력 예 설명

입출력 예 #1
예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.

입출력 예 #2
예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.

 */


public class Quiz19 {
	public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        
        return answer;
        //return flag ? a + b : a - b; 한줄로 풀이가능
    }

    public static void main(String[] args) {
    	Quiz19 quiz = new Quiz19();
        
        // 예제 입력
        int a1 = -4, b1 = 7;
        boolean flag1 = true;
        int result1 = quiz.solution(a1, b1, flag1);
        System.out.println("Result 1: " + result1); // 예상 출력: 3

        int a2 = -4, b2 = 7;
        boolean flag2 = false;
        int result2 = quiz.solution(a2, b2, flag2);
        System.out.println("Result 2: " + result2); // 예상 출력: -11
    }
}






