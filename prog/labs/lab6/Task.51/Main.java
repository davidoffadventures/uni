
import java.util.ArrayList;
public class Main
{
	
	public static void main(String[] args)
	{

		Circle circle1 = new Circle(10, 30);
		circle1.setRadius(100);
		circle1.setColour(10, 30, 50);
		
		
		System.out.println(circle1.getRadius());
		System.out.println(circle1.getColourBlue() + circle1.getColourGreen() + circle1.getColourRed());
		//System.out.printf("%d %d %d%n", circle1.getColourBlue(), circle1.getColourGreen(), circle1.getColourRed());
		//System.out.println(String.format("%d %d %d", circle1.getColourBlue(), circle1.getColourGreen(), circle1.getColourRed()));
		
	
		
		System.out.println(circle1.getArea());
		System.out.println(circle1.getCircumfrence());
		
		System.out.println("Circle " +circle1.toString()); 
		
		Circle circle2 = new Circle(10, 30, 40, 10, 10 ,10);
		
		System.out.println("Circle " +circle2.toString()); 
		
		
	
		
		
		Rectangle rectanlge1 = new Rectangle(10, 20, 100, 200);
		rectanlge1.setColour(10, 30, 40);
		System.out.println("Rectangle " + rectanlge1.toString());
		
		
		
		ArrayList<Shape> shapelist = new ArrayList<Shape>();
		
		
	//	shapelist.add(34534345);
		
		shapelist.add(circle1);
		shapelist.add(circle2);
		shapelist.add(rectanlge1);
		
		
        for (int i = 0; i < shapelist.size(); i++) {
            System.out.println(shapelist.get(i));
           // System.out.println(shapelist.get(i).toString());;
        }
		
		
}
	

}
