package xre;

public class EbolaDataTable {

	private Integer[] iths;
	private Integer[] nums;
	private String appName;

	public EbolaDataTable() {
		
	}
	
	public EbolaDataTable(Integer[] iths, Integer[] nums, String appName) {
		this.setIths(iths);
		this.setNums(nums);
		this.setAppName(appName);
	}

	public Integer[] getIths() {
		return iths;
	}

	public void setIths(Integer[] iths) {
		this.iths = iths;
	}

	public Integer[] getNums() {
		return nums;
	}

	public void setNums(Integer[] nums) {
		this.nums = nums;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

}
