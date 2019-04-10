package com.kh.example.chap01_poly.electronic.controller;

import com.kh.example.chap01_poly.electronic.model.vo.Desktop;
import com.kh.example.chap01_poly.electronic.model.vo.NoteBook;
import com.kh.example.chap01_poly.electronic.model.vo.Tablet;

public class ElectronicController {
	// 1. 다형성 적용 안 했을 때
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet tab = null;

	// insert() : 값 대입 메소드 (오버로딩)
	public void insert(Desktop desk) {
		this.desk = desk;
	}

	public void insert(NoteBook note) {
		this.note = note;
	}

	public void insert(Tablet tab) {
		this.tab = tab;
	}

	// select() : 값 반환 메소드
	public Desktop selectDesktop() {
		return desk;
	}

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tab;
	}
}
