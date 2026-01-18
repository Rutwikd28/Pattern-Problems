import java.util.Scanner;

public class RightAngledAlphabet {
    void print1(int row){
        for(int i = 1; i <= row; i++){
            for(char ch = 'A'; ch <'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        
        
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        RightAngledAlphabet pattern = new RightAngledAlphabet();
        pattern.print1(rows);

    
    }
}
