package com.kh.example.chap01_poly.electronic.controller;

import com.kh.example.chap01_poly.electronic.model.vo.Desktop;
import com.kh.example.chap01_poly.electronic.model.vo.Electronic;
import com.kh.example.chap01_poly.electronic.model.vo.NoteBook;
import com.kh.example.chap01_poly.electronic.model.vo.Tablet;

public class ElectronicController {
	
//	// 1. 다형성 적용 안 했을 때
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet tab = null;

	// insert() : 값 대입 메소드 (오버로딩)
//	public void insert(Desktop desk) {
//		this.desk = desk;
//	}
//
//	public void insert(NoteBook note) {
//		this.note = note;
//	}
//
//	public void insert(Tablet tab) {
//		this.tab = tab;
//	}

	// select() : 값 반환 메소드
//	public Desktop selectDesktop() {
//		return desk;
//	}
//
//	public NoteBook selectNoteBook() {
//		return note;
//	}
//
//	public Tablet selectTablet() {
//		return tab;
//	}
//	
//	// 2. 다형성 적용 했을때
//	public void insert(Electronic e) {
//		if(e instanceof Desktop) {
//			desk = (Desktop)e;
//		}
//		if(e instanceof NoteBook) {
//			note = (NoteBook)e;
//		}
//		if(e instanceof Tablet) {
//			tab = (Tablet)e;
//		}
//		
//	}
//	public Electronic selectDesktop() {
//		return desk;
//	}
//	public Electronic selectNoteBook() {
//		return note;
//	}
//	public Electronic selectTablet() {
//		return tab;
//	}
//}
	private Electronic[] elec = new Electronic[3];
	private int index = 0;
	
	public void insert(Electronic e) {
		elec[index] = e;
		index++;
	}
	public Electronic[] select() {
		return elec;
	}
}
