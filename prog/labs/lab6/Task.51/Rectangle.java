

public class Rectangle extends Shape
{
	private int height;
	private int width;

	public Rectangle(int x, int y) {
		super(x, y);
		
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}
	
	public Rectangle(int x, int y, int height, int width) {
		super(x, y);
		this.setHeight(height);
		this.setWidth(width);
		
	}
	
	// 	public Rectangle(int x, int y, int height, int width) {
	// 	super(x, y);
	// 	this.setHeight(height);
	// 	this.setWidth(width);
		
	// }
	
	public double areaCalcRect()
	{
		//double pi = 3.14, area;
		//area = pi * radius * radius;
		double area = height*width;
		
		return area;
	}
	
		
	public void centreAtCoordinate(int centreX, int centreY) {
		
		
		 setX(centreX + width / 2);
         setY(centreY + height / 2);	
		
		
	}
	

}