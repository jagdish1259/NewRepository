package test2;

import java.util.ArrayList;
import java.util.List;

public class reducefunction1 {	public static void main(String[] args) {
	List<Integer> numberList=new ArrayList<>();
	numberList.add(10);
	numberList.add(20);
	numberList.add(30);
	numberList.add(40);
	
	int total=numberList.stream().reduce(0,(ans,i)->ans+i);
	
	System.out.println(total);
}

}
