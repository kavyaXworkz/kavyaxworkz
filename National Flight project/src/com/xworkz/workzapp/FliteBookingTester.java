package com.xworkz.workzapp;

import java.util.Scanner;

import com.xworkz.workzapp.plane.Constant;
import com.xworkz.workzapp.plane.FliteBooking;
import com.xworkz.workzapp.plane.FliteBookingDTO;

public class FliteBookingTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();

		FliteBooking booking = new FliteBooking(size);
		for (int i = 0; i < size; i++) {

			System.out.println("enter the AirplaneCode");
			String code = sc.next();

			System.out.println("enter company");
			String name = sc.next();

			System.out.println("Is booked flight is domestic");
			boolean domestic = sc.nextBoolean();

			System.out.println("enter Startingpoint");
			String point = sc.next();

			System.out.println("enter Destination");
			String dest = sc.next();

			System.out.println("enter totalNoofSeats");
			int seat = sc.nextInt();

			System.out.println("enter BusynessClassprice");
			double busyness = sc.nextDouble();

			System.out.println("enter EconomyClassPrice");
			double economy = sc.nextDouble();

			FliteBookingDTO dto = new FliteBookingDTO();

			dto.setAirplaneCode(code);
			dto.setCompany(Constant.valueOf(name));
			dto.setBusinssClassPrice(busyness);
			dto.setEconomyClassPrice(economy);
			dto.setStartingPoint(point);
			dto.setDestination(dest);
			dto.setTotalSeats(seat);
			dto.setDemostic(domestic);

			booking.flightBookingInformation(dto);

			// booking.flightGetInformation();

			booking.acceptFlightBooking(dto);
		}
		booking.flightGetInformation();
		
		System.out.println("search starting point");
		String search= sc.next();
		booking.getStartingPointInformation(search);
		

		booking.flightGetInformation();
		

	}
}
