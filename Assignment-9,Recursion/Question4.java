public class Question4{
    public int getPower(int n,int p){
        if(p==1){
            return n;
        }
        return n*getPower(n,p-1);
    }
    public static void main(String[] args) {
        Question4 power=new Question4();
        System.out.println(power.getPower(5,3));
    }
}
