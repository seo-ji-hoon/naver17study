package jihoon_test;

//Animal (부모)클래스

class Animal {
	
	void sound() {
		System.out.println("Animal makes a sound");
	}
	
}

//Dog 클래스-> Animal 상속
class Dog extends Animal {
	void sound () {
		System.out.println("Dog barks");
	}
}

//Cat 클래스-> Animal 상속
class Cat extends Animal {
	void sound () {
		System.out.println("Cat meows");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal my=new Animal();
		Animal myDog=new Dog();
		Animal myCat=new Cat();
		
		myDog.sound();
		myCat.sound();
	}

}