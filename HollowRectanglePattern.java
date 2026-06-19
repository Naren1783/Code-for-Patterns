import java.util.*;
public class HollowRectanglePattern{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int r= scanner.nextInt();
        int c= scanner.nextInt();
        for(int i=1;i<=r;i++){
            for(int j = 1; j<=c; j++){
                if(i==1 || i==r || j==1 || j==c)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
