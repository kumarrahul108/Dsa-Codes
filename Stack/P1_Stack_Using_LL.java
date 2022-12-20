
// Stack Using Linked List 


public class P1_Stack_Using_LL 
{
    public static Node head;

    static class Node 
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            next = null; 
        }
    }

    static class Stack 
    {
        // Check for empty 
        public boolean isEmpty()
        {
            if(head == null) 
            {
                return true;
            }
            else 
            {
                return false;
            }
        } 
        
        // insert element into stack   
        public void push(int data)
        {
            Node n = new Node(data);

            // Base
            if(isEmpty())
            {
                head = n;
                return;
            }

            // like adding elements to 1st position 
            n.next = head;  
            head = n;     

        }

        // removing element into stack
        public int pop()
        {
            // Base
            if(isEmpty())
            {
                return -1;
            }

            int top = head.data;
            head = head.next;

            return top; 
        }

        public int peek()
        {
            // Base
            if(isEmpty())
            {
                return -1;
            } 

            int x = head.data;

            return x;
        }

        // display
        public void print()
        {
            // Base
            if(isEmpty())
            {
                System.out.println("Empty Stack !!");
            }

            Node ptr = head;

            while(ptr != null)
            {
                System.out.println(ptr.data);  
                ptr = ptr.next;
            }
        }

    }


    public static void main(String[] args) 
    {
        Stack s1 = new Stack();

        s1.push(67);
        s1.push(34);
        s1.push(12);
        s1.push(56);
        s1.push(76);

        System.out.println("Stack : --> First In Last Out --> ");
        s1.print();

        System.out.print("\n\nPop Elements from Stack  :   " + s1.pop());

        System.out.print("\n\nPeek Elements from Stack  :   " + s1.peek());

        System.out.println("\n\nStack : --> First In Last Out --> ");
        s1.print();

    }
}