
// Ques 1 :  To find the nth node from the end & remove it !


class LL2 
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

    // Add elements to list
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
            return;  
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
        // base
        if(head ==  null)
        {
            System.out.println("Empty List !!");
            return;
        } 

        Node ptr = head;

        while(ptr != null)
        {
            System.out.print(ptr.data + "  -> ");
            ptr = ptr.next;
        }
        System.out.print("null");  
    }

    // delete elemenst
    public void removeFirst()
    {
        // base     
        if(head == null)
        {
            System.out.println("Empty List ");
            return;
        }

        head = head.next;
    }

    public void removeLast()
    {   
        // base     
        if(head == null)
        {
            System.out.println("Empty List ");
            return;
        }   

        if(head.next == null)
        {
            head = null;
            return;
        }


        Node ptr = head;
        while(ptr.next.next != null)
        {
            ptr = ptr.next;
        }

        ptr.next = null; 
       
    }

    public int size()
    {
        // base     
        if(head == null)
        {
            return 0;
        }   

        int s = 0;
        Node ptr = head;
        while(ptr != null)
        {
            s++;
            ptr = ptr.next;
        }

        return s;
    }

    //  Question : 
    public Node remove_nth(Node head,int size,int n)
    {
        // Base - 1
        if(head.next == null)
        {
            return null;
        }

        // Base - 2
        if(n == size)
        {
            return head.next;
        }


        int idx = (size - n); 
        int i = 1;
        Node ptr = head;
        while(i < idx) 
        {
            ptr = ptr.next;
            i++;
        } 

        ptr.next = ptr.next.next;
        return head;  

    } 
}



public class P3_Ques_1 
{
    public static void main(String[] args) 
    {
        LL2 l2 = new LL2();

        l2.addFirst(34);
        l2.addFirst(78);
        l2.addLast(89);
        l2.addLast(55); 
        l2.addFirst(45);
        l2.addLast(37);  

        System.out.print("\nLinked List :   ");
        l2.display();

        l2.removeFirst();
        l2.removeLast();

        System.out.print("\n\nLinked List :   ");
        l2.display();

        int sz = l2.size();  
        
        System.out.print("\n\nNth Node from Last :   " + l2.remove_nth(l2.head, sz,2)); 
        




    }    
}
