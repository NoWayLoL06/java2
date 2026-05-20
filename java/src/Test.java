import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 불러오기

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 (키보드 입력 받을 준비)

        int[] inputs = new int[3]; // 입력값 3개를 저장할 정수 배열 선언

        System.out.print("시작 수를 입력하세요.: "); // 시작 수 입력 안내 메시지 출력
        inputs[0] = scanner.nextInt(); // 입력받은 시작 수를 배열 0번 인덱스에 저장

        System.out.print("끝 수를 입력하세요.: "); // 끝 수 입력 안내 메시지 출력
        inputs[1] = scanner.nextInt(); // 입력받은 끝 수를 배열 1번 인덱스에 저장

        System.out.print("찾고자 하는 배수를 입력하세요.: "); // 배수 입력 안내 메시지 출력
        inputs[2] = scanner.nextInt(); // 입력받은 배수를 배열 2번 인덱스에 저장

        int start = inputs[0];    // 시작 수를 변수에 저장
        int end = inputs[1];      // 끝 수를 변수에 저장
        int multiple = inputs[2]; // 찾을 배수를 변수에 저장

        if (start > end) {   // 시작 수가 끝 수보다 크면 두 값을 서로 바꿔줌 (오름차순 보장)
            int temp = start; // 임시 변수에 start 값 백업
            start = end;      // start에 end 값 대입
            end = temp;       // end에 백업해둔 start 값 대입
        }

        int count = 0;                    // 배수의 개수를 셀 변수 초기화
        for (int i = start; i <= end; i++) {  // start부터 end까지 1씩 증가하며 반복
            if (i % multiple == 0) {          // i가 multiple로 나누어 떨어지면 (배수이면)
                count++;                      // 배수 개수 1 증가
            }
        }

        int[] multiplesArray = new int[count]; // 배수들을 저장할 배열을 count 크기로 선언 (⚠️ 중복 선언 제거)

        int index = 0;                     // 배열에 값을 넣을 위치(인덱스) 초기화 (⚠️ 중복 선언 제거)
        for (int i = start; i <= end; i++) {   // start부터 end까지 다시 반복
            if (i % multiple == 0) {           // i가 배수이면
                multiplesArray[index] = i;     // 배열에 해당 배수 저장
                index++;                       // 다음 저장 위치로 이동
            }
        }

        System.out.println("\n" + start + "부터 " + end + "까지 사이의 " + multiple + "의 배수는 "); // 결과 첫 줄 출력 (⚠️ "사이의" 뒤 공백 추가 권장)
        System.out.print("그 수는 다음과 같습니다." + "\n"); // 결과 두 번째 줄 출력

        System.out.print("["); // 배열 출력 시작 괄호
        for (int i = 0; i < multiplesArray.length; i++) { // 배수 배열을 처음부터 끝까지 반복
            System.out.print(multiplesArray[i]);           // 배수 값 출력
            if (i < multiplesArray.length - 1) {          // 마지막 원소가 아니면
                System.out.print(", ");                    // 쉼표와 공백으로 구분
            }
        }
        System.out.println("]"); // 배열 출력 닫는 괄호 및 줄바꿈

        scanner.close(); // Scanner 객체 닫기 (자원 반납)
    }
}