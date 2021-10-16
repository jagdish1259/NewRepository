package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lettersort {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("java");
		names.add("python");
		names.add("cplus");
		names.add("scala");
		
	//	List<String> sortName=new ArrayList<>();
		//for(String s:names) {
			//if(s.startsWith("s")) {
				//sortName.add(s);
				
			//	System.out.println(sortName);
			//}
//		}
	
		List<String> sortName=names.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
		System.out.println(sortName);
}
}
