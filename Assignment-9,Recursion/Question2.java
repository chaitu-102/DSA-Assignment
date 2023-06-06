import java.util.Scanner;

public class Question2{
    public int calculate(int n){
        if(n==1){
            return 1;
        }
        return n+calculate(n-1);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Question2 sum=new Question2();
       System.out.print("Enter the value to calculate::");
       int n=s.nextInt();
        System.out.println(sum.calculate(n));
    }
}