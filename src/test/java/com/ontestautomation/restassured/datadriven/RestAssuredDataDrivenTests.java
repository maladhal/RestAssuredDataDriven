package com.ontestautomation.restassured.datadriven;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RestAssuredDataDrivenTests {
	
	@DataProvider(name = "md5hashes")
	public String[][] createMD5TestData() {
		
		return new String[][] {
				{"testcaseOne", "4ff1c9b1d1f23c6def53f957b1ed827f"},
				{"testcaseTwo", "39738347fb533d798aca9ae0f56ca126"},
				{"testcaseThree", "db6b151bb4bde46fddb361043bc3e2d9"}
		};
	}
	
	@DataProvider(name = "circuitLocations")
	public String[][] createCircuitTestData() {
		
		return new String[][] {
				{"adelaide","Australia"},
				{"detroit","USA"},
				{"george","South Africa"}
		};
	}
	
	@Test(dataProvider = "md5hashes")
	public void md5JsonTest(String originalText, String md5Hash) {
		
		given().
			parameters("text", originalText).
		when().
			get("http://md5.jsontest.com").
		then().
			assertThat().
			body("md5", equalTo(md5Hash));
	}
	
	@Test(dataProvider = "circuitLocations")
	public void circuitLocationTest(String circuitId, String location) {
		
		given().
			pathParameters("circuitId",circuitId).
		when().
			get("http://ergast.com/api/f1/circuits/{circuitId}.json").
		then().
			assertThat().
			body("MRData.CircuitTable.Circuits[0].Location.country",equalTo(location));
	}
}
