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

    }

}
