package com.staff.main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;



public class Staff {
	Scanner scan = new Scanner(System.in);

	String name;
	String id;
	Income income;
	DecimalFormat indo;
	DecimalFormatSymbols rupiah;
	
	
	
	Staff(String name ,String id , Income income ){
		
		this.name = name;
		this.id = id;
		this.income = income;
			
	}
	
	String getName() {
		return this.name;

	}

	String getId() {
		return this.id;

	}

	void displayStaffInfo() {
		
		System.out.println("Nama Karyawan: " + this.name);
		System.out.println("ID Karyawan: " + this.id);
		
	}
	
	public double calculateNetIncome() {
		return income.getAmount() - income.getTotalTax();
	}
	
	
	
	
	void displayIncomeInfo() {
		
		rupiah = new DecimalFormatSymbols();
		rupiah.setCurrencySymbol("Rp. ");
		rupiah.setMonetaryDecimalSeparator(',');
		rupiah.setGroupingSeparator('.');
		
		indo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		indo.setDecimalFormatSymbols(rupiah);
		
		
		System.out.println("Pendapatan Karyawan: " + indo.format(income.getAmount()));
		System.out.println("Income Type: " + income.jenis);
		System.out.println("Pajak: " + income.getTax() + "%");
		System.out.println("Pajak yang harus dibayar: " + indo.format(income.getTotalTax()));
		System.out.println("Pendapatan Bersih: " + indo.format(calculateNetIncome()));
	}		
}
