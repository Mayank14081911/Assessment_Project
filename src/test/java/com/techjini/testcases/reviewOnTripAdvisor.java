package com.techjini.testcases;

import org.testng.annotations.Test;

import com.techjini.base.base;
import com.techjini.pages.HomePage;
import com.techjini.pages.tripAdvisorHomePage;

public class reviewOnTripAdvisor {

	
	@Test
	public void writeReview(){
		tripAdvisorHomePage p1 = new tripAdvisorHomePage();
		p1.tripHome();
		
		
	}

}

