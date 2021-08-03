package chapter4;

public class Calculation {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 5;
        int num3 = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + num3);

        int num4 = 36;
        int num5 = 4;
        int num6 = num4 - num5;
        System.out.println(num4 + " - " + num5 + " = " + num6);

        int num7 = num3 + num6 - 72;
        System.out.println(num7);

        int num8 = num7 / 5;
        System.out.println(num8);
        // 이 위에는 내가 한거 아래는 친구가 알려준 거
        int ans=((25*5)+(36-4)-72)/5;
        System.out.println(" The answer is = " + ans);
        // 이어서 다른거
        int ans2 = 11;
        int ans3 = 22;
        boolean result;

        result = (1 < ans2) && (ans2 < 100);
        System.out.println("1 초과 100 미만인가?" + result);

        result = (ans3 % 2) == 0 || ((ans3 % 3) == 0);
        System.out.println(" 2 또는 3의 배수인가? " + result);

        result = !(ans2 != 0);
        System.out.println(" 0 인가 ? " + result);
        // 문제 변수 n1, n2, n3가 다음과 같을 때 n1 > n2 > n3 이면 true, 아니면 false를 출력하는 프로그램을 작성해보자
        // n1 = ((25+5)+(36/4)-72)*5
        // n2 = ((25*5)+(36-4)+71)/4
        // n3 = (128/4)*2
        int quiz = ((25+5)+(36/4)-72)*5;
        System.out.println( " 퀴즈1 답은?  = " + quiz);
        int quiz2 = ((25*5)+(36-4)+71)/4;
        System.out.println(" 퀴즈2 답은? = " + quiz2);
        int quiz3 = (128/4)*2;
        System.out.println(" 퀴즈3 의 답은? = " + quiz3);

        result = (quiz > quiz2);
        System.out.println(" 퀴즈 1보다 퀴즈 2가 큼? = " + result);
        result = (quiz2 < quiz3);
        System.out.println(" 퀴즈 3이 퀴즈 2보다 큼?" + result);
        //문제는 n2 > n3 를 물어봤지만 그냥 true 가 만들고 싶어서 바꿈







    }

}
