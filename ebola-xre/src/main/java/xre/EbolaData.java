package xre;

public class EbolaData {

	private Integer[] iths;
	private Integer[] nums;

	public EbolaData() {
		
	}
	
	public EbolaData(Integer[] iths, Integer[] nums) {
		this.setIths(iths);
		this.setNums(nums);
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

}
