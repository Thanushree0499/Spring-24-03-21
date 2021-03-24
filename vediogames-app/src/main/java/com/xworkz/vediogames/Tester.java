package com.xworkz.vediogames;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
	String springXML="spring.xml";
	ApplicationContext container= new ClassPathXmlApplicationContext(springXML);
	VedioGames vedioGames = container.getBean(VedioGames.class);
	vedioGames.playGames();
	vedioGames.liveStreaming();
	
	PhotoFrame photoFrame = container.getBean(PhotoFrame.class);
	photoFrame.holdPhoto();
	photoFrame.holdPainting();
	photoFrame.cherishMemory();
	
	}

}
