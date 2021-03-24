package com.xworkz.vediogames;

public class PhotoFrame {

	public PhotoFrame() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}
	public void holdPhoto() {
		System.out.println("invoked holdPhoto()");
		System.out.println("holding photo");	
	}
	public void holdPainting() {
		System.out.println("invoked  holdPainting()");
		System.out.println("holding painting");
	}
	public void cherishMemory() {
		System.out.println("invoked  cherishMemory()");
		System.out.println("cherishing memory");
	}
}
