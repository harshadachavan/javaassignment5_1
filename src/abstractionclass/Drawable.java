package abstractionclass;
/*
 * Abstract classes are the classes which have abstract keyword in their class definition
 * It can have abstract and non-abstract methods.
 * Abstract classes cannot be instantiated, but they can be sub classed.
 * If a class includes abstract methods, then the class itself must be declared abstract
 * */
public abstract class Drawable {
	
	//An abstract method is a method that is declared without an implementation 
	 abstract void draw();
	 
	 public void area(int areasize) {
		 System.out.println("The Area of this Shape is "+ areasize);
	 }
}
