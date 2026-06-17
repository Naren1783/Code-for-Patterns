import java.util.*;
public class LowercaseAlphabetSquare{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
