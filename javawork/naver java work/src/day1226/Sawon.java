package day1226;

public class Sawon {
	
	private String sawonName;
	private int age;
	private String hp;
	private String address;
	
	public Sawon() {
		// TODO Auto-generated constructor stub
		
	}

	//생성자 제너레이트

	public Sawon(String sawonName, int age, String hp, String address) {
		
		super();//생략가능
		this.sawonName = sawonName;
		this.age = age;
		this.hp = hp;
		this.address = address;
	}

//private 이기때문에 setter/getter
	
	public String getSawonName() {
		return sawonName;
	}

	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}