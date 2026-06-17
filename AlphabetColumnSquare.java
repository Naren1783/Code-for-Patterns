import java.util.*;
public class AlphabetColumnSquare{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Pattern : ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
