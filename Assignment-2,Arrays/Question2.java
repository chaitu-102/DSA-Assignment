import java.util.HashSet;
import java.util.Set;

public class Question2 {

        public int distributeCandies(int[] candyType) {
            Set<Integer> s = new HashSet<>();
            for (int c : candyType) {
                s.add(c);
            }
            return Math.min(candyType.length >> 1, s.size());
        }
        public static void main(String[] args) {
            int[]candyType={1,1,2,2,3,3};
            Question2 eat=new Question2();
            System.out.println(eat.distributeCandies(candyType));
        }
    }

