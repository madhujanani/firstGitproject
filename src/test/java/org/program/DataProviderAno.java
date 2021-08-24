package org.program;

import org.testng.annotations.DataProvider;

public class DataProviderAno {
	@DataProvider(name="loginhotel")
	private Object[][] getData() {
		
		return new Object[][] {
				
				{"madhugowri","madhujanani"},
				{"gowri","janani"}
		};
	}
		@DataProvider(name="hotel details")
		private Object[] hotelDetails() {
			
			return new Object[][] {
					
					{"Sydney","Hotel Sunshine","Standard","1","13/08/2021","14/08/2021","2","2"
						,"madhu","janani","anywhere","1234567898765432","VISA","3","2022","234"},
					
					{"Melbourne","Hotel Cornice","Double","2","14/08/2021","15/08/2021","1","1"
							,"raja","ranii","india","9876509876123456","AMEX","5","2021","123"},
			};
	}	
		@DataProvider(name="loginData")
		private Object[][] enterdata() {
			
			return new Object[][] {
					
					{"greens","greens123"},
					{"white","white123"},
//					{"red","red123"},
//					{"yellow","yellow123"}
					
			};
		}
		
		}
		
		
		
		