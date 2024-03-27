package ArrayList;

import java.util.ArrayList;


public class PairSumSortedRotated {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int bp = -1;
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp = i;
                break;
            }
        }
        int n = list.size();
        int lp =bp+1;
        int hp = bp;
        while(lp!=hp)
        {
            if(list.get(lp)+list.get(hp)== target)
            {
                return true;
            }
            else if(list.get(lp)+list.get(hp)<target){
                lp = (lp+1)%n;
            }
            else {
                hp = (n+hp-1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 100;
        boolean result =pairSum(list,target);
        System.out.println(result);

    }


}

