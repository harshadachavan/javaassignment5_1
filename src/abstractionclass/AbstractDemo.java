package abstractionclass;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		sq.draw(); //Here the declaration of draw is called
		
		/*
		 * When an abstract class is sub classed, 
		 * the subclass usually provides implementations 
		 * for all of the abstract methods in its parent class.
		 * */
		sq.area(123); 
	}

}
