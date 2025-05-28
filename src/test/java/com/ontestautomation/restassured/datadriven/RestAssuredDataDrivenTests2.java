package com.ontestautomation.restassured.datadriven;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RestAssuredDataDrivenTests2 {
	
	@DataProvider(name = "metricsData")
	public String[][] getMetricsList() {
		
		return new String[][] {
		  //Good Project
          {"cgitest_Good","1","CountNew","286.000000"},
          {"cgitest_Good","2","CountNew","1012.000000"},
          {"cgitest_Good","3","CountNew","34.000000"},
          {"cgitest_Good","4","CountNew","109.000000"},
          {"cgitest_Good","5","CountNew","96.000000"},
          {"cgitest_Good","6","CountNew","2.000000"},
          {"cgitest_Good","7","CountNew","0.000000"},
          {"cgitest_Good","8","CountNew","6.000000"},
          {"cgitest_Good","9","CountNew","0.000000"},
          {"cgitest_Good","10","CountNew","158.000000"},
          {"cgitest_Good","11","CountNew","178.000000"},
          {"cgitest_Good","12","CountNew","155.000000"},
          {"cgitest_Good","13","CountNew","21.000000"},
          {"cgitest_Good","14","CountNew","0.000000"},
          {"cgitest_Good","15","CountNew","0.000000"},
          {"cgitest_Good","16","CountNew","23.000000"},
          {"cgitest_Good","17","CountNew","2.000000"},
          {"cgitest_Good","18","CountNew","3.000000"},
          {"cgitest_Good","19","CountNew","0.000000"},
          {"cgitest_Good","20","CountNew","2.000000"},
          //Fail Project
          {"cgitest_Fail","1","CountNew","286.000000"},
          {"cgitest_Fail","2","CountNew","1012.000000"},
          {"cgitest_Fail","3","CountNew","34.000000"},
          {"cgitest_Fail","4","CountNew","109.000000"},
          {"cgitest_Fail","5","CountNew","96.000000"},
          {"cgitest_Fail","6","CountNew","2.000000"},
          {"cgitest_Fail","7","CountNew","0.000000"},
          {"cgitest_Fail","8","CountNew","6.000000"},
          {"cgitest_Fail","9","CountNew","0.000000"},
          {"cgitest_Fail","10","CountNew","158.000000"},
          {"cgitest_Fail","11","CountNew","178.000000"},
          {"cgitest_Fail","12","CountNew","155.000000"},
          {"cgitest_Fail","13","CountNew","21.000000"},
          {"cgitest_Fail","14","CountNew","0.000000"},
          {"cgitest_Fail","15","CountNew","0.000000"},
          {"cgitest_Fail","16","CountNew","23.000000"},
          {"cgitest_Fail","17","CountNew","2.000000"},
          {"cgitest_Fail","18","CountNew","3.000000"},
          {"cgitest_Fail","19","CountNew","0.000000"},
          {"cgitest_Fail","20","CountNew","2.000000"},
          //Only Project
          {"cgitest_Only","1","CountNew","286.000000"},
          {"cgitest_Only","2","CountNew","1012.000000"},
          {"cgitest_Only","3","CountNew","34.000000"},
          {"cgitest_Only","4","CountNew","109.000000"},
          {"cgitest_Only","5","CountNew","96.000000"},
          {"cgitest_Only","6","CountNew","2.000000"},
          {"cgitest_Only","7","CountNew","0.000000"},
          {"cgitest_Only","8","CountNew","6.000000"},
          {"cgitest_Only","9","CountNew","0.000000"},
          {"cgitest_Only","10","CountNew","158.000000"},
          {"cgitest_Only","11","CountNew","178.000000"},
          {"cgitest_Only","12","CountNew","155.000000"},
          {"cgitest_Only","13","CountNew","21.000000"},
          {"cgitest_Only","14","CountNew","0.000000"},
          {"cgitest_Only","15","CountNew","0.000000"},
          {"cgitest_Only","16","CountNew","23.000000"},
          {"cgitest_Only","17","CountNew","2.000000"},
          {"cgitest_Only","18","CountNew","3.000000"},
          {"cgitest_Only","19","CountNew","0.000000"},
          {"cgitest_Only","20","CountNew","2.000000"},
          //Source Project
          {"cgitest_Src","1","CountNew","286.000000"},
          {"cgitest_Src","2","CountNew","1012.000000"},
          {"cgitest_Src","3","CountNew","34.000000"},
          {"cgitest_Src","4","CountNew","109.000000"},
          {"cgitest_Src","5","CountNew","96.000000"},
          {"cgitest_Src","6","CountNew","2.000000"},
          {"cgitest_Src","7","CountNew","0.000000"},
          {"cgitest_Src","8","CountNew","6.000000"},
          {"cgitest_Src","9","CountNew","0.000000"},
          {"cgitest_Src","10","CountNew","158.000000"},
          {"cgitest_Src","11","CountNew","178.000000"},
          {"cgitest_Src","12","CountNew","155.000000"},
          {"cgitest_Src","13","CountNew","21.000000"},
          {"cgitest_Src","14","CountNew","0.000000"},
          {"cgitest_Src","15","CountNew","0.000000"},
          {"cgitest_Src","16","CountNew","23.000000"},
          {"cgitest_Src","17","CountNew","2.000000"},
          {"cgitest_Src","18","CountNew","3.000000"},
          {"cgitest_Src","19","CountNew","0.000000"},
          {"cgitest_Src","20","CountNew","2.000000"},
          //Bad Project 
          {"cgitest_Bad","1","CountNew","286.000000"},
          {"cgitest_Bad","2","CountNew","1170.000000"},
          {"cgitest_Bad","3","CountNew","1136.000000"},
          {"cgitest_Bad","4","CountNew","109.000000"},
          {"cgitest_Bad","5","CountNew","211.000000"},
          {"cgitest_Bad","6","CountNew","77.000000"},
          {"cgitest_Bad","7","CountNew","33.000000"},
          {"cgitest_Bad","8","CountNew","25.000000"},
          {"cgitest_Bad","9","CountNew","0.000000"},
          {"cgitest_Bad","10","CountNew","255.000000"},
          {"cgitest_Bad","11","CountNew","247.000000"},
          {"cgitest_Bad","12","CountNew","402.000000"},
          {"cgitest_Bad","13","CountNew","20.000000"},
          {"cgitest_Bad","14","CountNew","0.000000"},
          {"cgitest_Bad","15","CountNew","2.000000"},
          {"cgitest_Bad","16","CountNew","75.000000"},
          {"cgitest_Bad","17","CountNew","17.000000"},
          {"cgitest_Bad","18","CountNew","31.000000"},
          {"cgitest_Bad","19","CountNew","0.000000"},
          {"cgitest_Bad","20","CountNew","10.000000"},
		};
	}
	@Test(dataProvider = "metricsData")
	public void compoundMetricCheck(String project, String snapShot, String metric, String value) {
		given().
			//parameters("text").
		when().
			get("http://qav-jn-win7-86:8080/metrics.html?request=12&db={database}&ss=20&sps=&sc=0&bl=&id=0&tp=1&reqid=148588222108913", project).
		then().
			assertThat().
			body("qav.graph_comp.entity.find { it.@id == '0' }.snapshot.find { it.@id == '" + snapShot+ "' }.metric_value.find { it.@id == '"+ metric+"' }", equalTo(value));	
	}
}
