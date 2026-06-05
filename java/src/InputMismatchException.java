import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요.");
        int sum = 0, n = 0;
        for(int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scanner.nextInt();
                sum += n; // 정상적으로 정수를 입력받았을 때만 sum에 더합니다.
            }
<<<<<<< HEAD
            catch(java.util.InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                scanner.next(); // 잘못된 입력을 버립니다.
                i--; // 다시 입력받기 위해 i를 감소시킵니다.
=======
            catch(InputMismatchException e) {
                scanner.nextLine();
>>>>>>> 5d8821bb2976438adf50be4c57f59ea4087c9c18
            }
        }
        System.out.println("입력된 정수의 합은 " + sum + "입니다.");
        scanner.close(); // Scanner 자원 해제
    }
}
