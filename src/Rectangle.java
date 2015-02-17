public class Rectangle {

	private double width, height;
	
	public Rectangle(){
		width=1;
		height=1;
	}
	
	public Rectangle(double w, double h){
		width=w;
		height=h;
	}
	
	public double getArea(){
		return width*height;
	}
	
	public double getPerimeter(){
		return 2*width+2*height;
	}
	
	public double getHeight(){return height;}
	public double getWidth(){return width;}
	
}
