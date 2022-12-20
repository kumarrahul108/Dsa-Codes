
// Ques 2 :  Check whether a Linked List is pallindrome or not !

class LL3 
{
    Node head;

    public class Node
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    
    // Add elements 
    public void addFirst(int data)
    {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void addLast(int data) 
    {
        Node n = new Node(data);

        // Base 
        if(head == null)
        {
            n.next = head;
            head = n;
        }

        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }

        ptr.next = n;
        n.next = null;
    }


    // display 
    public void display()
    {
        // Base
        if(head == null)
        {
            System.out.println("Empty L.L ");
        }

        Node ptr = head;

        while(ptr != null)
        {
            System.out.print(ptr.data + "  --> ");
            ptr = ptr.next;
        }
        System.out.print("null");  

    }


    // delete
    public void removeFirst()
    {
        // base
        if(head == null)
        {
            System.out.println("Empty LL");
        }

        head = head.next;
    }

    public void removeLast()
    {
        // base
        if(head == null)
        {
            System.out.println("Empty LL");
        } 

        Node ptr = head;
        while(ptr.next.next != null)
        {
            ptr = ptr.next;
        }

        ptr.next = null;
    }


    // reverse 
    public Node reverse(Node head)
    {
        Node p = head;
        Node c = head.next;

        while(c != null)
        {
            Node n = c.next;
            c.next = p;

            // update
            p = c;
            c = n;
        }

        return p;
    }

    // middle
    public Node middle(Node head)
    {
        Node h = head;
        Node t = head;

        while(h.next != null && h.next.next != null)
        {
            h = h.next.next;
            t = t.next;
        }

        return t;
    }

    // pallindrome 
    public boolean isPaliind(Node head)
    {
        // Base
        if(head == null || head.next == null)
        {
            return true;
        }

        Node mid = middle(head);  // 1st half ka end

        Node secondhalf = reverse(mid.next);
        Node firsthalf = head; 

        while(secondhalf != null)
        {
            if(secondhalf.data != firsthalf.data)
            {
                return false;   
            }

            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }

        return true;
    }

}


public class P4_Ques_2  
{
    public static void main(String[] args) 
    {
        LL3 l3 = new LL3();

        l3.addFirst(34);
        l3.addFirst(78);
        l3.addLast(89);
        l3.addLast(55); 
        l3.addFirst(45);
        l3.addLast(37);  

        l3.display();

        l3.removeFirst();
        l3.removeLast();

        System.out.println("\n");
        l3.display();

        if(l3.isPaliind(l3.head)) 
        {
            System.out.println("\n\nPallindrome List");
        }
        else 
        {
            System.out.println("\n\nNon - Pallindrome List ");
        }
    }    
}
