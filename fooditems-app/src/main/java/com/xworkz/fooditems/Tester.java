package com.xworkz.fooditems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		String contextConfigFile="application.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(contextConfigFile);
		FoodItems foodItems=applicationContext.getBean(FoodItems.class);
		ArrayList<String> foodItemsList= foodItems.getFoodItemsList();
		ListIterator<String> listIterator=foodItemsList.listIterator();
		while(listIterator.hasNext()){
            System.out.println(listIterator.next());
      }
		System.out.println("*********************************");
		Cars carss = applicationContext.getBean(Cars.class);
		HashSet<String> cars=carss.getCars();
		for (String i : cars) {
			  System.out.println(i);
			}
	}

}
