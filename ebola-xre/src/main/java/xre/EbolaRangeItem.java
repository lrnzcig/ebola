package xre;

public class EbolaRangeItem {
	
	private Float[] items;

	public EbolaRangeItem() {
		super();
	}

	public EbolaRangeItem(Float[] items) {
		super();
		this.setItems(items);
	}

	public EbolaRangeItem(int day, float lower, float upper) {
		super();
		setDayNumber(day);
		setLowerLimit(lower);
		setUpperLimit(upper);
	}

	public Float[] getItems() {
		return items;
	}

	public void setItems(Float[] items) {
		this.items = items;
	}
	
	public void setDayNumber(int value) {
		if (this.items == null) {
			initItems();
		}
		this.items[0] = (float) value;
	}

	public void setLowerLimit(float value) {
		if (this.items == null) {
			initItems();
		}
		this.items[1] = value;
	}
	
	public void setUpperLimit(float value) {
		if (this.items == null) {
			initItems();
		}
		this.items[2] = value;
	}

	private void initItems() {
		this.items = new Float[3];
	}
	
	

}
