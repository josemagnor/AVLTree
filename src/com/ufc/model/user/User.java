package com.ufc.model.user;


public class User {
    public int registration;
    public String name;
    public String academicUnit;
    public String course;
    private enum Modality{PRESENCIAL,DISTANCE};

    //parameterized constructor
    public User( int registration, String name, String academicUnit, String course)  
    {  
    	this.registration = registration;
    	this.name = name;
    	this.academicUnit = academicUnit;
    	this.course = course;  
    }
    
    //default constructor to create null node   
    public User()
    {  
      
    }
    
    
    @Override
	public String toString() {
		return "Registration: "+this.registration+", Name: "+this.name+", Academic Unity: "+this.academicUnit+", Course:  "+this.course+", Modality: "+Modality.DISTANCE.toString();

    	
    }
}
