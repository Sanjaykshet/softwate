package sdmcet.cse.oop.finale;
class Demo{
	final int a=25;
	int b;
	final int findSum() {
		return a+b;
	}
	void display() {
//		a=100; cannot assign a new value
		System.out.println("the value of a is:"+a);
	}
}
class Demo1 extends Demo{
//	int findSum() {
//		return 45+34;
//	} cannot be overridden
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
