package com.xworkz.chimney;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		String context="spring.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(context);
		
		Chimney chimney = applicationContext.getBean(Chimney.class);
		System.out.println(chimney.getBrand());
		System.out.println(chimney.getPrice());
	    
		Integer integer = applicationContext.getBean(Integer.class);
		System.out.println(integer.intValue());
		
		String string=applicationContext.getBean(String.class);
		System.out.println(string.toString());
		
		Double doubleValue=applicationContext.getBean(Double.class);
		System.out.println(doubleValue.doubleValue());
		
		Float floatValue=applicationContext.getBean(Float.class);
		System.out.println(floatValue.floatValue());
		
		Boolean booleanValue=applicationContext.getBean(Boolean.class);
		System.out.println(booleanValue.booleanValue());
		
		Character charValue=applicationContext.getBean(Character.class);
		System.out.println(charValue.charValue());
		
		Byte byteValue=applicationContext.getBean(Byte.class);
		System.out.println(byteValue.byteValue());
		
		Long longValue=applicationContext.getBean(Long.class);
		System.out.println(longValue.longValue());
		
		Short shortValue=applicationContext.getBean(Short.class);
		System.out.println(shortValue.shortValue());
	}

}
