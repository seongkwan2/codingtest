package level0;

/*
문제 : 문자열 겹쳐쓰기

문제 설명
문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

쉽게말해 문자열 두개를 이용해서 HelloWorld와 ProgrammerS123을 출력할수있게 코드를 해야함

제한사항
my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이

입출력 예
my_string	overwrite_string	s	result
"He11oWor1d"	"lloWorl"	2	"HelloWorld"
"Program29b8UYP"	"merS123"	7	"ProgrammerS123"

입출력 예 설명

입출력 예 #1
예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 
"11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.

입출력 예 #2
예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은 
"29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.
 */
public class Quiz9 {
    public String solution(String my_string, String overwrite_string, int s) {
    	// 주어진 문자열 my_string에서 시작 위치 s 이전의 부분을 추출하여 before에 저장
    	String before = my_string.substring(0,s); // "He"
    	
    	// 주어진 문자열 my_string에서 overwrite_string의 끝 다음 부분을 추출하여 after에 저장
    	String after =  my_string.substring(s + overwrite_string.length()); // "d"
    return before + overwrite_string + after;
    }
    
    public static void main(String[] args) {
		Quiz9 quiz = new Quiz9();	//main에서 Quiz9불러옴
		
		//1번 입출력
		String my_string1 = "He11oWor1d";
		String overwrite_string1 = "lloWorl";
		int s1 = 2;
		
		//2번 입출력
		String my_string2 = "Program29b8UYP";
		String overwrite_string2 = "merS123";
		int s2 = 7;
		
		// 예제 출력
        String result1 = quiz.solution(my_string1, overwrite_string1, s1);
        String result2 = quiz.solution(my_string2, overwrite_string2, s2);
        
        // 결과
        System.out.println(result1);
        System.out.println(result2);
		
	}
    /*문제 이해하기
    my_string이 "He11oWor1d"이고, s가 2, overwrite_string이 "lloWorl"인 경우, 
    my_string에서 인덱스 2부터 2 + overwrite_string의 길이인 9까지의 문자열 "11oWor1"을 
    "lloWorl"로 대체하여 "HelloWorld"를 반환
    */
}

 










