package Automation_MKT;

class Test{

	private String name = "Vikramaditya";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
public class New_Encapsulation {


	public static void main(String[] args) {
		Test t = new Test();
		t.setName("Test");
		System.out.println(t.getName());
	}

}
