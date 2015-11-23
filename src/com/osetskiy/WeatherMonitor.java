package com.osetskiy;

public class WeatherMonitor implements Observer,Display{
	int temp;
	int humidity;
	Subject weatherStation; 
	
	public WeatherMonitor(Subject weatherStation) {
		super();
		this.weatherStation = weatherStation;
	}

	public void display() {
		System.out.println("Temp: "+temp+" Hum:"+humidity);		
	}
	
	public void update(int temp, int hummidity) {
		this.temp  = temp;
		this.humidity = hummidity;
		display();
	}

	public Subject getWeatherStation() {
		return weatherStation;
	}

	public void setWeatherStation(Subject weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	
	

	

}
