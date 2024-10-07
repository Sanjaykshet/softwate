package sdmcet.cse.oop.interfaces;

interface ArithematicOperation{
	int a=12;        // by default static and final 	
	int b=14;
	int calculate(); // by default abstract
}
public class InterfaceDemo implements ArithematicOperation {
// it is mandatory to use the method declared in the sub class
	
	public static void main(String[] args) {
//		objects should be created within the main method only
		InterfaceDemo obj = new InterfaceDemo();
		int a = obj.calculate();
		System.out.println("the sum of two integers are:"+a);
	}
	public int calculate() {	
		int sum = a+b;
		return sum;
	}
}
