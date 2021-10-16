package test2;

public class encpsule {
	private String name;
	private int age;
	private String address;
	
	public encpsule(String naav,int vay,String patta) {
		this.name=naav;
		this.age=vay;
		this.address=patta;
		}
	
	public void setName(String naav) {
		this.name=naav;	}
	public void setAge(int vay) {
		this.age=vay;	}
	public void setAddress(String patta) {
		this.address=patta;	}
	
	public String getName() {
		return name;	}
	public int getAge() {
		return age;	}
	public String getAddress() {
		return address;	}
	
	public String toString() {
		return("student name="+this.getName()+", student age ="+this.getAge()+", address is="+this.getAddress());
		
	}
}
