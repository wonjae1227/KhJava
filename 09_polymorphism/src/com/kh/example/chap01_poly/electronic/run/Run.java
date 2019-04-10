package com.kh.example.chap01_poly.electronic.run;

import com.kh.example.chap01_poly.electronic.controller.ElectronicController;
import com.kh.example.chap01_poly.electronic.model.vo.Desktop;
import com.kh.example.chap01_poly.electronic.model.vo.Electronic;
import com.kh.example.chap01_poly.electronic.model.vo.NoteBook;
import com.kh.example.chap01_poly.electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {
		ElectronicController ec = new ElectronicController();

		ec.insert(new Desktop("samsung", "����ũž", 1200, "intel", "������"));
		ec.insert(new NoteBook("LG", "�׷�", 1500, "intel", 3));
		ec.insert(new Tablet("Apple", "�����е�", 8000, false));
//
//		System.out.println(ec.selectDesktop());
//		System.out.println(ec.selectNoteBook());
//		System.out.println(ec.selectTablet());
		
		Electronic[] elec = ec.select();
		for(int i = 0; i < elec.length ; i++) {
			System.out.println(elec[i]); //���� ���ε�
		}
	}

}
