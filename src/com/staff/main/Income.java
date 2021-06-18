package com.staff.main;

import java.util.Scanner;

public class Income {
Scanner scan = new Scanner(System.in);
	
	String incomeType ;
	double amount;
	double tax;
	double totalTax;
	String jenis;

	Income( double amount , double tax){
		
		this.incomeType = incomeType;
		this.amount = amount;
		this.tax = tax;
		
	}
	
	String getIncomeType() {
		
		this.jenis=jenis;
		System.out.println("Pilih Jenis Penghasilan");
		System.out.println("1.Bulanan");
		System.out.println("2.Harian");
		int jenisPenghasilan = scan.nextInt();
		
		switch(jenisPenghasilan) {
		case 1:
		    jenis=("Bulanan");
		    break;
		  case 2:
			 jenis=("harian");
		    break;
		}
	
		return incomeType;
		
	}
	
	Double getAmount() {
		return amount;
		
	}
	
	Double getTax() {
		return tax;
		
	}
	
	Double getTotalTax() {
		return (tax/100) * amount;
	}		
}
