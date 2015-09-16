package com.sisifo.ebola_jersey_server.data;

import xre.EbolaAppsList;
import xre.EbolaChart;
import xre.EbolaDataTable;

public class EbolaDatabase {

	public static EbolaAppsList getListOfApps() {
    	String[] apps = new String[3];
     	apps[0] = "Bubble breaker";
    	apps[1] = "Candy swipe slots";
    	apps[2] = "Blood zombie";
    	return new EbolaAppsList(apps);
	}

	public static EbolaChart getBasicChart(String appName, Integer inputDataLength) {
		if (inputDataLength == null || inputDataLength == 2) {
	    	EbolaChart chart = new EbolaChart();
	    	chart.addRangeItem(1, 0, 10);
	    	chart.addRangeItem(2, 2, 13);
	    	chart.addRangeItem(3, 5, 18);
	    	chart.addRangeItem(4, 17, 29);
	    	chart.addRangeItem(5, 18, 35);
	    	chart.addRangeItem(6, 23, 45);
	    	chart.addRangeItem(7, 28, 53);
	    	chart.addRangeItem(8, 35, 68);
	    	chart.addRangeItem(9, 45, 100);
	    	chart.addRangeItem(10, 50, 123);
	    	chart.addAverageItem(1, 5);
	    	chart.addAverageItem(2, 8);
	    	chart.addAverageItem(3, 10);
	    	chart.addAverageItem(4, 15);
	    	chart.addAverageItem(5, 20);
	    	chart.addAverageItem(6, 30);
	    	chart.addAverageItem(7, 33);
	    	chart.addAverageItem(8, 55);
	    	chart.addAverageItem(9, 60);
	    	chart.addAverageItem(10, 70);
			return chart;
		} else if (inputDataLength == 3) {
	    	EbolaChart chart = new EbolaChart();
	    	chart.addRangeItem(1, 0, 10);
	    	chart.addRangeItem(2, 2, 13);
	    	chart.addRangeItem(3, 5, 18);
	    	chart.addRangeItem(4, 17, 29);
	    	chart.addRangeItem(5, 28, 35);
	    	chart.addRangeItem(6, 33, 50);
	    	chart.addRangeItem(7, 38, 86);
	    	chart.addRangeItem(8, 45, 98);
	    	chart.addRangeItem(9, 85, 150);
	    	chart.addRangeItem(10, 100, 180);
	    	chart.addAverageItem(1, 5);
	    	chart.addAverageItem(2, 8);
	    	chart.addAverageItem(3, 10);
	    	chart.addAverageItem(4, 22);
	    	chart.addAverageItem(5, 30);
	    	chart.addAverageItem(6, 40);
	    	chart.addAverageItem(7, 63);
	    	chart.addAverageItem(8, 75);
	    	chart.addAverageItem(9, 100);
	    	chart.addAverageItem(10, 120);
			return chart;			
		} else {
	    	EbolaChart chart = new EbolaChart();
	    	chart.addRangeItem(1, 0, 10);
	    	chart.addRangeItem(2, 2, 13);
	    	chart.addRangeItem(3, 5, 18);
	    	chart.addRangeItem(4, 17, 29);
	    	chart.addRangeItem(5, 48, 85);
	    	chart.addRangeItem(6, 103, 125);
	    	chart.addRangeItem(7, 108, 153);
	    	chart.addRangeItem(8, 125, 168);
	    	chart.addRangeItem(9, 169, 200);
	    	chart.addRangeItem(10, 190, 223);
	    	chart.addAverageItem(1, 5);
	    	chart.addAverageItem(2, 8);
	    	chart.addAverageItem(3, 10);
	    	chart.addAverageItem(4, 25);
	    	chart.addAverageItem(5, 60);
	    	chart.addAverageItem(6, 110);
	    	chart.addAverageItem(7, 123);
	    	chart.addAverageItem(8, 145);
	    	chart.addAverageItem(9, 180);
	    	chart.addAverageItem(10, 200);
			return chart;						
		}
	}

	public static EbolaDataTable getBasicDataTable(String appName) {
		Integer[] iths = new Integer[2];
		iths[0] = 1;
		iths[1] = 3;
		Integer[] nums = new Integer[2];
		nums[0] = 0;
		nums[1] = 7;
		return new EbolaDataTable(iths, nums, appName);
	}
	
	public static EbolaDataTable getBasicRealDataTable(String appName) {
		Integer[] iths = new Integer[3];
		iths[0] = 6;
		iths[1] = 7;
		iths[2] = 9;
		Integer[] nums = new Integer[3];
		nums[0] = 8;
		nums[1] = 9;
		nums[2] = 10;
		return new EbolaDataTable(iths, nums, appName);
	}

}
