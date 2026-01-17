import java.util.Scanner;

public class BinaryNumTriangle {
    void print2(int row){
        // 4 star pattern 

        int start = 1;
        for(int i = 0; i < row; i++){
            if(i%2 == 0){
                start = 1;
            }else{
                start = 0;
            }
            for(int j = 0; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        BinaryNumTriangle pattern = new BinaryNumTriangle();
        pattern.print2(rows);

    
    }
}
