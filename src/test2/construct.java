package test2;

public class construct {
int width;
int height;
int depth;

construct(int wid,int hei,int dep){
	this.height=hei;
	this.depth=dep;
	this.width=wid;
}

construct(int dep,int hei){
	this.height=hei;
	this.depth=dep;
	this.width=10;
}
construct(int dimension){
	height=dimension;
	depth=dimension;
	width=dimension;
}
construct(){
	this.height=10;
	this.depth=10;
	this.width=10;
}
int volume() {
	return height*width*depth;
}

public static void main(String[] args) {
	int volume;
	
	construct v1=new construct(10,20,30);
	volume=v1.volume();
	//System.out.println("="+volume);
	
	construct v2=new construct(10,20);
	volume=v2.volume();
	System.out.println("="+volume);
	
	
}
}
