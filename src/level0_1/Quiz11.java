package level0_1;

/*
문제 : 문자 리스트를 문자열로 변환하기

문제 설명
문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.


제한사항
1 ≤ arr의 길이 ≤ 200
arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

입출력 예
	arr			result
["a","b","c"]	"abc"
 */
public class Quiz11 {
	public String solution(String[] arr) {
		String answer = "";
		for(String s : arr) {
			answer += s;			//answer에 차례로 문자를 붙힘
		}
		System.out.println(answer);
		return answer;
		//return String.join("", arr); <<한줄로 처리가능
	}

	public static void main(String[] args) {
		Quiz11 quiz = new Quiz11();

		String[] arr = {"a","b","c"};
		
		quiz.solution(arr);
	}
}
