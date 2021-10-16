package test2;

class instcontflow {
int i=10;
{m1();
System.out.println("1st block");}

instcontflow(){
	System.out.println("constructor");
}
public static void main(String[] args) {
	// created object
	instcontflow t= new instcontflow();    
	System.out.println("main");
//	instcontflow t1= new instcontflow(); 
}
public void m1() {
	System.out.println(j);
}
{System.out.println("2nd block");}
int j=20;
}


//class child extends instcontflow{
//	int x=100;
//	{m2();
//	System.out.println("child 1st");
//}
//	child(){
//		System.out.println("child const.");
//	}
//	public static void main(String[] args) {
//		child d= new child();
//		System.out.println("child main");
//	}
//	public void m2() {
//		System.out.println(y);
//	}
//	{
//		System.out.println("2nd child block");	
//	}
//	int y=200;
//	}