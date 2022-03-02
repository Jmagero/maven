package com.jmagero.Marven;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.print("I am riding a bike");
	}

}
