import java.util.Scanner;

public class RepetetiveAlphaTriangle {
    void print1(int row){
        for(int i = 0; i <= row; i++){
            char ch =(char) ('A' + i);
            for(int j = 0; j <= i; j++){
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

        RepetetiveAlphaTriangle pattern = new RepetetiveAlphaTriangle();
        pattern.print1(rows);

    
    }
}
