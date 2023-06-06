import java.util.Scanner;

public class Question3{
    public int find(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*find(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Question3 num=new Question3();
        System.out.print("Enter the number::");
        int n=s.nextInt();
        System.out.println(num.find(n));
    }
    
}
