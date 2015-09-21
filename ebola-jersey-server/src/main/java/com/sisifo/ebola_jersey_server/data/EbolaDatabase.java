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

	private static Integer[] candySwipeSlotsIths = new Integer[] {5, 7, 11, 14, 22, 28, 43, 51};
	private static Integer[] candySwipeSlotsNums = new Integer[] {709, 897, 1234, 1360, 1576, 1686, 1842, 1895};
	private static Integer[] candySwipeSlotsAverages2inputs = new Integer[] {0,
			700, 1100, 1350, 1700, 1920,
			2040, 2160, 2280, 2420, 2560,
			2700, 2820, 2940, 3050, 3180,
			3300, 3420, 3540, 3670, 3800};
	private static Integer[] candySwipeSlotsAverages3inputs = new Integer[] {0,
			700, 1200, 1500, 1770, 1950,
			2100, 2200, 2280, 2370, 2460,
			2550, 2640, 2720, 2800, 2880,
			2960, 3040, 3120, 3200, 3280};
	private static Integer[] candySwipeSlotsAverages4inputs = new Integer[] {0,
			800, 1200, 1350, 1420, 1500,
			1570, 1630, 1660, 1700, 1770,
			1830, 1870, 1920, 1970, 2000,
			2020, 2040, 2060, 2080, 2100};

	private static Integer[] bloodZombieIths = new Integer[] {6, 8, 13, 20, 28, 70};
	private static Integer[] bloodZombieNums = new Integer[] {2301, 3493, 6359, 9261, 11962, 20307};
	private static Integer[] bloodZombieAverages2inputs = new Integer[] {0,
			2000, 3800, 5500, 6800, 7400,
			8120, 8840, 9560, 10280, 11000,
			11500, 12000, 12500, 13000, 13500,
			14200, 14900, 15600, 16300, 17000};
	private static Integer[] bloodZombieAverages3inputs = new Integer[] {0,
			2000, 3800, 7000, 9000, 10050,
			11440, 12830, 14220, 15610, 17000,
			17900, 18800, 19700, 20600, 21500,
			22500, 23500, 24500, 25500, 26500};
	private static Integer[] bloodZombieAverages4inputs = new Integer[] {0,
			2000, 3800, 6500, 8000, 9600,
			10800, 12000, 13300, 14400, 15500,
			16400, 17300, 18200, 19100, 20000,
			20800, 21600, 22400, 23200, 24000};

	private static Integer[] mathBeginsIths = new Integer[] {6, 8, 13, 20, 28, 70};
	private static Integer[] mathBeginsNums = new Integer[] {98, 131, 170, 186, 200, 281};
	private static Integer[] mathBeginsAverages2inputs = new Integer[] {0,
			90, 150, 200, 250, 270,
			290, 320, 340, 365, 380,
			400, 410, 425, 440, 460,
			480, 500, 530, 560, 590};
	private static Integer[] mathBeginsAverages3inputs = new Integer[] {0,
			90, 150, 170, 200, 210,
			220, 240, 250, 270, 280,
			290, 300, 310, 320, 330,
			335, 340, 350, 360, 370};

	private static Integer[] chessOkIths = new Integer[] {5, 7, 12, 19, 27, 69};
	private static Integer[] chessOkNums = new Integer[] {27, 66, 123, 149, 190, 271};
	private static Integer[] chessOkAverages2inputs = new Integer[] {0,
			30, 90, 110, 140, 160,
			180, 200, 220, 230, 250,
			260, 270, 290, 310, 330,
			350, 370, 390, 410, 430};
	private static Integer[] chessOkAverages3inputs = new Integer[] {0,
			40, 90, 130, 180, 210,
			235, 250, 265, 280, 300,
			330, 360, 390, 420, 450,
			490, 530, 570, 610, 650};

	private static Integer[] skaterKidIths = new Integer[] {3, 10, 13, 27, 33};
	private static Integer[] skaterKidNums = new Integer[] {1178, 3143, 4905, 8635, 9136};
	private static Integer[] skaterKidAverages2inputs = new Integer[] {0,
			1550, 3100, 4600, 5600, 6500,
			7200, 7900, 8600, 9300, 10000,
			10700, 11400, 12100, 12800, 13500,
			14300, 15100, 15900, 16700, 17500};
	private static Integer[] skaterKidAverages3inputs = new Integer[] {0,
			1600, 3100, 5200, 7000, 8000,
			9000, 10000, 11000, 12000, 13000,
			13800, 14600, 15400, 16200, 17000,
			17800, 18600, 19400, 20200, 21000};

	private static Integer[] monsterCakeIths = new Integer[] {4, 6, 9, 10, 13, 14, 21};
	private static Integer[] monsterCakeNums = new Integer[] {285, 630, 889, 949, 1091, 1119, 1306};
	private static Integer[] monsterCakeAverages2inputs = new Integer[] {0,
			450, 900, 1100, 1300, 1500,
			1620, 1740, 1860, 1980, 2100,
			2180, 2260, 2340, 2420, 2500,
			2600, 2700, 2800, 2900, 3000};
	private static Integer[] monsterCakeAverages3inputs = new Integer[] {0,
			450, 940, 1400, 1550, 1800,
			1940, 2080, 2220, 2360, 2500,
			2600, 2700, 2800, 2900, 3000,
			3100, 3200, 3300, 3400, 3500};

	private static Integer[] pacyIths = new Integer[] {4, 6, 9, 10, 13, 14, 21, 27, 42};
	private static Integer[] pacyNums = new Integer[] {85, 198, 256, 263, 286, 290, 296, 297, 300};
	private static Integer[] pacyAverages2inputs = new Integer[] {0,
			150, 270, 350, 450, 510,
			560, 610, 660, 710, 750,
			780, 810, 840, 870, 900,
			940, 980, 1020, 1060, 1100};
	private static Integer[] pacyAverages3inputs = new Integer[] {0,
			140, 255, 275, 285, 300,
			304, 308, 312, 316, 320,
			324, 328, 332, 336, 340,
			343, 346, 349, 352, 355};

	private static Integer[] catRunnerIths = new Integer[] {5, 7, 10, 11, 14, 15, 22, 28, 43};
	private static Integer[] catRunnerNums = new Integer[] {112, 136, 205, 215, 254, 259, 270, 274, 290};
	private static Integer[] catRunnerAverages2inputs = new Integer[] {0,
			110, 170, 215, 250, 260,
			280, 300, 320, 335, 350,
			360, 370, 380, 390, 400,
			410, 420, 430, 440, 445};
	private static Integer[] catRunnerAverages3inputs = new Integer[] {0,
			110, 200, 250, 280, 310,
			330, 350, 370, 385, 400,
			410, 420, 428, 435, 440,
			444, 448, 452, 456, 460};
	private static Integer[] catRunnerAverages4inputs = new Integer[] {0,
			120, 190, 230, 260, 295,
			320, 340, 360, 375, 390,
			406, 426, 442, 456, 470,
			484, 498, 512, 526, 540};
	
	private static Integer[] galaxyStormIths = new Integer[] {2, 6, 8, 44};
	private static Integer[] galaxyStormNums = new Integer[] {135, 312, 375, 656};
	private static Integer[] galaxyStormAverages2inputs = new Integer[] {0,
			300, 400, 550, 680, 750,
			840, 930, 1020, 1110, 1200,
			1260, 1320, 1380, 1440, 1500,
			1570, 1640, 1710, 1780, 1850};
	private static Integer[] galaxyStormAverages3inputs = new Integer[] {0,
			300, 400, 520, 590, 630,
			660, 690, 730, 760, 790,
			810, 830, 850, 865, 880,
			888, 896, 904, 912, 920};

	private static Integer[] oneTapZombieIths = new Integer[] {3, 7, 9, 45};
	private static Integer[] oneTapZombieNums = new Integer[] {275, 448, 527, 870};
	private static Integer[] oneTapZombieAverages2inputs = new Integer[] {0,
			400, 530, 750, 850, 1000,
			1080, 1160, 1240, 1320, 1390,
			1470, 1560, 1640, 1720, 1800,
			1920, 2040, 2160, 2280, 2400};
	private static Integer[] oneTapZombieAverages3inputs = new Integer[] {0,
			400, 540, 630, 720, 800,
			860, 920, 980, 1040, 1100,
			1120, 1140, 1160, 1180, 1200,
			1200, 1210, 1230, 1235, 1240};

	private static Integer[] amazingLinesIths = new Integer[] {3, 6, 20, 26};
	private static Integer[] amazingLinesNums = new Integer[] {254, 459, 695, 731};
	private static Integer[] amazingLinesAverages2inputs = new Integer[] {0,
			440, 680, 950, 1100, 1200,
			1360, 1520, 1680, 1840, 2000,
			2100, 2200, 2300, 2400, 2500,
			2660, 2820, 2980, 3140, 3300};
	private static Integer[] amazingLinesAverages3inputs = new Integer[] {0,
			440, 600, 660, 680, 690,
			700, 710, 720, 730, 740,
			742, 744, 746, 748, 750,
			751, 752, 753, 754, 755};

	private static Integer[] chessClassicIths = new Integer[] {2, 4, 7, 8, 11};
	private static Integer[] chessClassicNums = new Integer[] {252, 593, 929, 988, 1099};
	private static Integer[] chessClassicAverages2inputs = new Integer[] {0,
			600, 1000, 1300, 1500, 1700,
			1840, 1980, 2120, 2260, 2430,
			2700, 2970, 3240, 3520, 3800,
			4000, 4200, 4400, 4600, 4800};
	private static Integer[] chessClassicAverages3inputs = new Integer[] {0,
			600, 1080, 1510, 1960, 2450,
			2700, 2900, 3100, 3300, 3500,
			3940, 4380, 4820, 5260, 5700,
			6080, 6460, 6840, 7220, 7600};

	
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
		    	addConfidenceIntervals(chart, (float) 5);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bubleBreakerAverages4inputs);
		    	addConfidenceIntervals(chart, (float) 8);
				return chart;
			}
		} else if (CANDY_SWIPE_SLOTS.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, candySwipeSlotsAverages2inputs);
		    	addConfidenceIntervals(chart, null);
				return chart;
			} else if (inputDataLength == 3) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, candySwipeSlotsAverages3inputs);
		    	addConfidenceIntervals(chart, (float) 0.2);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, candySwipeSlotsAverages4inputs);
		    	addConfidenceIntervals(chart, (float) 0.5);
				return chart;
			}
		} else if (BLOOD_ZOMBIE.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bloodZombieAverages2inputs);
		    	addConfidenceIntervals(chart, 3f);
				return chart;
			} else if (inputDataLength == 3) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bloodZombieAverages3inputs);
		    	addConfidenceIntervals(chart, 12f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, bloodZombieAverages4inputs);
		    	addConfidenceIntervals(chart, 0.5f);
				return chart;
			}
		} else if (MATH_BEGINS.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, mathBeginsAverages2inputs);
		    	addConfidenceIntervals(chart, null);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, mathBeginsAverages3inputs);
		    	addConfidenceIntervals(chart, 8f);
				return chart;
			}
		} else if (CHESS_OK.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, chessOkAverages2inputs);
		    	addConfidenceIntervals(chart, 8f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, chessOkAverages3inputs);
		    	addConfidenceIntervals(chart, 19f);
				return chart;
			}
		} else if (SKATER_KID.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, skaterKidAverages2inputs);
		    	addConfidenceIntervals(chart, null);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, skaterKidAverages3inputs);
		    	addConfidenceIntervals(chart, 5f);
				return chart;
			}
		} else if (MONSTER_CAKE.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, monsterCakeAverages2inputs);
		    	addConfidenceIntervals(chart, 0.2f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, monsterCakeAverages3inputs);
		    	addConfidenceIntervals(chart, 7f);
				return chart;
			}
		} else if (PACY.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, pacyAverages2inputs);
		    	addConfidenceIntervals(chart, 3f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, pacyAverages3inputs);
		    	addConfidenceIntervals(chart, 10f);
				return chart;
			}
		} else if (CAT_RUNNER.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, catRunnerAverages2inputs);
		    	addConfidenceIntervals(chart, null);
				return chart;
			} else if (inputDataLength == 3) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, catRunnerAverages3inputs);
		    	addConfidenceIntervals(chart, 2f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, catRunnerAverages4inputs);
		    	addConfidenceIntervals(chart, 6f);
				return chart;
			}
		} else if (GALAXY_STORM.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, galaxyStormAverages2inputs);
		    	addConfidenceIntervals(chart, 0.5f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, galaxyStormAverages3inputs);
		    	addConfidenceIntervals(chart, 1.5f);
				return chart;
			}
		} else if (ONE_TAP_ZOMBIE.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, oneTapZombieAverages2inputs);
		    	addConfidenceIntervals(chart, null);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, oneTapZombieAverages3inputs);
		    	addConfidenceIntervals(chart, 2f);
				return chart;
			}
		} else if (AMAZING_LINES.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, amazingLinesAverages2inputs);
		    	addConfidenceIntervals(chart, 1.5f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, amazingLinesAverages3inputs);
		    	addConfidenceIntervals(chart, -1f);
				return chart;
			}
		} else if (CHESS_CLASSIC.equals(cleanAppName)) {		
			if (inputDataLength == null || inputDataLength == 2) {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, chessClassicAverages2inputs);
		    	addConfidenceIntervals(chart, 6f);
				return chart;
			} else {
		    	EbolaChart chart = new EbolaChart();
		    	addItemsStep5(chart, chessClassicAverages3inputs);
		    	addConfidenceIntervals(chart, 8.5f);
				return chart;
			}
		} else {
			return null;
		}
	}

	private static void addItemsStep5(EbolaChart chart, Integer... bubleBreakerAverages2inputs2) {
		addItemsStep(chart, 5, bubleBreakerAverages2inputs2);
	}

	private static void addConfidenceIntervals(EbolaChart chart, Float wider) {
		for (EbolaAverageItem average : chart.getAverages()) {
			int day = average.getDayNumber();
			float av = average.getAverage();
			float perc = (float) (0.1 +  ((float)day)/2000);
			if (wider != null) {
				perc = perc + (day * wider)/2000;
			}
			float min = av * (1 - perc);
			float max = av * (1 + perc);
			chart.addRangeItem(day, Math.round(min), Math.round(max));
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
		} else if (CANDY_SWIPE_SLOTS.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = candySwipeSlotsIths[i];
				nums[i] = candySwipeSlotsNums[i];
			}
		} else if (BLOOD_ZOMBIE.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = bloodZombieIths[i];
				nums[i] = bloodZombieNums[i];
			}
		} else if (MATH_BEGINS.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = mathBeginsIths[i];
				nums[i] = mathBeginsNums[i];
			}
		} else if (CHESS_OK.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = chessOkIths[i];
				nums[i] = chessOkNums[i];
			}
		} else if (SKATER_KID.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = skaterKidIths[i];
				nums[i] = skaterKidNums[i];
			}
		} else if (MONSTER_CAKE.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = monsterCakeIths[i];
				nums[i] = monsterCakeNums[i];
			}
		} else if (PACY.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = pacyIths[i];
				nums[i] = pacyNums[i];
			}
		} else if (CAT_RUNNER.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = catRunnerIths[i];
				nums[i] = catRunnerNums[i];
			}
		} else if (GALAXY_STORM.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = galaxyStormIths[i];
				nums[i] = galaxyStormNums[i];
			}
		} else if (ONE_TAP_ZOMBIE.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = oneTapZombieIths[i];
				nums[i] = oneTapZombieNums[i];
			}
		} else if (AMAZING_LINES.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = amazingLinesIths[i];
				nums[i] = amazingLinesNums[i];
			}
		} else if (CHESS_CLASSIC.equals(cleanAppName)) {
			for (int i = 0; i < size; i++) {
				iths[i] = chessClassicIths[i];
				nums[i] = chessClassicNums[i];
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
		} else if (CANDY_SWIPE_SLOTS.equals(cleanAppName)) {
			for (int i = 1; i <= size; i++) {
				iths[size - i] = candySwipeSlotsIths[8 - i];
				nums[size - i] = candySwipeSlotsNums[8 - i];
			}
		} else if (BLOOD_ZOMBIE.equals(cleanAppName)) {
			size = size - 2;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = bloodZombieIths[6 - i];
				nums[size - i] = bloodZombieNums[6 - i];
			}
		} else if (MATH_BEGINS.equals(cleanAppName)) {
			size = size - 2;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = mathBeginsIths[6 - i];
				nums[size - i] = mathBeginsNums[6 - i];
			}
		} else if (CHESS_OK.equals(cleanAppName)) {
			size = size - 2;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = chessOkIths[6 - i];
				nums[size - i] = chessOkNums[6 - i];
			}
		} else if (SKATER_KID.equals(cleanAppName)) {
			size = size - 3;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = skaterKidIths[5 - i];
				nums[size - i] = skaterKidNums[5 - i];
			}
		} else if (MONSTER_CAKE.equals(cleanAppName)) {
			size = size - 1;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = monsterCakeIths[7 - i];
				nums[size - i] = monsterCakeNums[7 - i];
			}
		} else if (PACY.equals(cleanAppName)) {
			size = size + 1;
			iths = new Integer[size];
			nums = new Integer[size];
			for (int i = 1; i <= size; i++) {
				iths[size - i] = pacyIths[9 - i];
				nums[size - i] = pacyNums[9 - i];
			}
		} else if (CAT_RUNNER.equals(cleanAppName)) {
			size = size + 1;
			iths = new Integer[size];
			nums = new Integer[size];
			for (int i = 1; i <= size; i++) {
				iths[size - i] = catRunnerIths[9 - i];
				nums[size - i] = catRunnerNums[9 - i];
			}
		} else if (GALAXY_STORM.equals(cleanAppName)) {
			size = size - 4;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = galaxyStormIths[4 - i];
				nums[size - i] = galaxyStormNums[4 - i];
			}
		} else if (ONE_TAP_ZOMBIE.equals(cleanAppName)) {
			size = size - 4;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = oneTapZombieIths[4 - i];
				nums[size - i] = oneTapZombieNums[4 - i];
			}
		} else if (AMAZING_LINES.equals(cleanAppName)) {
			size = size - 4;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = amazingLinesIths[4 - i];
				nums[size - i] = amazingLinesNums[4 - i];
			}
		} else if (CHESS_CLASSIC.equals(cleanAppName)) {
			size = size - 3;
			for (int i = 1; i <= size; i++) {
				iths[size - i] = chessClassicIths[5 - i];
				nums[size - i] = chessClassicNums[5 - i];
			}
		} 
		return new EbolaDataTable(iths, nums, appName);
	}

}
