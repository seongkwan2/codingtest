package level0_1;

/*
문제 : 문자열 섞기

문제 설명
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ str1의 길이 = str2의 길이 ≤ 10
str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.

입출력 예
str1	str2	result
"aaaaa"	"bbbbb"	"ababababab"
 */
public class Quiz10 {
    public String solution(String str1, String str2) {
        String answer = "";
        int length = str1.length();

        for (int i = 0; i < length; i++) {
            answer += str1.charAt(i); // str1의 i번째 문자를 추가
            answer += str2.charAt(i); // str2의 i번째 문자를 추가
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz10 quiz = new Quiz10();

        String str1 = "aaaaa";
        String str2 = "bbbbb";

        String result = quiz.solution(str1, str2);
        System.out.println(result); // 결과 출력
    }
}
