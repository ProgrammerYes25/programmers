public class Lv0_2023_01_01_No_1 {
//    문제 설명(이어풀이)
//    첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,
//    두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
//    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은
//    배열을 return 하도록 solution 함수를 완성해보세요.
//
//    제한사항
//      0 <denum1, num1, denum2, num2 < 1,000
//
//    입출력 예
//    | denum1 | num1 |	denum2 | num2 | result |
//    |   1	   |  2	  |   3	   |  4	  | [5, 4] |
//    |   9	   |  2	  |   1	   |  3	  | [29, 6]|
//    입출력 예 설명
//    입출력 예 #1
//     1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
//    입출력 예 #2
//     9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.

    public static int[] solution(int denum1, int num1, int denum2, int num2){
        int[] answer = new int[2];
        int min, max=1;
        answer[0] = denum1*num2+denum2*num1;
        answer[1] = num1*num2;
        min = answer[0];
        if(min < answer[1]){
            min = answer[0];
        }
        for(int i =1; i<=min; i++) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                max = i;
            }
        }
        answer[0]/=max;
        answer[1]/=max;
        return answer;
    }
    public static void main(String[] args){
        int[] result;
        result = solution(1,2, 3,4);
        System.out.println(result[0]+" "+result[1]);
        result = solution(9,2,1,3);
        System.out.println(result[0]+" "+result[1]);
    }
}
