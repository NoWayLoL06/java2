import java.util.Scanner;
public class midterm {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("시작 수를 입력하세요: ");
        int startNum = scanner.nextInt();

        System.out.print("끝 수를 입력하세요: ");
        int EndNum = scanner.nextInt();

        System.out.print("찾고자 하는 배수를 입력하세요: ");
        int Multiple = scanner.nextInt();

        int a = 0; // 배수 개수
        for(int i=startNum; i<=EndNum; i++) {
		    if(i%Multiple==0) {
                a = a+1;
		    } 
        }
        System.out.println(startNum + " 에서 " + EndNum + " 까지의 사이의 " + Multiple + " 의 배수는 " + a + " 개입니다.");
        
        System.out.println("그 수는 다음과 같습니다.");

        for(int i=startNum; i<=EndNum; i++) {
		    if(i%Multiple==0) {
			    System.out.print(i+ " ");
		    }   
        }
    }
}