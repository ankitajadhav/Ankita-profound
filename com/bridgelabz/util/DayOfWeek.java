/******************************************************************************
 *  Purpose: Determine the day of the week from the given date. 
 *
 *  @author  Ankita Jadhav
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;

public class DayOfWeek{
	
	public static void main(String args[]){
		int x,y1,m1,d1;
		int m=Integer.parseInt(args[0]);//months
		int d=Integer.parseInt(args[1]);//day 
		int y=Integer.parseInt(args[2]);//year
		y1=y-(14-m)/12;// calculation for year
		x=y1+y1/4-y1/100+y1/400;// calculating wheather year is leap year or not
		m1=m+12*((14-m)/12)-2;// calculation for month
		d1=(d+x+(31*m1)/12)%7;//calculating day of the week
		//System.out.println("day of the week is " +d1);
		switch(d1){ //using switch for display the day of the week
			case 0:System.out.println("Day of the week is Sunday " );
			break;
			case 1:System.out.println("Day of the week is Monday " );
			break;
			case 2:System.out.println("Day of the week is Tuesday " );
			break;
			case 3:System.out.println("Day of the week is Wednesday" );
			break;
			case 4:System.out.println("Day of the week is Thursday " );
			break;
			case 5:System.out.println("Day of the week is Friday " );
			break;
			case 6:System.out.println("Day of the week is Saturday " );
			break;
		}

	}
}	
		
		