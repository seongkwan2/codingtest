package level0_2;

/*
문제 : n의 배수

문제 설명
정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num ≤ 100
2 ≤ n ≤ 9

입출력 예
num	n	result
98	2	1
34	3	0

입출력 예 설명

입출력 예 #1
98은 2의 배수이므로 1을 return합니다.

입출력 예 #2
32는 3의 배수가 아니므로 0을 return합니다.
 */

class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            // n이 짝수인 경우: n 이하의 모든 양의 짝수의 제곱의 합 계산
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        } else {
            // n이 홀수인 경우: n 이하의 모든 양의 홀수의 합 계산
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }

        return answer;
    }
}

