package com.sisifo.ebola_jersey_server.data;

import xre.EbolaAppsList;
import xre.EbolaAverageItem;
import xre.EbolaChart;
import xre.EbolaDataTable;

public class EbolaDatabase {

	private static String BUBBLE_BREAKER = "Bubble breaker";
	private static String CANDY_SWIPE_SLOTS = "Candy swipe slots";
	private static String BLOOD_ZOMBIE = "Blood zombie";
	private static String MATH_BEGINS = "Math begins";
	private static String CHESS_OK = "Chess OK";
	private static String SKATER_KID = "Skater kid";
	private static String MONSTER_CAKE = "Monster cake";
	private static String PACY = "Pacy";
	private static String CAT_RUNNER = "Cat runner";
	private static String GALAXY_STORM = "Galaxy storm";
	private static String ONE_TAP_ZOMBIE = "One tap zombie";
	private static String AMAZING_LINES = "Amazing lines";
	private static String CHESS_CLASSIC = "Chess classic";
	
	public static EbolaAppsList getListOfApps() {
    	String[] apps = new String[13];
     	apps[0] = BUBBLE_BREAKER;
    	apps[1] = CANDY_SWIPE_SLOTS;
    	apps[2] = BLOOD_ZOMBIE;
    	apps[3] = MATH_BEGINS;
    	apps[4] = CHESS_OK;
    	apps[5] = SKATER_KID;
    	apps[6] = MONSTER_CAKE;
    	apps[7] = PACY;
    	apps[8] = CAT_RUNNER;
    	apps[9] = GALAXY_STORM;
    	apps[10] = ONE_TAP_ZOMBIE;
    	apps[11] = AMAZING_LINES;
    	apps[12] = CHESS_CLASSIC;
    	return new EbolaAppsList(apps);
	}

	private static Integer[] bubleBreakerIths = new Integer[] {4, 11, 14, 21, 28, 34, 84, 95};
	private static Integer[] bubleBreakerNums = new Integer[] {281, 707, 873, 1123, 1284, 1392, 1886, 1992};
	private static Integer[] bubleBreakerAverages2inputs = new Integer[] {0,
			320, 700, 900, 1000, 1300,
			1470, 1700, 1800, 1940, 2080,
			2200, 2340, 2500, 2640, 2760,
			2900, 3040, 3120, 3200, 3340};
	private static Integer[] bubleBreakerAverages3inputs = new Integer[] {0,
			320, 700, 900, 1100, 1400,
			1580, 1740, 1880, 2120, 2260,
			2400, 2540, 2700, 2900, 3140,
			3280, 3440, 3580, 3700, 3840};
	private static Integer[] bubleBreakerAverages4inputs = new Integer[] {0,
			320, 700, 900, 1000, 1100,
			1140, 1220, 1340, 1420, 1520,
			1600, 1650, 1700, 1760, 1840,
			1900, 1980, 2040, 2110, 2180};

	public static EbolaChart getBasicChart(String appName, Integer inputDataLength) {
		// TODO avoid this in js
		String cleanAppName = appName.replace("\"", "");
		if (BUBBLE_BREAKER.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bubleBreakerAverages2inputs);
		    	addConfidenceIntervals(chart, null);
				return chart;
			} else if (inputDataLength == 3) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bubleBreakerAverages3inputs);
		    	addConfidenceIntervals(chart, 5);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bubleBreakerAverages4inputs);
		    	addConfidenceIntervals(chart, 8);
				return chart;
			}
		} else {
			return null;
		}
	}

	private static void addItemsStep5(EbolaChart chart, Integer... bubleBreakerAverages2inputs2) {
		addItemsStep(chart, 5, bubleBreakerAverages2inputs2);
	}

	private static void addConfidenceIntervals(EbolaChart chart, Integer wider) {
		for (EbolaAverageItem average : chart.getAverages()) {
			int day = average.getDayNumber();
			float av = average.getAverage();
			float perc = (float) (0.1 +  ((float)day)/2000);
			if (wider != null) {
				perc = perc + ((float)day * wider)/2000;
			}
			float min = av * (1 - perc);
			float max = av * (1 + perc);
			chart.addRangeItem(day, min, max);
		}
	}


	private static void addItemsStep(EbolaChart chart, int step, Integer... args) {
		int day = 0;
		for (int arg: args) {
			chart.addAverageItem(day, arg);
			day += step;
		}
		
	}
		

	public static EbolaDataTable getBasicDataTable(String appName) {
		int size = 2;
		Integer[] iths = new Integer[size];
		Integer[] nums = new Integer[size];
		// TODO avoid this in js
		String cleanAppName = appName.replace("\"", "");
		if (BUBBLE_BREAKER.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = bubleBreakerIths[i];
				nums[i] = bubleBreakerNums[i];
			}
		}
		return new EbolaDataTable(iths, nums, appName);
	}
	
	public static EbolaDataTable getBasicRealDataTable(String appName, Integer inputDataLength) {
		int size = 6;
		if (inputDataLength != null && inputDataLength > 2) {
			size = 8 - inputDataLength;
		}
		Integer[] iths = new Integer[size];
		Integer[] nums = new Integer[size];
		// TODO avoid this in js
		String cleanAppName = appName.replace("\"", "");
		if (BUBBLE_BREAKER.equals(cleanAppName)) {
			for (int i = 1; i <= size; i++) {
				iths[size - i] = bubleBreakerIths[8 - i];
				nums[size - i] = bubleBreakerNums[8 - i];
			}
		}
		return new EbolaDataTable(iths, nums, appName);
	}

}
