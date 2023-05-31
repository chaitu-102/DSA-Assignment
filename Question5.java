public class Question5 {
    public void combine(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    




public static void main(String[] args) {
     int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Question5 combineArray = new Question5();
        combineArray.combine(nums1, m, nums2, n);

        System.out.print("Result: [");
        for (int i = 0; i < nums1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(nums1[i]);
        }
        System.out.println("]");
        
  
}


}
