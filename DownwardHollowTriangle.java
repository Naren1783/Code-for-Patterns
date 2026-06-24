import java.util.Scanner;
public class DownwardHollowTriangle{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n= scanner.nextInt();
        int nsp=1;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
