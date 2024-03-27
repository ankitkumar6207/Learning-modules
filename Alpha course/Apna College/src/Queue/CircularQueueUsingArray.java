package Queue;

public class CircularQueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front =-1;
        Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull()
        {
           return (rear+1)%size==front;
        }

        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("array is full so can't enquew");
                return;

            }
            //adding the first element
            if(front == -1)
            {
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
//        1 2 3

        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("array is empty");
                return -1;
            }
            int result = arr[front];
            //delete last element
            if(rear == front)
            {
                front = rear = -1;

            }
            else{
                front = (front+1)%size;
            }
            return result;

        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("array is empty");
                return -1;
            }
            return arr[front];

        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }



    }
}
