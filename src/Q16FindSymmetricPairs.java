import java.util.ArrayList;
import java.util.HashMap;

public class Q16FindSymmetricPairs {

    static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }

        // Override toString() for better output
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    private static ArrayList<Pair> findSymmetricPairs(ArrayList<Pair> pairs){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Pair> res = new ArrayList<>();
        for (Pair pair : pairs){
            int x = pair.x;
            int y = pair.y;
            if(map.containsKey(y) && map.get(y) == x){
                res.add(pair);
            }else {
                map.put(x,y);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(2,1));
        pairs.add(new Pair(1,2));
        pairs.add(new Pair(4,3));
        pairs.add(new Pair(8,9));
        pairs.add(new Pair(9,8));
        pairs.add(new Pair(6,2));

        System.out.println(findSymmetricPairs(pairs));
    }
}
