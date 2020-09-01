package lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Shape> shapes = new ArrayList<>();

		shapes.add( new Square("#b7b8b9", 2, 15));

		shapes.add( new Rectangle("#f7f9f5", 2, 4, 7));

		shapes.add( new Circle("#f5f6f5", 2, 5));	

		for(Shape s: shapes)

		{

			System.out.print("Forma geometrica este: ");			

			System.out.println(s.getName());

			System.out.print("Aria este: ");	

			System.out.println(s.getArea());

			System.out.print("Border width: ");	

			System.out.println(s.getBorderWidth());

			System.out.print("Hex color: ");	

			System.out.println(s.getHexFillColor());

			System.out.println();

			s.Draw();

			System.out.println();

		}

	}

}