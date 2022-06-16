package aplication;

import java.util.Scanner;
import entities.Triangle;
public class Program {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
Triangle x, y;
x = new Triangle();
y = new Triangle();
System.out.println("Enter the measures of triangle X: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("Enter the measures of triangle Y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double areaX = x.area();
double areaY = y.area();

System.out.println ("The area of triangleX is: " + areaX);
System.out.println ("The area of triangleY is: " + areaY);

if (areaX > areaY) {
	System.out.println("The area of triangleX is more larger than triangleY");
}
else {
	System.out.println("The area of triangleY is more larger than triangleX");
}


sc.close();
}
}