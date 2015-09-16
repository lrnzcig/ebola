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

	public static EbolaChart getBasicChart() {
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
	}

	public static EbolaDataTable getBasicDataTable() {
		Integer[] iths = new Integer[2];
		iths[0] = 1;
		iths[1] = 3;
		Integer[] nums = new Integer[2];
		nums[0] = 0;
		nums[1] = 7;
		return new EbolaDataTable(iths, nums);
	}
}
