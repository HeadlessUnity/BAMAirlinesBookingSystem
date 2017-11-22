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
				AeroplaneCatalog.addAeroplane(aeroplane);
			};



		}

		@Test
		public void addAndRemovePlanesFromCatalogTest() {

			List<Aeroplane> aeroplaneList  = Arrays.asList(
					new Aeroplane("AirBus380"), new Aeroplane("AirBus320"),
					new Aeroplane("boeing747"));
					for (Aeroplane aeroplane : aeroplaneList) {
						AeroplaneCatalog.addAeroplane(aeroplane);
					};
					for (Aeroplane aeroplane : aeroplaneList) {
						AeroplaneCatalog.removeAeroplane(aeroplane.getModel());
					};


		}

		@Test
		public void printPlanesInformationTest() {

		}

		@Test
		//TODO: FUCKING NO PLANES AVAIBALE BITCH
		public void createFlightsTest() {
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
		}

		@Test
		public void addFlightsToCatalogTest() {
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
				FlightCatalog.addFlight(flight);
			};


		}

		@Test
		public void removeFlightsFromCatalogTest() {

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
				FlightCatalog.addFlight(flight);
			};

			for (Flight flight : flightList) {
				FlightCatalog.removeFlight(flight.getFlightNumber());
			};

		}

		@Test
		public void printFlightInformationTest() {

			FlightCatalog fC = new FlightCatalog();
			System.out.println(fC);

		}

	}
