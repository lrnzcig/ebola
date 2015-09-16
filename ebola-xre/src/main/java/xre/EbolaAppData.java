package xre;

public class EbolaAppData {
	
	private EbolaDataTable dataTable;
	private EbolaChart chart;

	public EbolaAppData() {
		super();
	}

	public EbolaAppData(EbolaDataTable dataTable, EbolaChart chart) {
		super();
		this.dataTable = dataTable;
		this.chart = chart;
	}

	public EbolaDataTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(EbolaDataTable dataTable) {
		this.dataTable = dataTable;
	}

	public EbolaChart getChart() {
		return chart;
	}

	public void setChart(EbolaChart chart) {
		this.chart = chart;
	}
	
	

}
