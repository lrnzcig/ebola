package xre;

import java.util.Arrays;

public class EbolaChart {

	private EbolaRangeItem[] ranges;
	private EbolaAverageItem[] averages;
	
	public EbolaChart() {
		super();
	}
	
	public EbolaChart(EbolaRangeItem[] ranges, EbolaAverageItem[] averages) {
		super();
		this.setRanges(ranges);
		this.setAverages(averages);
	}
	
	public EbolaRangeItem[] getRanges() {
		return ranges;
	}
	
	public void setRanges(EbolaRangeItem[] ranges) {
		this.ranges = ranges;
	}
	
	public EbolaAverageItem[] getAverages() {
		return averages;
	}
	
	public void setAverages(EbolaAverageItem[] averages) {
		this.averages = averages;
	}
	
	public void addRangeItem(int day, float lower, float upper) {
		if (this.ranges == null) {
			this.ranges = new EbolaRangeItem[1];
		} else {
			int newLength = this.ranges.length + 1;
			this.ranges = Arrays.copyOf(this.ranges, newLength);
		}
		this.ranges[this.ranges.length - 1] = new EbolaRangeItem(day, lower, upper);		
	} 

	public void addAverageItem(int day, float average) {
		if (this.averages == null) {
			this.averages = new EbolaAverageItem[1];
		} else {
			int newLength = this.averages.length + 1;
			this.averages = Arrays.copyOf(this.averages, newLength);
		}
		this.averages[this.averages.length - 1] = new EbolaAverageItem(day, average);		
	} 

}
