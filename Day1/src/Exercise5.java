import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {
		
		double xA,yA, xB, yB;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vui long nhap toa do x cua diem A: ");
		xA = sc.nextDouble();
		System.out.println("Vui long nhap toa do y cua diem A: ");
		yA = sc.nextDouble();
		System.out.println("Vui long nhap toa do x cua diem B: ");
		xB = sc.nextDouble();
		System.out.println("Vui long nhap toa do x cua diem B: ");
		yB = sc.nextDouble();
		
		Point aPoint = new Point(xA,yA);
		Point bPoint = new Point(xB,yB);
		double dist = aPoint.getDistance(bPoint);
		System.out.println("Khoang cach:" + dist);
		
	}


	static class Point{
		private double x;
		private double y;
		
		public Point(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		
		public double getDistance(Point bPoint) {	
			double diffX= bPoint.getX() - this.x;
			double diffY = bPoint.getY() - this.y;
			double distance = Math.sqrt(diffX*diffX+diffY*diffY);
			return distance;
		}
		
	}
}
