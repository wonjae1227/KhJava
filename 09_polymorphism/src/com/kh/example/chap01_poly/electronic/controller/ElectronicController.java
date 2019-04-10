package com.kh.example.chap01_poly.electronic.controller;

import com.kh.example.chap01_poly.electronic.model.vo.Desktop;
import com.kh.example.chap01_poly.electronic.model.vo.NoteBook;
import com.kh.example.chap01_poly.electronic.model.vo.Tablet;

public class ElectronicController {
	// 1. ������ ���� �� ���� ��
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet tab = null;

	// insert() : �� ���� �޼ҵ� (�����ε�)
	public void insert(Desktop desk) {
		this.desk = desk;
	}

	public void insert(NoteBook note) {
		this.note = note;
	}

	public void insert(Tablet tab) {
		this.tab = tab;
	}

	// select() : �� ��ȯ �޼ҵ�
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
