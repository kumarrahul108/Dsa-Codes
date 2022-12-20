
// Using Array - List 

import java.util.*;

public class P2_Stack_Using_ArrayList 
{
    
    static class Stack2
    {
        ArrayList<Integer> list = new ArrayList<>();

        // Empty 
        public boolean isEmpty()
        {
            return list.size() == 0;
        }

        // push
        public void push(int data) 
        {
            list.add(data);
        }

        // pop
        public int pop()
        {
            // Base 
            if(isEmpty())
            {
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);

            return top;
        }

        // peek
        public int peek()
        {
            // Base 
            if(isEmpty())
            {
                return -1;
            }    
            
            return list.get(list.size()-1);
        }

    }

     
    public static void main(String[] args) 
    {
        Stack2 s2 = new Stack2();

        s2.push(67);
        s2.push(45);
        s2.push(13);
        s2.push(39);

        while(!s2.isEmpty())
        {
            System.out.println(s2.peek());
        }


    }    
}
