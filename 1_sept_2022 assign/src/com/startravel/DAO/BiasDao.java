package com.startravel.DAO;

import  javax.swing.text.Position.Bias;

public class BiasDao {
	
	
	static Bias[] busArray=new Bias[2];
	public static boolean addBook(Bias bus) {
		boolean result=false;
		
		for (int i=0;i<busArray.length;i++)
		{
			if(busArray[i]==null) {
				busArray[i]=bus;
				result=true;
				break;
			}
		}
		return result;
	}
	public static Bias[] displayBook() {
		return busArray;
	}
	public static Bias[] displayBus() {
		return null;
	}
	public static void addBus(Bias bus) {
		
	}

}
