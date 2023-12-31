package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		RaceCar car = new RaceCar("Mike", 5);
		// 1. Create a RaceCar and place it in 5th position

		// 2. Print the RaceCar's position in the race
		System.out.println(car.getPositionInRace());
		// 3. Crash the RaceCar
		car.crash();
		car.pit();
		for (int mike = 0; mike <= 6; mike++) {
		car.overtake();
		}
		
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
}
