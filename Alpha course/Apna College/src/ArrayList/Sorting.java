package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(1);

        System.out.println(list);
        Collections.sort(list); //sorted in ascending order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }

}
