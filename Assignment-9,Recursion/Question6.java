import java.util.Scanner;

public class Question6 {
    public int getProgression(int a,int d,int n){
    
    return a+(n-1)*d;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first Number in the series::");
        int a=s.nextInt();
        System.out.print("Enter the Common difference between the numbers::");
        int d=s.nextInt();
        System.out.print("Enter the Nth element to get::");
        int n=s.nextInt();
        Question6 progression=new Question6();
        System.out.println(progression.getProgression(a,d,n));
    }
}
