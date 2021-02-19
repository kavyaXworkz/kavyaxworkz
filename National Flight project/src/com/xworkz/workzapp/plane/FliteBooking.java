package com.xworkz.workzapp.plane;

public class FliteBooking {

	public FliteBookingDTO[] fliteBookDTO;
	int index;

	public FliteBooking(int size) {
		fliteBookDTO = new FliteBookingDTO[size];

	}

	public void flightBookingInformation(FliteBookingDTO fliteBookDTO) {

		this.fliteBookDTO[index++] = fliteBookDTO;

	}

	public void flightGetInformation() {
		for (int i = 0; i < fliteBookDTO.length; i++) {
			System.out.println(fliteBookDTO[i].getAirplaneCode() + " "
					+ fliteBookDTO[i].getStartingPoint() + " "
					+ fliteBookDTO[i].getDestination() + " "
					+ fliteBookDTO[i].getTotalSeats() + " "
					+ fliteBookDTO[i].getBusinssClassPrice() + " "
					+ fliteBookDTO[i].getEconomyClassPrice());

		}
	}

	public void acceptFlightBooking(FliteBookingDTO bookingDTO) {
		if (bookingDTO.getAirplaneCode() != null
				&& bookingDTO.getCompany() != null
				&& bookingDTO.getBusinssClassPrice() >= 0.0
				&& bookingDTO.getStartingPoint() != null
				&& bookingDTO.getDestination() != null
				&& bookingDTO.getBusinssClassPrice() <= 1000) {
			System.out.println("allow to book");

		} else {
			System.out.println("not allow for booking");
		}

	}

	public void getStartingPointInformation(String startingPoint) {
		for (int i = 0; i < fliteBookDTO.length; i++) {
			if (fliteBookDTO[i].getStartingPoint() == startingPoint) {
				System.out.println(fliteBookDTO[i].getAirplaneCode() + " "
						+ fliteBookDTO[i].getStartingPoint() + " "
						+ fliteBookDTO[i].getDestination() + " "
						+ fliteBookDTO[i].getTotalSeats() + " "
						+ fliteBookDTO[i].getBusinssClassPrice() + " "
						+ fliteBookDTO[i].getEconomyClassPrice());
				System.out.println("starting point found");

			} else {
				System.out.println("Starting point not found");
			}
		}
	}

}
