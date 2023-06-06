import java.util.Scanner;

public class Question5{
   
    public int getMax(int[]arr,int n){
    
        if(n==0){
            return arr[n];
        }
       return Math.max(arr[n], getMax(arr, n-1));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Size of the Array::");
        int size=s.nextInt();
       int[]arr=new int[size];
       for(int i=0;i<size;i++){
        System.out.print("Enter the Array elements to insert::");
        int value=s.nextInt();
        arr[i]=value;
       }
       Question5 max=new Question5();
       System.out.println("Maximum element in the array is::"+max.getMax(arr,arr.length-1));
    }
}
