package ch10_1_exception_class;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}



public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			
		Dog dog = (Dog) animal;
		System.out.println("Dog 타입 변환 완료");
	} else {
		System.out.println("Dog 타입이 아닙니다");
		}
	}
}