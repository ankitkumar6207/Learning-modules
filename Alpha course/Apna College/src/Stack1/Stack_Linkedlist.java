package Stack1;
//important question asked in interviews
public class Stack_Linkedlist {

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    static class Stack{
        static Node head = null;
        public static boolean isEmppty()
        {
            return head == null;
        }

        //push
        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmppty())
            {
                head = newNode;
                return;
            }
            newNode.next =head;
            head = newNode;
        }

        //pop
        public static int pop()
        {
            if(isEmppty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek()
        {
            if(isEmppty()) {
                return -1;
            }
            return head.data;

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
