package operator;

public class Operator1 {

    // 산술 연산자
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b; // 5/2 2,1
        System.out.println("a % b = " + mod);

        // int z = 10 / 0;
        // 0으로 나누는 경우 예외 발생
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
