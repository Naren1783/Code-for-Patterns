import java.util.*;
public class RightAngledAlphabetTriangle{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
//Output:
//Enter the size : 
//5
//  A 
//  A B 
//  A B C 
//  A B C D 
//  A B C D E 
