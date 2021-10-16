package test2;

public class child extends instcontflow{
		int x=100;
		{m2();
		System.out.println("child 1st");
	}
		child(){
			System.out.println("child const.");
		}
		public static void main(String[] args) {
			child d= new child();
			System.out.println("child main");
		}
		public void m2() {
			System.out.println(y);
		}
		{
			System.out.println("2nd child block");	
		}
		int y=200;
		}
