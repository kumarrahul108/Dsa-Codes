
// Linked List Using Collections FrameWork 


import java.util.Collections;
import java.util.LinkedList;


public class P1_LL_Collections 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(45);
        l1.add(78);
        l1.add(22);
        l1.add(89);

        l1.addFirst(55);
        l1.addLast(99);

        l1.add(2, 67);

        System.out.print("Linked List :  " + l1);

        int size = l1.size();
        System.out.print("\nSize of List  : " + size);  

        System.out.print("\nElemets in Linked List :  ");
        for(int i=0;i<size;i++)
        {
            System.out.print(l1.get(i) + "   ");
        }

        System.out.print("\nIndex 3 value :  " + l1.get(3));

        l1.remove(2);
        l1.removeFirst();
        l1.removeLast();

        System.out.print("\nUpdated Linked List " + l1);

        // Reversing a Linked List 
        Collections.reverse(l1);
        System.out.print("\n\nReversed Linked List  :  " + l1); 

    }
}