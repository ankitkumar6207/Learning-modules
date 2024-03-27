package ArrayList;

import java.util.ArrayList;

//same previous question using 2 pointer method but in the case of that the arryalist is sorted
//[1,2,3,4,5] target =5 take linear time complexity
public class PairSumSorted {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp =0;
        int hp = list.size()-1;
        while(lp!=hp)
        {
            if(list.get(lp)+list.get(hp)== target)
            {
                return true;
            }
            else if(list.get(lp)+list.get(hp)<target){
                lp++;
            }
            else {
                hp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        boolean result =pairSum(list,target);
        System.out.println(result);

    }


}
