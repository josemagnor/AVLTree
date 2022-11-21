package com.ufc.model.structure.avlTree;
import com.ufc.model.user.*;

public class AVLNode {
    int element;  
    int height;  //for height
    User user;
    AVLNode leftChild;  
    AVLNode rightChild;  
      
    //default constructor to create null node  
    public AVLNode()  
    {  
        leftChild = null;  
        rightChild = null;  
        element = 0;  
        height = 0;  
    }  
    // parameterized constructor  
    public AVLNode(User user)  
    {  
        leftChild = null;  
        rightChild = null;
        this.user = user;
        height = 0;  
    }       
}
