package tests;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import flightsAndPlanes.Aeroplane;
import flightsAndPlanes.AeroplaneCatalog;
import flightsAndPlanes.Catalog;
import flightsAndPlanes.Flight;
import flightsAndPlanes.FlightCatalog;

public class flightsAndPlaneTests {
	
	Catalog<Integer , Flight> flightCatalog =  new Catalog<Integer , Flight>();
	Catalog<Integer , Aeroplane> AeroplaneCatalog =  new Catalog<Integer , Aeroplane>();
	@Before
	public void setUp() throws Exception {

	}

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
				AeroplaneCatalog.addObject(aeroplane);
			};



		}

		@Test
		public void addAndRemovePlanesFromCatalogTest() {

			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));
					for (Aeroplane aeroplane : aeroplaneList) {
						AeroplaneCatalog.addObject(aeroplane);
					};
					for (Aeroplane aeroplane : aeroplaneList) {
						AeroplaneCatalog.removeObject(aeroplane.getPlaneNumber());
					};


		}

		@Test
		public void printPlanesInformationTest() {

		}

		@Test
		public void createFlightsTest() {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);

			Aeroplane first = new Aeroplane("AirBus380");
			Aeroplane second = new Aeroplane("AirBus320");		
			Aeroplane third = new Aeroplane("boeing747");	

			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));			
			
			for (Aeroplane aeroplane : aeroplaneList) {
				AeroplaneCatalog.addObject(aeroplane);
			};

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3));
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3));
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9));
		}

		@Test
		public void addObjectsToCatalogTest() {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);

			Aeroplane first = new Aeroplane("AirBus380");
			Aeroplane second = new Aeroplane("AirBus320");		
			Aeroplane third = new Aeroplane("boeing747");	


			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));			
			
			for (Aeroplane aeroplane : aeroplaneList) {
				AeroplaneCatalog.addObject(aeroplane);
			};

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3));
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3));
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9));

			List<Flight> flightList  = Arrays.asList(
					ukToSweden, swedenToUk, ukToZanzibar);
			
			for (Flight flight : flightList) {
				FlightCatalog.addObject(flight);
			};


		}

		@Test
		public void removeObjectsFromCatalogTest() {

			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);

			Aeroplane first = new Aeroplane("AirBus380");
			Aeroplane second = new Aeroplane("AirBus320");		
			Aeroplane third = new Aeroplane("boeing747");	


			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));

			for (Aeroplane aeroplane : aeroplaneList) {
				AeroplaneCatalog.addObject(aeroplane);
			};

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3));
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3));
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9));
			
			List<Flight> flightList  = Arrays.asList(
					ukToSweden, swedenToUk, ukToZanzibar);
			
			for (Flight flight : flightList) {
				FlightCatalog.addObject(flight);
			};

			for (Flight flight : flightList) {
				FlightCatalog.removeObject(flight.getFlightNumber());
			};

		}

		@Test
		public void printSeatsTest() {

			LocalDateTime now = LocalDateTime.now();
			LocalDateTime later = now.plusMonths(5);

			Aeroplane first = new Aeroplane("AirBus380");
			Aeroplane second = new Aeroplane("AirBus320");		
			Aeroplane third = new Aeroplane("boeing747");	

			Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
					"5D", "Sweden", now.plusHours(3));
			Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
					"12D", "United-Kingdom", now.plusDays(3).plusHours(3));
			Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
					"1F", "Sweden", later.plusHours(9));
			
			List<Flight> flightList  = Arrays.asList(
					ukToSweden, swedenToUk, ukToZanzibar);

			for (Flight flight : flightList) {
				FlightCatalog.addObject(flight);
			};
			
			for (Flight flight : flightList) {
				System.out.println(FlightCatalog.getObject(flight.getFlightNumber()).getSeatsToString());
			};

		}

	}
