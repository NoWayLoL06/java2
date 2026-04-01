public class Ex35_for {
    public static void main(String[] args) {
        
        System.out.println("구구단을 가로로 출력하는 프로그램");
        System.out.println(" [ 2단 ]\t[ 3단 ]\t[ 4단 ]\t[ 5단 ]\t[ 6단 ]\t[ 7단 ]\t[ 8단 ]\t[ 9단 ]");

        for(int i = 1; i <= 9; i++){
            for(int j =2; j <= 9; j++){
                System.out.print(j + "x" + i + "=" + (i + j) + "\t");
            }
            System.out.println();
        }
        
        
    }
}

