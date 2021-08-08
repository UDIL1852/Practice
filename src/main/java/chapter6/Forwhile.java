package chapter6;

import java.util.Scanner;

public class Forwhile {
    public static void main(String[] args) {
        int num = 0;

        while (num < 5) { // 반복조건
            System.out.println("I like java" + num); // 반복영역
            num++;
        }

        // while 은 선 검사 후 실행

        //do {
        //System.out.println("I like java" + num); // 반복영역
        //num++;
        //}while (num < 5); // 반복조건

        //문제 1
        //1 부터 99 까지의 합을 while을 이용해서 구해라

        //int q1 = 1;
        //int sum = 0;


        //while (q1 <= 99){
        //sum += q1;
        //q1++;
        //System.out.println("1 부터 99까지의 합은? =" +sum );}
        //아니 나는 sum 을 모르는데 합을 치라고 하네. .. 구글링으로 하는법 알아냄

        //문제 2
        //1부터 100까지 출력하고 이어서 100부터 1까지 출력하는 프로그렘을 만들고 while과 do~while을 한번씩 사용해서 구현해라.

        int q2 = 1;
        while (q2 <= 100) {
            System.out.println("1부터 100까지 = " + q2);
            q2++;
        }
        do {
            System.out.println(" 100 부터 1까지 =" + --q2);
        } while (q2 > 1);
        //while(num <= 100)
        //System.out.println(num++);

        //1부터 10까지 곱하기
        int ans = 1;{ //맨 처음에 a1과 곱할 변수
            for (int a1 = 1; a1 <= 10; a1++) //a1에 1을 주고 10이랑 같거나 작을때까지 반복 a++
                ans *= a1; //변수 1을 a1과 곱샘, 후에 2, 3... <=10 될때까지 순차적으로 올라가며 반복
            System.out.println(ans);
        }

        //2부터 8까지 곱셈 만들기
        int ans2 = 1;{
            for (int a2 = 2; a2 <= 8; a2++)
                ans2 *= a2;
            System.out.println(ans2);
        }

        // 구구단 5단 만들기
        int ans3 = 5;{
            for (int a3 = 1; a3 <= 9; a3++)
                ans3 *= a3;
            System.out.println(ans3);

            //위에껀 5*1*2*3 이런식으로 9 까지 곱한거고 구구단 5단은 어떻게 해야할까
            //아래는 답안지인데 해부 해보자
            for(int i = 1; i < 10; i++) //i엔 1을 뒀고 10보다 적을때까지 반복을 시켰다
                System.out.println("5 x " + i + " = " + (5 * i)); // 문장을 5 X i = (5*i)로 뒀는데 1 하나가 지날때마다 숫자가 알아서 승격하는건가?

            //그러면 구구단 6단도 만들어보자
            for (int a4 = 1; a4 < 10; a4++) // a4 시작을 1로 두고 10보다 작을때까지 반복시킴
                System.out.println("구구단 6단 =" + (6 * a4)); // 6 * a4(1~9) 반복출력
        }

    }
}
