package Exam01;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani = new Animal();
		System.out.println("���� ���� : " + ani.claw);
		System.out.println("���� ���� : " + ani.tailsize);
		System.out.println("���� : " + ani.pattern);
		System.out.println("�̻� ���� : " + ani.teeth);

		Dog dog = new Dog();
		dog.pattern = "�ٹ���";

		Animal ani2 = dog;
		ani2.pattern = "�����";
		System.out.println(dog.pattern);

	}

}
