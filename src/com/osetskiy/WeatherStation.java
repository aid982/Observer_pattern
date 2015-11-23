package com.osetskiy;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	int temp;
	int humidity;
	List<Observer> observers;
	

	public WeatherStation(int temp, int humidity) {
		super();
		this.temp = temp;
		this.humidity = humidity;
		this.observers =new ArrayList<Observer>();
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void unRegisterObserver(Observer o) {
		int index= observers.indexOf(o);
		if(index>=0){
			observers.remove(index);			
		}
		
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp,humidity);		
		}		
	}
	

}
