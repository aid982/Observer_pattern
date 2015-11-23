package com.osetskiy;

public class Main {

	public static void main(String[] args) {
		// W
		WeatherStation station = new WeatherStation(30,70);
		WeatherMonitor monitor = new WeatherMonitor(station);
		station.registerObserver(monitor);
		station.notifyObservers();	
		

	}

}
