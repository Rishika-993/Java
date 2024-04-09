
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Shape rect = new Shape();
		rect.area(10,20);
		Shape square = new Shape();
		square.area(10);
	}
}
class Shape{
    void area(int length, int breadth){
    int ar = length*breadth;
    System.out.println("Area of rectangle = "+ ar);
    }

void area(int length){
    int as = length*length;
    System.out.println("Area of square = "+ as);
}

void area(double r){
    double ac = 3.14*r*r;
}
}