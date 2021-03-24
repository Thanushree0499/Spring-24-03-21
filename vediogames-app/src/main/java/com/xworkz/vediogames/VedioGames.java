package com.xworkz.vediogames;

public class VedioGames {
	
	public VedioGames() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}

	public void playGames() {
		System.out.println("invoked playingGames()");
		System.out.println("can play games");	
	}
	public void liveStreaming() {
		System.out.println("invoked liveStreaming()");
		System.out.println("live Streaming");
	}
}
