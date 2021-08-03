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

        //부호 연산자
        short n = 5;
        System.out.println(+n); //양수에 + 인 양수 부호를 더 해봤자 의미 없긴할듯
        System.out.println(-n); //이거는 - 를 붙혀서 -5가 될거고

        short n1 = 7;
        short n2 = (short)(+n1); //형 변환을 하지 않으면 오류 발생한다는데 뭔소리지
        short n3 = (short)(-n1);
        System.out.println(n2);
        System.out.println(n3);
        //n 처럼 곧장 프린트를 했어도 됬지만 n2랑 n3라는 새로운 이름을 사용하고 싶어서 n2,n3를 만든듯?

        //증가 및 감소 연산
        // val = ++n, val = --n 은 값을 반환하는게 아닌 실제 변수에 값을 변환하는 것
        int m = 7;
        System.out.println(++m); //7에서 +1이 증가한 것 같은데?
        System.out.println(++m); //7에서 +1이 증가한거에 +1을 시킨건가?
        System.out.println(m); //이건 최종 결과 값인듯

        // val = n++, val = n-- 은 즉시 연산이 되는게 아닌 다음 문장으로 넘어가야 반영이 됨
        int m1 = 5;
        System.out.print((m1++) + " ");
        System.out.print((m1++) + " ");
        System.out.print((m1) + "\n"); // \n은 행 변경임 println은 행을 그때그때 변경시키지만 print는 변경하지않고 출력함

        System.out.print((m1--) + " ");
        System.out.print((m1--) + " ");
        System.out.print(m1);












    }

}
