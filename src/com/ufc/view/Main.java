package com.ufc.view;
import com.ufc.model.user.*;
import java.util.Scanner;
import com.ufc.model.structure.avlTree.*;


public class Main {
	
	//private User user = new User(88,"nome","unidade academica", "curso");
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //creating Scanner class object to get input from user  		
		Scanner sc = new Scanner(System.in);  
  
        // create object of ConstructAVLTree class object for costructing AVL Tree  
        AVLTree obj = new AVLTree();
        
        User u = new User(10,"José","Crateus","SI");
        User u1 = new User(8,"Pedro","Crateus","SI");
        User u2 = new User(11,"João","Crateus","SI");
        User u3 = new User(7,"Antonio","Crateus","SI");
        User u4 = new User(12,"Henrique","Crateus","SI");
        User u5 = new User(6,"Francisco","Crateus","SI");
        
        obj.insertElement(u);
        obj.insertElement(u1);
        obj.insertElement(u2);
        obj.insertElement(u3);
        obj.insertElement(u4);
        obj.insertElement(u5);
        
        obj.inorderTraversal();

        
        
        // a arvore avl está inserindo o usuário como se deve e está guardando seus valores e imprimindo
        
        
        
        
        char choice;
       // mainUSer(args);
        
        
        //initialize a character type variable to choice   
         
        // perform operation of AVL Tree using switch  
       /* do      
        {  
            System.out.println("\nSelect an operation:\n");  
            System.out.println("1. Insert a node");  
            System.out.println("2. Search a node");  
            System.out.println("3. Get total number of nodes in AVL Tree");  
            System.out.println("4. Is AVL Tree empty?");  
            System.out.println("5. Remove all nodes from AVL Tree");   
            System.out.println("6. Display AVL Tree in In order");  
  
            //get choice from user  
            int ch = sc.nextInt();              
            switch (ch)  
            {  
                case 1 :   
                    System.out.println("Please enter an element to insert in AVL Tree\n");  
                    obj.insertElement( sc.nextInt());                       
                    break;                            
                case 2 :   
                    System.out.println("Enter integer element to search\n");  
                    System.out.println(obj.searchElement( sc.nextInt() ));  
                    break;                                            
                case 3 :   
                    System.out.println(obj.getTotalNumberOfNodes());  
                    break;       
                case 4 :   
                    System.out.println(obj.checkEmpty());  
                    break;       
                case 5 :   
                    obj.removeAll();  
                    System.out.println("\nTree Cleared successfully");  
                    break;  
                case 6 :   
                    System.out.println("\nDisplay AVL Tree in In order");  
                    obj.inorderTraversal();  
                    break;  
                default :   
                    System.out.println("\n ");  
                    break;      
            }  
            System.out.println("\nPress 'y' or 'Y' to continue \n");  
            choice = sc.next().charAt(0);                          
        } while (choice == 'Y'|| choice == 'y');   
        */
        sc.close();
        
	}
	
	/*
	public static void mainUSer(String[] args) {
		AVLTree obj = new AVLTree();
		Scanner sc = new Scanner(System.in);
		User user = new User();
		
		int registration;
	    String name;
	    String academicUnit;
	    String course;
		
		//System.out.println("****************CREATE USER ******************");
		System.out.println("WHAT YOUR REGISTRATION NUMBER?");
		registration = sc.nextInt();
		System.out.println("WHAT YOUR NAME?");
		name = sc.nextLine();
		System.out.println("WHAT YOUR ACADEMIC UNIT?");
		academicUnit= sc.nextLine();
		System.out.println("WHAT YOUR COURSE?");
		course= sc.nextLine();
		
		
	}*/
	
}
