public class Question2 {
    public int remove(int [] nums,int val) {
		
		int k=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[k]=nums[i];
				k++;
			}
		}
		
		return k;
		
	}
	
	

	public static void main(String[] args) {
       int[] nums= {3, 2, 2, 3};
       int val=3;
       
       Question2 element= new Question2();
       int k=element.remove(nums, val);
       System.out.println("k : " +k);
       System.out.print("Nums : [ ");
       for(int i=0;i<k;i++) {
    	   if(i>0) {
    		   System.out.print(",");
    	   }
    	   System.out.print(nums[i]);
       }
       System.out.print(" ] ");
       
	
	}
	
 

}

