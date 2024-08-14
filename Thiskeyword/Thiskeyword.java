package Java;

class Human8 {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name =n;
	}
}
public class Thiskeyword {

	public static void main(String[] args) {
		Human8 obj = new Human8();
		obj.setAge(30);
		obj.setName("Reddy");
		System.out.println(obj.getName()+":"+obj.getAge());
		
	}

}
