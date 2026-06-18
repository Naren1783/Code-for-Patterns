import java.util.*;
public class IncreasingStarPattern{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size :  ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
//OUTPUT: Enter the size :  
//  5
//  * 
//  ** 
//  * * * 
//  * * * * 
//  * * * * * 
