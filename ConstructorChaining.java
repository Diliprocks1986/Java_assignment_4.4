// Program to demonstrate Constructor chaining in Java.

class SuperClass{
	
	// Default Constructor
    SuperClass(){
	System.out.println("Constructor of SuperClass");
   }
}

class Subclass extends SuperClass{
	
   // Default Constructor
   Subclass(){
  //super() must be added first line of constructor otherwise it would throw compilation error: " Constructor call must be the first statement in constructor".
	super();
	System.out.println("Constructor of Subclass");		
   }
   // Overridding Constructor with one args
    Subclass(int num){
   //Compiler adds super() here at the first line of this constructor implicitly
	System.out.println("Constructor with one arg");
   }
   // Display Method to Print Hello
   void display(){
	System.out.println("Hello");
   }
   
}

public class ConstructorChaining{
	public static void main(String args[]){	
//Creating Subclass object with no args	
	Subclass obj= new Subclass(); 
	obj.display();
	//Creating Subclass object with Single args	
	Subclass obj1= new Subclass(1); 
	obj1.display();
	
   }
}

 