package paixu;
 
  
  
class Node<E>{  
    Node<E> left;  
    Node<E> right;  
    E value;  
    Node(){  
        left = null;  
        right = null;  
        value = null;  
    }  
    Node(E value){  
        this.value = value;  
        left = null;  
        right = null;  
    }  
      
    void PreOrderPrint(){  
        System.out.print(value.toString() + " ");  
        if(left != null)  
            left.PreOrderPrint();  
        if(right != null)  
            right.PreOrderPrint();  
    }  
      
    void InOrderPrint(){  
        if(left != null)  
            left.InOrderPrint();  
        System.out.print(value.toString() + " ");  
        if(right != null)  
            right.InOrderPrint();  
    }  
      
    void PostOrderPrint(){  
        if(left != null)  
            left.PostOrderPrint();  
        if(right != null)  
            right.PostOrderPrint();  
        System.out.print(value.toString() + " ");  
    }  
        
        
}  
  
class BinarySearchTree<E extends Comparable<E>>{  
    private Node<E> root;  
      
    public Node<E> getRoot(){  
        return root;  
    }  
      
    BinarySearchTree(){  
        root = null;  
    }  
      
    public void InsertNode(E value){  
        if(root == null){  
            root = new Node<E>(value);  
            return;  
        }  
        Node<E> currentNode = root;  
        while(true){  
            if(value.compareTo(currentNode.value) > 0){  
                if(currentNode.right == null){  
                    currentNode.right = new Node<E>(value);  
                    break;  
                }  
                currentNode = currentNode.right;  
            }else{  
                if(currentNode.left == null){  
                    currentNode.left = new Node<E>(value);  
                    break;  
                }  
                currentNode = currentNode.left;  
            }  
        }  
    }  
      
}  
  

