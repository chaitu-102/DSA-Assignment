import java.util.Scanner;
public class Question7 {
    public boolean isMonotonic(int[] nums) {
         
       
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]) {
                
                for(int j = i + 1; j < nums.length - 1; j++){
                    if(nums[j] > nums[j + 1]) return false;
                }

                return true;
            }else if(nums[i] > nums[i + 1]) {
                
                for(int j = i + 1; j < nums.length - 1; j++){
                    if(nums[j] < nums[j + 1]) return false;
                }

                return true;
            }
        }

        return true;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int size;
        System.out.println("Enter the Size of the array::");
        size=s.nextInt();
        int[]nums=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Values::");
            int value=s.nextInt();
            nums[i]=value;
        }
        Question7 mono=new Question7();
        System.out.println(mono.isMonotonic(nums));
    }
}

