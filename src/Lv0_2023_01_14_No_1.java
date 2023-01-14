public class Lv0_2023_01_14_No_1 {
//  문제 설명
//  문자열 my_string이 매개변수로 주어집니다.
//  my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
//
//  제한사항
//  1 ≤ my_string의 길이 ≤ 1,000
//  입출력 예
//  | my_string	| return |
//  |  "jaron"  | "noraj"|
//  |  "bread"	| "daerb"|
//  입출력 예 설명
//  입출력 예 #1
//  my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
//  입출력 예 #2
//  my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.

    public static String solution(String n){
        String answer = "";
        for(int i=n.length()-1; i>=0; i--){
            answer += n.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        String num = "jaron" ;
        System.out.println(solution(num));
        num = "daerb" ;
        System.out.println(solution(num));
    }
}
