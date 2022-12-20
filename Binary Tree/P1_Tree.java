
// Binary Tree in Java 


import java.util.*;

public class P1_Tree 
{
    public static Node root;

    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Tree 
    {
        public static int idx = -1;

        public Node buildTree(int nodes[])
        {
            idx++;

            // Base Case 
            if(nodes[idx] == -1)
            {
                return null;
            }  

            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        } 

        // Preorder 
        public void preOrder(Node root)
        {
            // Base 
            if(root == null)
            {
                return;
            }

            System.out.print(root.data + "    ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Post Order 
        public void postOrder(Node root) 
        {
            // Base 
            if(root == null)
            {
                return;
            } 

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "   ");  

        }

        // In Order  
        public void inOrder(Node root)
        {
            // Base 
            if(root == null) 
            {
                return;  
            }

            inOrder(root.left);
            System.out.print(root.data + "   ");
            inOrder(root.right); 

        }

        // Level Order
       public void levelOrder(Node root)
       {
            // Base
            if(root == null)
            {
                return;
            }    

            Queue<Node> q = new LinkedList<>();
            
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node curr = q.remove();

                if(curr == null)
                {
                    System.out.println();

                    if(q.isEmpty())
                    {
                        break;
                    }
                    else 
                    {
                        q.add(null);
                    }
                }

                else 
                {
                    System.out.print(curr.data + "   "); 

                    if(curr.left != null)
                    {
                        q.add(curr.left); 
                    }

                    if(curr.right != null)
                    {
                        q.add(curr.right);
                    }
                }
            }
            
        }  


        // No of Nodes 
        public int noNodes(Node root)
        {
            // Base 
            if(root == null)
            {
                return 0;
            }

            int left = noNodes(root.left);
            int right = noNodes(root.right); 

            return (left + right + 1); 
        }

        // Sum of Nodes
        public int sumNodes(Node root)
        {
            // Base 
            if(root == null)
            {
                return 0;
            }

            int left_sum = sumNodes(root.left);
            int right_sum = sumNodes(root.right);
            
            return (left_sum + right_sum + root.data); 
        }


        // Height of Tree
        public int height(Node root)
        {
            // Base
            if(root == null)
            {
                return 0;
            }

            int left_h = height(root.left);
            int right_h = height(root.right); 

            int ht = Math.max(left_h, right_h) + 1;

            return ht;

        }

        // Diameter of Tree  -> Tn = O(n^2)
        public int diameter(Node root)
        {
            // Base 
            if(root == null) 
            {
                return 0;
            }

            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;

            int dia = Math.max(dia3, Math.max(dia2, dia1)); 

            return dia ;
        }


        // Diameter of Tree  -> Tn = O(n)
        public int diame(Node root)
        {
            
        }


    }


    public static void main(String[] args) 
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Tree t = new Tree();

        root = t.buildTree(nodes);

        System.out.print("\n\n Pre-Order Traversal  :     ");
        t.preOrder(root);

        System.out.print("\n\n Post-Order Traversal  :     ");
        t.postOrder(root);

        System.out.print("\n\n In-Order Traversal  :     ");
        t.inOrder(root);
        
        System.out.print("\n\n Level-Order Traversal  :     \n");
        t.levelOrder(root); 

        System.out.print("\n\nNumber of Nodes In Tree  :  " + t.noNodes(root));

        System.out.print("\n\nSum of Nodes In Tree :   " + t.sumNodes(root));

        System.out.print("\n\nHeight of Tree :  " + t.height(root)); 

        System.out.print("\n\nDiameter of Tree :   " + t.diameter(root));



    }
}