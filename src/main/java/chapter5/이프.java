package chapter5;

public class 이프 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        //if 문
        if(n1 < n2)
            System.out.println("n1 < n2 is true"); //n1 < n2 면 실행되는 문장


            //if ~ else 문
            if (n1 == n2)
                System.out.println("n1 == n2 is true");

            else
                System.out.println("n1 == n2 is false");

        int num = 110;

        if (num < 0) {
            System.out.println(" 0 미만 ");
        }
        else if (num < 100) {
            System.out.println(" 0이상 100미만");
        }
            else {
            System.out.println(" 100 이상 ");
        }


        //아래 코드에서는 두 개의 if를 사용중. 이를 하나의 if만 사용하도록 변경해보자
        //int num1 = 120;
        //if(num1 > 0) {
            //if ((num % 2) == 0)
                //System.out.println("양수이면서 짝수");
        // }

        //내 예상 답변
        int num1 = 120;
        //if(num1 > 0)
         // ((num1 % 2) == 0)
        //System.out.println("양수이면서 짝수");

        //응 아니야 실제 답 이거야 ㅋ
        if(num1 > 0 && (num1 % 2) == 0)
            System.out.println("양수이면서 짝수");

        //조건 연산자 사용 없이 if ~ else문 사용하기
        //문제

        int num2 = 50;
        int num3 = 100;
        int big;
        int diff;

        //big = (num2 > num3) ? num2 : num3;
        //System.out.println("큰 수:" +big); < 100이 출력되야함

        //diff = (num2 > num3) ? (num2 - num3) : (num3 - num2);
        //System.out.println("절대값 : " +diff); < 50이 출력되야함

        //내 답
        //{if (num2 > num3);

        //else if (num2 < num3)
            //System.out.println("정답은? :" + " num2 < num3");
        //}

        //너무 어려워서 답안지 봄...
        if(num2 > num3)
            big = num2;
        else
            big = num3;

        System.out.println(big);

        if(num2 > num3)
            diff = num2 - num3;
        else
            diff = num3 - num2;
        System.out.println(diff);

        // 왜 이 생각을 못했지.....?

        int s = 3;
        {
            if (s < 2)
                System.out.println(" simple 자바");
            if (s > 4)
                System.out.println("Funny java");
            if (s == 3)
                System.out.println("Fantastic java");
        }
        System.out.println("Do you like java? ");

        // 5-3 문제1 답
      //  int n = 3;

        //if(n == 1)
            //System.out.println("Simple Java");
        //else if(n == 2)
            //System.out.println("Funny Java");
        //else if(n == 3)
            //System.out.println("Fantastic Java");
        //else
            //System.out.println("The best programming language");

        //System.out.println("Do you like coffee?");

        int a = 24;

        switch (a){
            case 20:
            System.out.println("Up");
            case 25:
                System.out.println("Down");
            case 24:
                System.out.println("Yes, Im 24years old");
            default:
                System.out.println("이걸 못맞춤?");
        }
        System.out.println("나이 맞추기 게임");


        }
}
