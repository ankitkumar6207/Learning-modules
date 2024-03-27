package Stack1;

import java.util.ArrayList;

public class Stack_Arraylist {
    static class Stack{
       static  ArrayList<Integer> list = new ArrayList<>();
        //check is stack is empty or not
        public static boolean isEmppty()
        {
            return list.size()==0;

        }
        //push
        public static void push(int data)
        {
            list.add(data);
        }
        //pop
        public static int pop()
        {
            if(isEmppty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek()

        {
            if(isEmppty())
            {
                return -1;
            }
            return list.get(list.size()-1);

        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);;
        s.push(2);;
        s.push(3);
        while(!s.isEmppty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
