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
            // 아니 나는 sum 을 모르는데 합을 치라고 하네... 구글링으로 하는법 알아냄

            //문제 2
            //1부터 100까지 출력하고 이어서 100부터 1까지 출력하는 프로그렘을 만들고 while과 do~while을 한번씩 사용해서 구현해라.

        int q2 = 1;
        while (q2 <= 100) {
            System.out.println("1부터 100까지 = " + q2);
            q2++;
        }
        do {
            System.out.println(" 100 부터 1까지 =" + --q2);
        }while (q2 > 1 );
        //while(num <= 100)
            //System.out.println(num++);

    }
}