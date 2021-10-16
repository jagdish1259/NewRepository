package test2;

public class statinst {
	{System.out.println("1st inst block");}
	static {System.out.println("1st stat block");}
	statinst(){System.out.println("construct");}
	public static void main(String[] args) {
		statinst t=new statinst();
		System.out.println("main");
		statinst t1=new statinst();
	}
	static {System.out.println("stat block");}
	{System.out.println("inst block");}
}
