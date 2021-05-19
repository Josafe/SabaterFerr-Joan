package Getter_Setter;
public class Rectangle{

private int x1;
private int y1;
private int x2;
private int y2;

public Rectangle(int x1, int y1, int x2, int y2){
	
	
	
	if ((x1 < x2) && (y1 < y2))
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	else
	{
		System.err.println("No s'ha pogut instanciar el Rectangle (" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")");
	}
}
	public int getx1() {
		return x1;
	}
	public int gety1() {
		return y1;
	}
	public int getx2() {
		return x2;
	}
	public int gety2() {
		return y2;
	}
	
	public void setx1(int x1) {
		this.x1 = x1;
	}
	public void sety1(int y1) {
		this.y1 = y1;
	}
	public void setx2(int x2) {
		this.x2 = x2;
	}
	public void sety2(int y2) {
		this.y2 = y2;
	}
	}

 
