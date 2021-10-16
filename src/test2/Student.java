package test2;

public class Student {
	
String name;
int age;
String address;

public Student(String naav, int vay, String patta)
{this.name=naav;
this.age=vay;
this.address=patta;
}

public void setName(String naav) {
	this.name=naav;
}
public void setAge(int vay) {
	this.age=vay;
}
public void setAddress(String patta) {
	this.address=patta;
}
public String getName() {return name;}
public int getAge() {return age;}
public String getAddress() {return address;}

public String toString() {
	return(" student name="+ this.getName()+"Age is ="+this.getAge()+"Address is ="+this.getAddress());
}
public static void main(String[] args) {
	Student jj=new Student("JJ",27,"Kothrud");
	System.out.println(jj.toString());
	
	System.out.println(jj.getName());
	System.out.println(jj.getAge());
	System.out.println(jj.getAddress());


}

}
