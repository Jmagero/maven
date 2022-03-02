package com.jmagero.Marven;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.print("I am driving a car");
	}
}
