package com.bridgeit.ConstructorInjection;

public class Address {

	private String street;
	private String city;
	private String dist;
	
	public Address(String street,String city,String dist)
	{
		this.street=street;
		this.city=city;
		this.dist=dist;
		
	}

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

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}
	public String toString()
	{
		return "Street:"+street+",city:"+city+",Dist:"+dist;
	}
}
