package com.journaldev.jackson.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Address {
	
	private String street;
	private String city;
	private int zipcode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString(){
		return getStreet() + ", "+getCity()+", "+getZipcode();
	}

	public String squareOfToString(Integer a){

		Integer[]inputArray={1,2,3,4};

		DescriptiveStatistics stats = new DescriptiveStatistics();

// Add the data from the array
		for( int i = 0; i < inputArray.length; i++) {
			stats.addValue(inputArray[i]);
		}

// Compute some statistics
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		double median = stats.getPercentile(50);

		return String.valueOf(mean);

		/*ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		return a*a+a.toString();*/
	}
}
