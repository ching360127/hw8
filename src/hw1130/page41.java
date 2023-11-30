package hw1130;

public class page29 {
	public static void main(String[] args) {
		Vehicle[] = new Vehicle[2];		
		
		vc[0] =new Car(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] =new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i=0;i<vc.length;i++) {
			vc[i].show();			
		}			
	}
}

abstract class Vehicle {
	protected int speed; 
	
	public void setSpeed(int s) {
		speed =s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}

class RacingCar extends Car {
	private int course;
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為" + course);

	}	
	public void show() {
		System.out.println("塞車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("塞車的編號是"+course);
	}
}