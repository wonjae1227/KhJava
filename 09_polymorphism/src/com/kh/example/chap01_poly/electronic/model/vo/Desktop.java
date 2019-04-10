package com.kh.example.chap01_poly.electronic.model.vo;

public class Desktop extends Electronic {
	private String cpu;
	private String graphic;

	public Desktop() {
	}

	public Desktop(String brand, String name, int price, String cpu, String graphic) {
		super(brand, name, price);
		this.cpu = cpu;
		this.graphic = graphic;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public String getGraphic() {
		return graphic;
	}

}
