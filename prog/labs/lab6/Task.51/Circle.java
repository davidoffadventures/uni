



public class Circle extends Shape
{
	
	private int radius;

	//public String toString(){//overriding the toString() method  
	//	  return Circle;
	//	 }  

	public Circle(int x, int y) {
		super(x, y);
		
	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.setRadius(radius);
		
	}
	
	public Circle(int x, int y, int radius, int red, int green, int blue) {
		super(x, y,red,green,blue);
		this.setRadius(radius);
		// super(red, green, blue);
		// super.setColourRed(red);
  // 		super.setColourGreen(green);
  // 		super.setColourBlue(blue);
		
	}
	
	
	public double getArea()
	{
		//double pi = 3.14, area;
		//area = pi * radius * radius;
		double area = Math.PI * (radius * radius);
		
		return area;
	}
	
	public double getCircumfrence() {
		
		double circumference;
		
		circumference = Math.PI*2*radius;
		
		return circumference;
		
	}
	public void centreAtCoordinate(int centreX, int centreY) {
		y = centreY;
		setX(centreX);
	}
	

	
}