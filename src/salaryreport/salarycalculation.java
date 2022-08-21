package salaryreport;

import java.util.Scanner;

public class salarycalculation {

int Basicpay;
int BOA;
int Bonus;
double PF;
double monthlysalary;
double annualsalary;
int annualtax;
double monthlytax;
double monthlytakehome;
int l;
   
public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in); // get inputs
	System.out.println("employlevel,l =");
	int l = myObj.nextInt();

	salarycalculation takehomeCalculation = new salarycalculation();
	double monthlytakehome = takehomeCalculation.calculatemonthlytakehome(l);
	System.out.println("monthlytakehome "+monthlytakehome);
}
public double calculatemonthlytakehome (int l) {
	
	if(l==1) {
	this.Basicpay = 7000;
	this.BOA= 5000;
	this. Bonus=2000;
	}
	
	else if(l == 2) {
		this.Basicpay = 10000;
		this.BOA= 7000;
		this. Bonus=2500;
		}
	
	else if(l==3) {
		this.Basicpay = 12000;
		this.BOA= 8000;
		this. Bonus=3000;
	}
	else if(l== 4) {
		this.Basicpay = 15000;
		this.BOA= 10000;
		this. Bonus=3500;
	}
		
	 PF = Basicpay *0.12;
	 monthlysalary = Basicpay +BOA+Bonus-PF;
	 annualsalary = monthlysalary*12;
	 double tax = calculatetax(annualsalary);
	 monthlytax = tax/12;
	 monthlytakehome = monthlysalary-monthlytax;
	 	 return monthlytakehome;
	 
	}
	
private  double calculatetax(double annualsalary) {
	double tax = 0;
	if (annualsalary>250000 && annualsalary<500000) {
		tax = annualsalary * 5/100 ;
	}
	else if(annualsalary>500000 && annualsalary<750000) {
		tax = annualsalary * 10/100 ;
	}
	else if(annualsalary>750000 && annualsalary<1000000) {
		tax = annualsalary * 15/100 ;
	}
	else if(annualsalary>1000000 && annualsalary<1250000) {
		tax = annualsalary * 20/100 ;
	}
	else if(annualsalary>1250000 && annualsalary<1500000) {
		tax = annualsalary * 25/100 ;
	}
	else if(annualsalary>=1500000 ) {
		tax = annualsalary * 30/100 ;
	}
	return tax;
}
}