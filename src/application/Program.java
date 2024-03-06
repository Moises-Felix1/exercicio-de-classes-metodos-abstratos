package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> lista = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberf = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < numberf; i++) {
			System.out.println("Shape #"+(i+1)+" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(answer == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				lista.add(new Rectangle(color, width, height));
			}else {
				if(answer == 'c') {
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					lista.add(new Circle(color, radius));
				}
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape form : lista) {
			System.out.printf("%.2f\n", form.area());
		}
		sc.close();
	}

}
