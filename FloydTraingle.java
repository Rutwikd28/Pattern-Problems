import java.util.Scanner;

public class FloydTraingle {
    void print1(int row){
        int num = 1;
        for(int i = 0; i <= row; i++){
            for(int j = 0; j<= i;j++){
                System.out.print(num +" ");
                num += 1;
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

        FloydTraingle pattern = new FloydTraingle();
        pattern.print1(rows);

    
    }
}
