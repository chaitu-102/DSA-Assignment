public class Question7{
    int[]nums={0,1,0,3,12};
    public void sort(){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0){
                    int temp=nums[j];
                    nums[j]=0;
                    nums[i]=temp;
                }
        }
    }
        System.out.print("[");
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i]);
            if(i<(nums.length)-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }


    public static void main(String[]args){
    Question7 d=new Question7();
        d.sort();
    }
}