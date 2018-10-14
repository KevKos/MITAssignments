
class PracticeCode {
	
	
}

//note: cannot use static in a in a general class function

class Box {
	 int width, height, depth;
	 
	 Box (int w, int h, int d){
		 this.width=w; this.height=h; this.depth=d;
	 }
	 
	 int Volume() {
		 return this.width*this.height*this.depth;
	 }
	
}

class objectOrientedStyle {
	
	static double Volume (Box box) {
		return box.width*box.height*box.depth;
	}
	
	public static void main(String[] args) {
		
		Box newbox = new Box(5,6,7);
		System.out.println("This is calculating volume of a box using static method" + Volume(newbox));
		System.out.println("This is it calculating volume of a box using object oriented method" + newbox.Volume());
	}
	
}