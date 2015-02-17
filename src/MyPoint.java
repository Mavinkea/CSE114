//Aril Mavinkere, 109681869
public class MyPoint {

	private int x,y;
	
	public MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public MyPoint(){
		x=0;
		y=0;
	}
	
	public int getX(){return x;}
	public int getY(){return y;}
	
	public double distance(int x2, int y2){		
		return Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
	}
	
	public double distance(MyPoint p){
		double dx=Math.pow((p.getX()-x),2);
		double dy=Math.pow((p.getY()-y),2);
		return Math.sqrt(dx+dy);
	}
}
