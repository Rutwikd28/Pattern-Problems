import java.util.Scanner;

public class SquareStarPattern {
    void print1(int row){
       for(int i = 0;i<row;i++){
        for(int j = 0; j<row;j++){
            if(i == 0 || j == 0 || i == row-1 || j == row -1 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
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

        SquareStarPattern pattern = new SquareStarPattern();
        pattern.print1(rows);

    
    }
}
