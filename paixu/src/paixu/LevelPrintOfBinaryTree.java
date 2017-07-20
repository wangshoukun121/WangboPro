package paixu;


public class LevelPrintOfBinaryTree<E extends Comparable<E>> {  
    public static void main(String[] args) {  
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();  
        {  
            tree.InsertNode(4);  
            tree.InsertNode(2);  
            tree.InsertNode(1);  
            tree.InsertNode(3);  
            tree.InsertNode(6);  
            tree.InsertNode(5);  
            tree.InsertNode(7);  
            tree.InsertNode(8);  
        }  
        System.out.print("PreOrderPrint: ");  
        tree.getRoot().PreOrderPrint();  
        System.out.print("\nInOrderPrint: ");  
        tree.getRoot().InOrderPrint();  
        System.out.print("\nPostOrderPrint: ");  
        tree.getRoot().PostOrderPrint();  
        
    }  
}  