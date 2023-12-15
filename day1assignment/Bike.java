package week1.day1assignment;

public class Bike extends Car{

	public static void main(String[] args) {
		Bike obj1=new Bike();
		obj1.applyBreak();
		obj1.soundHorn();
		Car obj2=new Car();
		obj2.applyBreak();
		obj2.soundHorn();
	}

}
