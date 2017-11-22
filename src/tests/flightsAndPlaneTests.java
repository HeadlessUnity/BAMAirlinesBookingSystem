package tests;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import flightsAndPlanes.Aeroplane;
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




	}
	
	@Test
	public void removePlanesToCatalogTest() {

	


	}
	
	@Test
	public void printPlanesInformationTest() {
	
		FlightCatalog fC = new FlightCatalog();
		System.out.println(fC);

	}

	@Test
	//TODO: FUCKING NO PLANES AVAIBALE BITCH
	public void createFlightsTest() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime later = now.plusMonths(5);
		
		Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
				"5D", "Sweden", now.plusHours(3));
		Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
				"12D", "United-Kingdom", now.plusDays(3).plusHours(3));
		Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
				"1F", "Sweden", later.plusHours(9));
	}

	@Test
	public void addFlightsToCatalogTest() {




	}
	
	@Test
	public void removeFlightsToCatalogTest() {

	


	}
	
	@Test
	public void printFlightInformationTest() {
	
		FlightCatalog fC = new FlightCatalog();
		System.out.println(fC);

	}

}
