package com.dhb.observer.v7;

public class Dad implements Observer {

	@Override
	public void actionOnWeakUp(WeakUpEvent event) {
		this.feed();
	}

	public void feed() {
		System.out.println("dad feeding ...");
	}
}
