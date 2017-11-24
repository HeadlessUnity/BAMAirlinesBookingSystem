package tests;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import flightsAndPlanes.Aeroplane;
import flightsAndPlanes.AeroplaneCatalog;
import flightsAndPlanes.Flight;
import flightsAndPlanes.FlightCatalog;

public class flightsAndPlaneTests {
	
	AeroplaneCatalog aeroplaneCatalog =  new AeroplaneCatalog();
	FlightCatalog flightCatalog =  new FlightCatalog();
	@Before
	public void setUp() throws Exception {

	}
/*
	@Test
	public void createPlanesTest() {

		Aeroplane first = new Aeroplane("AirBus380");
		Aeroplane second = new Aeroplane("AirBus320");		
		Aeroplane third = new Aeroplane("boeing747");		


	}

	@Test
	public void addPlanesToCatalogTest() {
		List<Aeroplane> aeroplaneList  = Arrays.asList(
			new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
			new Aeroplane("boeing747"));
			for (Aeroplane aeroplane : aeroplaneList) {
				aeroplaneCatalog.addObject(aeroplane.getNumber(), aeroplane);
			};



		}

		@Test
		public void addAndRemovePlanesFromCatalogTest() {

			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));
					for (Aeroplane aeroplane : aeroplaneList) {
						aeroplaneCatalog.addObject(aeroplane.getNumber(), aeroplane);
					};
					for (Aeroplane aeroplane : aeroplaneList) {
						aeroplaneCatalog.removeObject(aeroplane.getNumber());
					};


		}

		@Test
		public void printPlanesInformationTest() {

		}

		@Test
		public void createFlightsTest() {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);
			
			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));			
			
			for (Aeroplane aeroplane : aeroplaneList) {
				aeroplaneCatalog.addObject(aeroplane.getNumber(), aeroplane);
			};

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3), aeroplaneCatalog);
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3), aeroplaneCatalog);
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9), aeroplaneCatalog);
		}

		@Test
		public void addObjectsToCatalogTest() {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);


			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));			
			
			for (Aeroplane aeroplane : aeroplaneList) {
				aeroplaneCatalog.addObject(aeroplane.getNumber(), aeroplane);
			};

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3), aeroplaneCatalog);
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3), aeroplaneCatalog);
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9), aeroplaneCatalog);

			List<Flight> flightList  = Arrays.asList(
					ukToSweden, swedenToUk, ukToZanzibar);
			
			for (Flight flight : flightList) {
				flightCatalog.addObject(flight.getNumber(), flight);
			};


		}
*/
		@Test
		public void removeObjectsFromCatalogTest() {

			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);

			Aeroplane first = new Aeroplane("AirBus380");
			Aeroplane second = new Aeroplane("AirBus320");		
			Aeroplane third = new Aeroplane("boeing747");	
			
			List<Aeroplane> aeroplaneList  = Arrays.asList(
					first, second, third);

			for (Aeroplane aeroplane : aeroplaneList) {
				aeroplaneCatalog.addObject(aeroplane.getNumber(), aeroplane);
			};
			System.out.println(aeroplaneCatalog);
			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3), aeroplaneCatalog);
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3), aeroplaneCatalog);
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9), aeroplaneCatalog);
			
			List<Flight> flightList  = Arrays.asList(
					ukToSweden, swedenToUk, ukToZanzibar);
			
			for (Flight flight : flightList) {
				flightCatalog.addObject(flight.getNumber(), flight);
			};

			for (Flight flight : flightList) {
				flightCatalog.removeObject(flight.getNumber());
			};

		}

		@Test
		public void printSeatsTest() {

			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);

			Aeroplane first = new Aeroplane("AirBus380");
			Aeroplane second = new Aeroplane("AirBus320");		
			Aeroplane third = new Aeroplane("boeing747");	
			
			List<Aeroplane> aeroplaneList  = Arrays.asList(
					first, second, third);

			for (Aeroplane aeroplane : aeroplaneList) {
				aeroplaneCatalog.addObject(aeroplane.getNumber(), aeroplane);
			};

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3), aeroplaneCatalog);
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3), aeroplaneCatalog);
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9), aeroplaneCatalog);
			
			List<Flight> flightList  = Arrays.asList(
					ukToSweden, swedenToUk, ukToZanzibar);

			for (Flight flight : flightList) {
				flightCatalog.addObject(flight.getNumber(), flight);
			};
			
			for (Flight flight : flightList) {
				System.out.println(flightCatalog.getObject(flight.getNumber()).getSeatsToString());
			};

		}

	}
