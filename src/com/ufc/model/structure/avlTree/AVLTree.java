package com.ufc.model.structure.avlTree;
import com.ufc.model.user.*;

public class AVLTree
{
	private AVLNode rootNode;
	  
	    //Constructor to set null value to the rootNode  
	public AVLTree()  
	{  
		rootNode = null;  
	}  
	      
	 //create removeAll() method to make AVL Tree empty  
	public void removeAll() {  
		 rootNode = null;  
	}  
	      
	    // create checkEmpty() method to check whether the AVL Tree is empty or not  
	public boolean checkEmpty(){  
		 if(rootNode == null)  
			 return true;  
	     else   
	    	 return false;  
	}  
	    
	    //create getHeight() method to get the height of the AVL Tree  
	private int getHeight(AVLNode node ){  
		 return node == null ? -1 : node.height;  
	}  
	      
	    
	    //create maxNode() method to get the maximum height from left and right node  
	private int getMaxHeight(int leftNodeHeight, int rightNodeHeight){  
		return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;  
	}  
	      
	
	    // create insertElement() to insert element to to the AVL Tree  
	public void insertElement(User user){  
	        rootNode = _insertElement(user, rootNode);  
	}  
	      	     
	    //create insertElement() method to insert data in the AVL Tree recursively   
	private AVLNode _insertElement(User user, AVLNode node)  
	{  
	        //check whether the node is null or not  
	        if (node == null)  
	            node = new AVLNode(user);  
	        //insert a node in case when the given element is lesser than the element of the root node  
	        else if (user.registration < node.user.registration)  
	        {  
	            node.leftChild = _insertElement(user, node.leftChild );  
	            if( getHeight( node.leftChild ) - getHeight(node.rightChild ) == 2)  
	                if(user.registration < node.leftChild.user.registration )  
	                    node = rotateWithLeftChild( node );  
	                else  
	                    node = doubleWithLeftChild( node );  
	        }  
	        else if( user.registration > node.user.registration )  
	        {  
	            node.rightChild = _insertElement(user, node.rightChild );  
	            if( getHeight( node.rightChild ) - getHeight( node.leftChild ) == 2 )  
	                if( user.registration > node.rightChild.user.registration)  
	                    node = rotateWithRightChild( node );  
	                else  
	                    node = doubleWithRightChild( node );  
	        }  
	        else  
	            ;  // if the element is already present in the tree, we will do nothing   
	        node.height = getMaxHeight( getHeight( node.leftChild ), getHeight( node.rightChild ) ) + 1;  
	          
	        return node;  
	          
	}  
	    
	    
	        
	    // creating rotateWithLeftChild() method to perform rotation of binary tree node with left child        
	private AVLNode rotateWithLeftChild(AVLNode node2){  
	        AVLNode node1 = node2.leftChild;  
	        node2.leftChild = node1.rightChild;  
	        node1.rightChild = node2;  
	        node2.height = getMaxHeight( getHeight( node2.leftChild ), getHeight( node2.rightChild ) ) + 1;  
	        node1.height = getMaxHeight( getHeight( node1.leftChild ), node2.height ) + 1;  
	        return node1;  
	}  
	    
	    // creating rotateWithRightChild() method to perform rotation of binary tree node with right child        
	private AVLNode rotateWithRightChild(AVLNode node1){  
	        AVLNode node2 = node1.rightChild;  
	        node1.rightChild = node2.leftChild;  
	        node2.leftChild = node1;  
	        node1.height = getMaxHeight( getHeight( node1.leftChild ), getHeight( node1.rightChild ) ) + 1;  
	        node2.height = getMaxHeight( getHeight( node2.rightChild ), node1.height ) + 1;  
	        return node2;  
	}  
	  
	    //create doubleWithLeftChild() method to perform double rotation of binary tree node. This method first rotate the left child with its right child, and after that, node3 with the new left child  
	private AVLNode doubleWithLeftChild(AVLNode node3){  
	        node3.leftChild = rotateWithRightChild( node3.leftChild );  
	        return rotateWithLeftChild( node3 );  
	    }  
	  
	    //create doubleWithRightChild() method to perform double rotation of binary tree node. This method first rotate the right child with its left child and after that node1 with the new right child  
	private AVLNode doubleWithRightChild(AVLNode node1)  
	    {  
	        node1.rightChild = rotateWithLeftChild( node1.rightChild );  
	        return rotateWithRightChild( node1 );  
	    }      
	  
	    
	    //create getTotalNumberOfNodes() method to get total number of nodes in the AVL Tree  
	    public int getTotalNumberOfNodes()  
	    {  
	        return _getTotalNumberOfNodes(rootNode);  
	    }
	    
	    
	    private int _getTotalNumberOfNodes(AVLNode head)  
	    {  
	        if (head == null)  
	            return 0;  
	        else  
	        {  
	            int length = 1;  
	            length = length + _getTotalNumberOfNodes(head.leftChild);  
	            length = length + _getTotalNumberOfNodes(head.rightChild);  
	            return length;  
	        }  
	    }
	    
	    public void showleft() {
	    	showleft(rootNode);
	    }
	    
	    private void showleft(AVLNode head) {
	    	int length =1;
	    	length = length + _getTotalNumberOfNodes(head.leftChild);
	    	System.out.println(length);
	    }
	    public void showright() {
	    	showright(rootNode);
	    }
	    
	    private void showright(AVLNode head) {
	    	int length =1;
	    	length = length + _getTotalNumberOfNodes(head.rightChild);
	    	System.out.println(length);
	    }
	  
	  
	    //create searchElement() method to find an element in the AVL Tree  
	    public boolean searchElement(int element)  
	    {  
	        return searchElement(rootNode, element);  
	    }  
	  
	    
	    private boolean searchElement(AVLNode head, int element)  
	    {  
	        boolean check = false;  
	        while ((head != null) && !check)  
	        {  
	            int headElement = head.element;  
	            if (element < headElement)  
	                head = head.leftChild;  
	            else if (element > headElement)  
	                head = head.rightChild;  
	            else  
	            {  
	                check = true;  
	                break;  
	            }  
	            check = searchElement(head, element);  
	        }  
	        return check;  
	    }
	    
	    
	    // create inorderTraversal() method for traversing AVL Tree in in-order form  
	    public void inorderTraversal(){  
	    	_inorderTraversal(rootNode);  
	    }  
	    
		private void _inorderTraversal(AVLNode head){  
	        if (head != null)  
	        {  
	            _inorderTraversal(head.leftChild);
	            System.out.println(head.user.toString());
	            _inorderTraversal(head.rightChild);  
	        }  
	    }  
}
