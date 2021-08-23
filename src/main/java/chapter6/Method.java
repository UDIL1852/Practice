package chapter6;

public class Method {
    public static void main(String[]args){
        int result; //result 값 입력
        result = adder(4,5); //result = [adder (4,5)]의 결과
        System.out.println("4 + 5 = " + result); // result 메소드 결과값을 입력해라
        System.out.println("3.5 x 3.5 = " + square(3.5)); // 출력문 square 메소드에게 3.5를 입력

        System.out.println("프로그램 시작");
        hiEveryone(12);
        hiEveryone(13);
        System.out.println("프로그램 종료");

        divide(4,2);
        divide(6,2);
        divide(9,0); //divide 메소드를 생성 후 그곳에 기입될 숫자들
    }
    public static void divide(int num5, int num6){
        if(num6 == 0) { //만약 num6 이 0이라면 아래 문구 출력
            System.out.println("0으로 나눌 수 없습니다");
            return; //메소드 종료
        }
        System.out.println("나눗셈 결과 : " + (num5 / num6));
    }

    public static void hiEveryone(int age) {
        System.out.println("좋은 아침입니다.");
        System.out.println("제 나이는" + age + "세 입니다.");
    }
    public static int adder(int num1, int num2){ //adder 메소드 int num1에는 4, int num2에는 5 입력
        int addResult = num1 + num2; //addResult 를 왜 쓰는진 모르겠지만 아무튼 result 는 num1(4) + num2(5)
        return addResult; //return 해서 메인 메소드에 있는 출력문에 기입됨
    }
    public static double square(double num){
        return  num * num;
    }
}
