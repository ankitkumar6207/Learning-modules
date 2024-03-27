//adding and removing elements from the linkedlist takes constant time o(1)
package LinkedLIst1;

public class Operation {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data)
    {
        //create a node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        //point to the head
        newNode.next = head;
        //make newNode as head
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print()
    {
        if(head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx,int data)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<idx-1)
        {
            temp = temp.next;
            i++;

        }
        newNode.next  = temp.next;
        temp.next = newNode;
    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1)
        {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key)
    {
        int i =0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == key){
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    public int helper(Node head,int key)
    {
        if(head == null)
        {
            return -1;
        }
        else if(head.data == key) //because when key is in head.data then index must be 0
        {
            return 0;
        }
       int idx = helper(head.next,key);
        if(idx ==-1)
        {
            return -1;
        }
        return idx +1;
    }

    public int recIteration(int key) {
        return helper(head, key);
    }

    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n)
    {
        //calculating size
        int sz= 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            sz++;
        }
        if(sz == n)//remove first (head node)
        {
            head = head.next;
            return;
        }
//        sz -n
        int i =1;
        int itoFind = sz - n;
        Node prev = head;
        while(i<itoFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

//    Slow fast approach to find mid
    public Node findMid(Node haed)

    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //returning mid
    }

    public boolean checkPalindrome()
    {
        if(head == null || head.next==null)

        {
            return  true;
        }
//        step1 : find mid node
       Node minNode = findMid(head);
//        step2 : reverse the 2nd half
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right  = prev;
        Node left = head;

//        step 3 : check left half and right half
        while(right!= null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left =left.next;
            right = right.next;
        }
        return true;


    }

    public static boolean isCycle(){
       Node slow = head;
       Node fast   = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast)
            {
                return true; //cycle exist
            }

        }
        return false;
    }

    public static void removeCycle()
    {
        //detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!= null)
        {
            slow  = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                cycle = true;
                break;
            }
        }
        if(cycle == false)
        {
            return;
        }

        //find the meeting point
        slow = head;
        Node prev = null;
        while(slow!= fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }

        // remove the cycle ->last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {

//        Operation ll =new Operation();
//
//        ll.addFirst(2);
//
//        ll.addFirst(1);
//
//        ll.addLast(3);
//
//        ll.addLast(4);
//        ll.addMiddle(2,9);
//        ll.print();
//        System.out.println(ll.size);
//
//        ll.removeFirst();
//        ll.print();
//
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.itrSearch(3));
//        System.out.println(ll.itrSearch(10));
//        System.out.println(ll.recIteration(3));
//        System.out.println(ll.recIteration(10));
//
////        ll.reverse();
////        ll.print();
//
//        ll.deleteNthfromEnd(2);
//        ll.print();
//
//        System.out.println(ll.checkPalindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
//        1->2->3->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());





    }
}
