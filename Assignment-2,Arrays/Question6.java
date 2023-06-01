public class Question6 {
    public int search(int[]nums,int target){
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args) {
        int[]nums={-1,0,3,5,9,12};
        int target=9;
        Question6 find=new Question6();
        System.out.println("Found at the index::"+find.search(nums,target));
    }
}
