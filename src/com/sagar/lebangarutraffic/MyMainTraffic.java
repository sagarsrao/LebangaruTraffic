package com.sagar.lebangarutraffic;

import java.util.Scanner;


public class MyMainTraffic {

	public String[] getDellanburuTimeAndVehicle(String weather, String dspeed) {
		MyVehicles vehicles = new MyVehicles();
		MyRoutes routes = new MyRoutes();
		if (weather.equals("Sunny")) {

			int bikeMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperBikeSpeed())
					? Integer.parseInt(vehicles.getSuperBikeSpeed()) : Integer.parseInt(dspeed);

			int bikeTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / bikeMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getDellanburuPotholes())
							- (Integer.parseInt(routes.getDellanburuPotholes()) * 10.0 / 100))
							* Integer.parseInt(vehicles.getSuperBikePotholeTime())));

			int carMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperCarSpeed())
					? Integer.parseInt(vehicles.getSuperCarSpeed()) : Integer.parseInt(dspeed);

			int carTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / carMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getDellanburuPotholes())
							- (Integer.parseInt(routes.getDellanburuPotholes()) * 10 / 100))
							* Integer.parseInt(vehicles.getSuperCarPotholeTime())));

			int tuktukMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperTuktukSpeed())
					? Integer.parseInt(vehicles.getSuperTuktukSpeed()) : Integer.parseInt(dspeed);

			int tuktukTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / tuktukMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getDellanburuPotholes())
							- (Integer.parseInt(routes.getDellanburuPotholes()) * 10 / 100))
							* Integer.parseInt(vehicles.getSuperTuktukPotholeTime())));

			if (bikeTimeMinutes < carTimeMinutes && bikeTimeMinutes < tuktukTimeMinutes) {
					return new String[] { "Dellanburu", vehicles.getSuperBikeName(),
							Integer.toString(bikeTimeMinutes) };

			} else if (carTimeMinutes < tuktukTimeMinutes && carTimeMinutes < bikeTimeMinutes ) {
					return new String[] { "Dellanburu", vehicles.getSuperCarName(), Integer.toString(carTimeMinutes) };
			} else {
				return new String[] { "Dellanburu", vehicles.getSuperTuktukName(),
						Integer.toString(tuktukTimeMinutes) };
			}
		}

		else if (weather.equals("Rainy")) {

			int carMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperCarSpeed())
					? Integer.parseInt(vehicles.getSuperCarSpeed()) : Integer.parseInt(dspeed);

			int carTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / carMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getDellanburuPotholes())
							+ (Integer.parseInt(routes.getDellanburuPotholes()) * 20 / 100))
							* Integer.parseInt(vehicles.getSuperCarPotholeTime())));

			int tuktukMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperTuktukSpeed())
					? Integer.parseInt(vehicles.getSuperTuktukSpeed()) : Integer.parseInt(dspeed);

			int tuktukTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / tuktukMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getDellanburuPotholes())
							+ (Integer.parseInt(routes.getDellanburuPotholes()) * 20 / 100))
							* Integer.parseInt(vehicles.getSuperTuktukPotholeTime())));

			return tuktukTimeMinutes > carTimeMinutes
					? new String[] { "Dellanburu", vehicles.getSuperCarName(), Integer.toString(carTimeMinutes) }
					: new String[] { "Dellanburu", vehicles.getSuperTuktukName(), Integer.toString(tuktukTimeMinutes) };

		} else if (weather.equals("Windy")) {

			int bikeMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperBikeSpeed())
					? Integer.parseInt(vehicles.getSuperBikeSpeed()) : Integer.parseInt(dspeed);

			int bikeTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / bikeMaxSpeed) * 60
					+ (Integer.parseInt(routes.getDellanburuPotholes())
							* Integer.parseInt(vehicles.getSuperBikePotholeTime())));

			int carMaxSpeed = Integer.parseInt(dspeed) > Integer.parseInt(vehicles.getSuperCarSpeed())
					? Integer.parseInt(vehicles.getSuperCarSpeed()) : Integer.parseInt(dspeed);

			int carTimeMinutes = (int) ((Float.parseFloat(routes.getDellanburuDist()) / carMaxSpeed) * 60
					+ (Integer.parseInt(routes.getDellanburuPotholes())
							* Integer.parseInt(vehicles.getSuperCarPotholeTime())));

			return bikeTimeMinutes > carTimeMinutes
					? new String[] { "Dellanburu", vehicles.getSuperCarName(), Integer.toString(carTimeMinutes) }
					: new String[] { "Dellanburu", vehicles.getSuperBikeName(), Integer.toString(bikeTimeMinutes) };

		}
		return null;
	}

	public String[] getMangalrokaTimeAndVehicle(String weather, String ms) {
		MyVehicles vehicles = new MyVehicles();
		MyRoutes routes = new MyRoutes();
		if (weather.equals("Sunny")) {

			int bikeMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperBikeSpeed())
					? Integer.parseInt(vehicles.getSuperBikeSpeed()) : Integer.parseInt(ms);

			int bikeTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / bikeMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getMangalRokaPotholes())
							- (Integer.parseInt(routes.getMangalRokaPotholes()) * 10 / 100))
							* Integer.parseInt(vehicles.getSuperBikePotholeTime())));

			int carMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperCarSpeed())
					? Integer.parseInt(vehicles.getSuperCarSpeed()) : Integer.parseInt(ms);

			int carTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / carMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getMangalRokaPotholes())
							- (Integer.parseInt(routes.getMangalRokaPotholes()) * 10 / 100))
							* Integer.parseInt(vehicles.getSuperCarPotholeTime())));

			int tuktukMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperTuktukSpeed())
					? Integer.parseInt(vehicles.getSuperTuktukSpeed()) : Integer.parseInt(ms);

			int tuktukTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / tuktukMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getMangalRokaPotholes())
							- (Integer.parseInt(routes.getMangalRokaPotholes()) * 10 / 100))
							* Integer.parseInt(vehicles.getSuperTuktukPotholeTime())));

			if (bikeTimeMinutes < carTimeMinutes && bikeTimeMinutes < tuktukTimeMinutes) {
					return new String[] { "Mangalroka", vehicles.getSuperBikeName(),
							Integer.toString(bikeTimeMinutes) };

			} else if (carTimeMinutes < bikeTimeMinutes && carTimeMinutes < tuktukTimeMinutes) {
					return new String[] { "Mangalroka", vehicles.getSuperCarName(), Integer.toString(carTimeMinutes) };
			} else {
				return new String[] { "Mangalroka", vehicles.getSuperTuktukName(),
						Integer.toString(tuktukTimeMinutes) };
			}
		}

		else if (weather.equals("Rainy")) {

			int carMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperCarSpeed())
					? Integer.parseInt(vehicles.getSuperCarSpeed()) : Integer.parseInt(ms);

			int carTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / carMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getMangalRokaPotholes())
							+ (Integer.parseInt(routes.getMangalRokaPotholes()) * 20 / 100))
							* Integer.parseInt(vehicles.getSuperCarPotholeTime())));

			int tuktukMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperTuktukSpeed())
					? Integer.parseInt(vehicles.getSuperTuktukSpeed()) : Integer.parseInt(ms);

			int tuktukTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / tuktukMaxSpeed) * 60
					+ ((Integer.parseInt(routes.getMangalRokaPotholes())
							+ (Integer.parseInt(routes.getMangalRokaPotholes()) * 20 / 100))
							* Integer.parseInt(vehicles.getSuperTuktukPotholeTime())));

			return tuktukTimeMinutes > carTimeMinutes
					? new String[] { "Mangalroka", vehicles.getSuperCarName(), Integer.toString(carTimeMinutes) }
					: new String[] { "Mangalroka", vehicles.getSuperTuktukName(), Integer.toString(tuktukTimeMinutes) };

		} else if (weather.equals("Windy")) {

			int bikeMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperBikeSpeed())
					? Integer.parseInt(vehicles.getSuperBikeSpeed()) : Integer.parseInt(ms);

			int bikeTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / bikeMaxSpeed) * 60
					+ (Integer.parseInt(routes.getMangalRokaPotholes())
							* Integer.parseInt(vehicles.getSuperBikePotholeTime())));

			int carMaxSpeed = Integer.parseInt(ms) > Integer.parseInt(vehicles.getSuperCarSpeed())
					? Integer.parseInt(vehicles.getSuperCarSpeed()) : Integer.parseInt(ms);

			int carTimeMinutes = (int) ((Float.parseFloat(routes.getMangalRokaDist()) / carMaxSpeed) * 60
					+ (Integer.parseInt(routes.getMangalRokaPotholes())
							* Integer.parseInt(vehicles.getSuperCarPotholeTime())));

			return bikeTimeMinutes > carTimeMinutes
					? new String[] { "Mangalroka", vehicles.getSuperCarName(), Integer.toString(carTimeMinutes) }
					: new String[] { "Mangalroka", vehicles.getSuperBikeName(), Integer.toString(bikeTimeMinutes) };

		}
		return null;
	}

	public static void main(String[] args) {
		MyMainTraffic traffic = new MyMainTraffic();

		System.out.println("Enter the weather in Lengaburu");
		Scanner scanner = new Scanner(System.in);
		String weather = scanner.nextLine();
		System.out.println("Enter the Speed via Mangalroka");
		String mangalrokaSpeed = scanner.nextLine();

		System.out.println("Enter the Speed via Dellanburu");
		String dellanburuSpeed = scanner.nextLine();
		
		String [] mdata = traffic.getMangalrokaTimeAndVehicle(weather, mangalrokaSpeed);
		String [] ddata = traffic.getDellanburuTimeAndVehicle(weather, dellanburuSpeed);

		if(Integer.parseInt(mdata[2])< Integer.parseInt(ddata[2])){
			System.out.println("King Shan and Queen Anga should use a "+ mdata[1] +" and take the "+mdata[0]+" route");
		}
		else {
			System.out.println("King Shan and Queen Anga should use a "+ ddata[1] +" and take the "+ddata[0]+" route");
		}
	}
}
