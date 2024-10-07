package sdmcet.cse.oop.interfaces;
interface a1{
	int b=20;
	void display1();
}
interface a2{
	int a=10;
	void display2();
}
class Demo implements a1,a2{
	public void display1() {
		System.out.println("value of b is:"+b);
	}
	public void display2() {
		System.out.println("value of a is:"+a);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Demo ref1 = new Demo();
		ref1.display2();
		ref1.display1(); 
	}

}
