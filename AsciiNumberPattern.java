import java.util.*;
public class AsciiNumberPattern{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value size : ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print((j+64)+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
