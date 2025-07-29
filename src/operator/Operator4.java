package operator;

public class Operator4 {

    // 연산자 우선순위
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같음

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 연산자 우선순위가 애매하거나 조금이라도 복잡하다면 괄호 사용해서 가독성 높일것!!

    }
}
