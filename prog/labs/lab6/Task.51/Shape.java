/*
Create a Shape class, a Rectangle class and a Circle class as described below.
A shape has the following attributes:
• an x position and a y position.
• a colour (recorded as separate red, green and blue values).
The position records the position of the shape on some grid coordinate system. The colour
records the colour of the shape using the standard red-green-blue colour system (0 to 255).
A circle extends a shape by adding:
• a radius
while a rectangle extends a shape by adding:
• a height and width.
Add appropriate setters and getters for all of the attributes described above
*/

public abstract class Shape
{
	
	
   protected int x;
   protected int y;
   
  // private int centreX;
  // private int centrey;
   
   private int colourRed;
   private int colourGreen;
   private int colourBlue;
  
   
    
    public Shape(int x,int y)
    {
        
    }
    
    public String toString() 
    { 
        return x + " " + y + " " + colourRed + " " + colourGreen + " " + colourBlue; 
    }
 
 
    
    public void setColour (int red, int green, int blue )
    {
    	this.setColourRed(red);
    	this.setColourGreen(green);
    	this.setColourBlue(blue);
    	
    	
    }
    
   public Shape(int x, int y, int red, int green, int blue )
   {
   	this.setX(x);
   	this.setY(y);
   	this.setColourRed(red);
   	this.setColourGreen(green);
   	this.setColourBlue(blue);
   	
   }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getColourRed() {
		return colourRed;
	}

	public void setColourRed(int colourRed) {
		this.colourRed = colourRed;
	}

	public int getColourGreen() {
		return colourGreen;
	}

	public void setColourGreen(int colourGreen) {
		this.colourGreen = colourGreen;
	}

	public int getColourBlue() {
		return colourBlue;
	}

	public void setColourBlue(int colourBlue) {
		this.colourBlue = colourBlue;
	}

	
	public abstract void centreAtCoordinate(int centreX, int centreY);
   
    
    
    
}
    
   


