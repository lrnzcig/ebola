package xre;

public class EbolaAverageItem {

	private Float[] items;

	public EbolaAverageItem() {
		super();
	}

	public EbolaAverageItem(Float[] items) {
		super();
		this.setItems(items);
	}

	public EbolaAverageItem(int day, float average) {
		super();
		setDayNumber(day);
		setAverage(average);
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

	public void setAverage(float value) {
		if (this.items == null) {
			initItems();
		}
		this.items[1] = value;
	}
	
	private void initItems() {
		this.items = new Float[2];
	}

}
