public class Question8 {
    public int calculate(int[] arr,int value){
        if(value==0){
            return arr[value];
        }
    return (arr[value]*calculate(arr, value-1));
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        Question8 multiply=new Question8();
        System.out.println(multiply.calculate(arr,arr.length-1));
    }
}
