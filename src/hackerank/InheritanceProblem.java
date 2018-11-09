package hackerank;

class animal{
	void eat(){
		System.out.println("I am eating");
		}
	void walk(){
		System.out.println("I am walking");
	}
	}
class Bird extends animal{
	void fly(){
		System.out.println("I am Flying");
	}
	void sing(){
		System.out.println("I am singing");
	}
}
public class InheritanceProblem {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.sing();
		bird.eat();
		bird.walk();
	}
}
