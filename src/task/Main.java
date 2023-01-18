package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int flatNumberInTheHouse;
		int floorNumber;
		int entranceNumber;
		int flatsInTheEntrance = 36;
		
		System.out.println("Please enter flat number: ");
		flatNumberInTheHouse = sc.nextInt();

		if (flatNumberInTheHouse < 0 || flatNumberInTheHouse > flatsInTheEntrance * 5) {
			
			System.out.println("Wrong flat number !");
			
		} else {
			
			if (flatNumberInTheHouse % flatsInTheEntrance > 0) {
				entranceNumber = flatNumberInTheHouse / flatsInTheEntrance + 1;
			} else {
				entranceNumber = flatNumberInTheHouse / flatsInTheEntrance;
			}
									
			flatNumberInTheHouse = flatNumberInTheHouse - (entranceNumber - 1) * flatsInTheEntrance;
						
			if (flatNumberInTheHouse % 4 > 0) {
				floorNumber = flatNumberInTheHouse / 4 + 1;
			} else {
				floorNumber = flatNumberInTheHouse / 4;
			}
			
			System.out.println("The flat in the entrance № " +  entranceNumber + " on the floor № " + floorNumber);
						
		}
	
	}

}
