import java.util.HashSet;

public class Question8 {
    public int[] num(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int duplicate = 0;
        int actualSum = 0; 
        
      

        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
                actualSum += num;
            }
        }

        int missingNum = sum - actualSum;
        result[0] = duplicate;
        result[1] = missingNum;

        return result;
    }
		
	

	public static void main(String[] args) {
      int[] nums = {1, 2, 2, 4};
        
        Question8 error = new Question8();
        int[] result = error.num(nums);
        
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(result[i]);
        }
        System.out.println("]");
    }
      
}
