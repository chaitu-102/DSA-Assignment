public class Question6 {
    int[]nums={1,2,3,1};
    int count=1;
    public boolean check(){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        if(count>1){
            return true;
        }
        else{
        return false;
        }
    
}

    public static void main(String[]args){
        Question6 d=new Question6();
        System.out.println(d.check());
    }
}
