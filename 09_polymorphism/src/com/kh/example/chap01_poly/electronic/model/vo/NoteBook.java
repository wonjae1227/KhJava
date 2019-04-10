package com.kh.example.chap01_poly.electronic.model.vo;

public class NoteBook extends Electronic {
	private String cpu;
	private int usbPort;

	public NoteBook() {
	}

	public NoteBook(String cpu, int usbPort) {
		this.cpu = cpu;
		this.usbPort = usbPort;
	}

	public void getCpu(String cpu) {
		this.cpu = cpu;

	}

	public String setCpu() {
		return cpu;
	}

	public void getUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	public int setUsbPort() {
		return usbPort;
	}

	public String toString() {
		return "NoteBook [" + super.toString() + " ,cpu=" + cpu + ", usbPort=" + usbPort + "]";
	}
}
