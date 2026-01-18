import java.util.Scanner;

public class InvertedRightAngledAlpha {
    void print1(int row){
        for(int i = 0; i <= row; i++){
            for(char ch = 'A'; ch <='A' + (row - i - 1); ch++){
                System.out.print(ch + " ");
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

        InvertedRightAngledAlpha pattern = new InvertedRightAngledAlpha();
        pattern.print1(rows);

    
    }
}
