package OverridingPolymorphism;

class Fruit
{
	String name,taste,size;
	
	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	void eat()
	{
		System.out.println("\n\n name of fruit : " + name);
		System.out.println("taste of fruit : " + taste);
		System.out.println(" size of fruit : " + size);
	}
}

class Apple extends Fruit
{
	public Apple (String name, String taste, String size) 
	{
		super(name, taste, size);
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	void eat()
	{
		System.out.println("\n\n name of fruit : " + name);
		System.out.println("taste of fruit : " + taste);
		System.out.println(" size of fruit : " + size);
	}
}

class Orange extends Fruit
{
	public Orange (String name, String taste, String size) 
	{
		super(name, taste, size);
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	void eat()
	{
		System.out.println("\n\n name of fruit : " + name);
		System.out.println("taste of fruit : " + taste);
		System.out.println(" size of fruit : " + size);
	}
	
}


public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit("Puppy","Sweet","Big");
		Apple a = new Apple("Apple","Sweet & delecious","Mediam");
		Orange or = new Orange("Orange","Sweet-Tart","Small");
		f.eat();
		a.eat();
		or.eat();
	}

}
