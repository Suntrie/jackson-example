package com.journaldev.jackson.model;


import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
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

/*	public double multiple(Integer a){

		double [] coefficients = new double[]{4,3,2,1};

		PolynomialFunction polynomialFunction = new PolynomialFunction(coefficients);

		return polynomialFunction.value(a);
	}*/

	public double antiMultiple(Integer a){

		double [] coefficients = new double[]{-4,-3,-2,-1};

		PolynomialFunction polynomialFunction = new PolynomialFunction(coefficients);

		return polynomialFunction.value(a);
	}


}
