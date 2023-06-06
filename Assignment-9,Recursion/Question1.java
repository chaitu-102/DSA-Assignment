public class Question1{
    public boolean powerOfTwo(int number){
        if(number==1){
            return true;
        }
        if(number<=0){
            return false;
        }
        if(number%2==0){
            return powerOfTwo(number/2);
        }
        return false;
    }
    public static void main(String[] args) {
        Question1 power=new Question1();
        int value=32;
        System.out.println(power.powerOfTwo(value));
    }
}