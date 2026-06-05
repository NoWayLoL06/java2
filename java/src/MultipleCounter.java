import java.util.Scanner;

public class MultipleCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력값 3개를 배열에 저장한 뒤 각각의 변수에 대입
        int[] inputs = new int[3];
        
        System.out.print("시작 수: ");
        inputs[0] = scanner.nextInt();
        
        System.out.print("끝 수: ");
        inputs[1] = scanner.nextInt();
        
        System.out.print("배수: ");
        inputs[2] = scanner.nextInt();
        
        int start = inputs[0];
        int end = inputs[1];
        int multiple = inputs[2];
        
        // 시작 수가 끝 수보다 클 경우 서로 바꿔 오름차순 보장
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        
        // 첫 번째 반복문: 범위 내 배수의 개수를 센다
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % multiple == 0) {
                count++;
            }
        }
        
        // 배수들을 저장할 배열 생성
        int[] multiples = new int[count];
        
        // 두 번째 반복문: 해당 배수들을 배열에 저장한다
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % multiple == 0) {
                multiples[index] = i;
                index++;
            }
        }
        
        // 결과 출력
        System.out.println("\n[결과]");
        System.out.println("범위: " + start + " ~ " + end);
        System.out.println("배수: " + multiple);
        System.out.println("개수: " + count);
        
        System.out.print("배수 목록: ");
        for (int i = 0; i < multiples.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(multiples[i]);
        }
        System.out.println();
        
        scanner.close();
    }
}
