import java.util.Arrays;

public class Question5 {
    
        public int maximumProduct(int[]nums) {
            Arrays.sort(nums);
            int case1 = nums[0]*nums[1]*nums[nums.length-1];
            int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    
            int maxProduct = Integer.max(case1, case2);
            return maxProduct;
        }
        public static void main(String[] args) {
            int[]nums={1,2,3};
            Question5 product=new Question5();
            System.out.println(product.maximumProduct(nums));
        }
 }

