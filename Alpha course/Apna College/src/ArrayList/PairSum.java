//find if any pair in a sorted arraylist has a target sum
//return true or false
//1 2 3 4 5  target = 5
//        exist (1,4)(2,3)return true
//        target = 50
//        not exist return false

package ArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum( ArrayList<Integer> list,int target)
    {
        for(int i = 0;i<list.size();i++)
        {
            for(int j =i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==target)
                {
                    return true;
                }
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
        int target = 50;
        boolean result =pairSum(list,target);
        System.out.println(result);


    }
}
