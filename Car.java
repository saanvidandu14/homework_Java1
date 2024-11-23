package JavaHomeWork;

import java.io.*;

public class Car {
	private String companyName;
	private String modelName;
	private int numberofSeats;
	
	public Car(String companyName,String modelName,int numberofSeats) {
		this.companyName = companyName;
		this.modelName = modelName;
		this.numberofSeats = numberofSeats;
	}
	//method for driveFoward
	public void driveFoward() {
		if (companyName == "Toyoto" & modelName == "Camary") {
			System.out.println("The car can move forward");
		}else {
			System.out.println("The car can't move foward");
		}
		System.out.println("there are " + numberofSeats );
	}
	public void honktheSound() {
				if (modelName == "Camary") {
			System.out.println("This model make very loud sounds when honking");
		}else {
			System.out.println("This does not honk as loud");
		}
	}
	//public static void main(String[] arg) {
		//Car myCar1 = new Car("Toyoto","Camary",5);
		//myCar1.driveFoward();
		//myCar1.honktheSound();
	//}
	
	}

