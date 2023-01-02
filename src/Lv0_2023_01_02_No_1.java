public class Lv0_2023_01_02_No_1 {
//    문제 설명
//     정수 배열 numbers가 매개변수로 주어집니다.
//     numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
//
//    제한사항
//      -10,000 ≤ numbers의 원소 ≤ 10,000
//      1 ≤ numbers의 길이 ≤ 1,000
//    입출력 예
//    |         numbers	        |           result         |
//    |     [1, 2, 3, 4, 5]     |     [2, 4, 6, 8, 10]     |
//    |[1, 2, 100, -99, 1, 2, 3]|[2, 4, 200, -198, 2, 4, 6]|
//
//    입출력 예 설명
//     입출력 예 #1
//     [1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
//     입출력 예 #2
//     [1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.

    public static int[] solution(int[] numbers){
        int[] answer = new int[numbers.length];
        int i=0;
        for(int ans : numbers){
            answer[i] = ans*2;
            i++;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] result;
        int[] num1 = {1, 2, 3, 4, 5};
        result = solution(num1);
        for(int i: result){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] num2 = {2, 4, 6, 8, 10};
        result = solution(num2);
        for(int i: result){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
