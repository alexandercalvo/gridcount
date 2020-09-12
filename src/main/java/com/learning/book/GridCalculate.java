package com.learning.book;

public class GridCalculate {
	
	public double measurements(double width, double height)throws NumberFormatException {
		double surfaceSize= (width-1)*(height-2);
		double numberOfGrid= surfaceSize/0.25;
		return numberOfGrid;
	}



}
