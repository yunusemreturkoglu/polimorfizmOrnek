package com.bilgeadam.bisiklet;

import java.util.Scanner;



public class TestBisiklet2 {

	public static void main(String[] args) {	
	Scanner scanner = new Scanner(System.in);
	
	
	String bisikletMenu = "Bisikletler...\n"
					+ "1. Dag Bisikleti\n"
					+ "2. Sehir Bisikleti\n"
					+ "3. Hiz Bisikleti\n"
					+ "Cikmak Icin X e Basiniz" ;
	
	while(true) {
		System.out.println("**********************************");
		System.out.println("Bisiklet Seciniz: ");
		System.out.println(bisikletMenu);
		System.out.println("**********************************");
	
		String bisikletAl = scanner.nextLine();
		if (bisikletAl.equals("x")) {
			System.out.println("Programdan Cikiliyor");
			break;
		}
		
		
		else if (bisikletAl.equals("1")) {
			DagBisikleti dagBisikleti = new DagBisikleti("BMX","Dag Bisikleti");
			
			
			while(true) {
				System.out.println("**********************************");
				System.out.println("Dag Bisikleti Fonksiyon Secimi: ");
				dagBisikleti.bisikletMenu();			
				System.out.println("**********************************");
				String bisikletOzellikAl = scanner.nextLine();
				if (bisikletOzellikAl.equals("x")) {
					break;
				}else if(bisikletOzellikAl.equals("1")) {
					dagBisikleti.pedalAt();
					dagBisikleti.gosterge();					
				}else if(bisikletOzellikAl.equals("2")) {
					dagBisikleti.vitesArttir();
					dagBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("3")) {
					dagBisikleti.vitesAzalt();
					dagBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("4")) {
					dagBisikleti.frenYap();
					dagBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("5")) {
					dagBisikleti.dur();
					dagBisikleti.gosterge();
				}else {
					System.out.println("Gecersiz islem");
				}
			}
		}
				
			
		
		else if (bisikletAl.equals("2")) {
			SehirBisikleti sehirBisikleti = new SehirBisikleti("CityBike","Sehir Bisikleti");
			
			
			while(true) {
				System.out.println("**********************************");
				System.out.println("Sehir Bisikleti Fonksiyon Secimi: ");
				sehirBisikleti.bisikletMenu();
				
				System.out.println("**********************************");
				String bisikletOzellikAl = scanner.nextLine();
				if (bisikletOzellikAl.equals("x")) {
					break;
				}else if(bisikletOzellikAl.equals("1")) {
					sehirBisikleti.pedalAt();
					sehirBisikleti.gosterge();					
				}else if(bisikletOzellikAl.equals("2")) {
					sehirBisikleti.vitesArttir();
					sehirBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("3")) {
					sehirBisikleti.vitesAzalt();
					sehirBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("4")) {
					sehirBisikleti.frenYap();
					sehirBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("5")) {
					sehirBisikleti.dur();
					sehirBisikleti.gosterge();
				}else {
					System.out.println("Gecersiz islem");
				}
				
			}		
		}
		else if (bisikletAl.equals("3")) {
			HizBisikleti hizBisikleti = new HizBisikleti("Speedy","Hiz Bisikleti");
			
			
			while(true) {
				System.out.println("**********************************");
				System.out.println("Hiz Bisikleti Fonksiyon Secimi: ");
				hizBisikleti.bisikletMenu();
				System.out.println("**********************************");
				String bisikletOzellikAl = scanner.nextLine();
				if (bisikletOzellikAl.equals("x")) {
					break;
				}else if(bisikletOzellikAl.equals("1")) {
					hizBisikleti.pedalAt();
					hizBisikleti.gosterge();
					
				}else if(bisikletOzellikAl.equals("2")) {
					hizBisikleti.vitesArttir();
					hizBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("3")) {
					hizBisikleti.vitesAzalt();
					hizBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("4")) {
					hizBisikleti.frenYap();
					hizBisikleti.gosterge();
				}else if(bisikletOzellikAl.equals("5")) {
					hizBisikleti.dur();
					hizBisikleti.gosterge();
				}else {
					System.out.println("Gecersiz islem");
				}
				
			}		
		}else {
			System.out.println("Gecersiz islem");
		}
		
		
		
		
		
		
		
		
	}
	}
	}
	

		
			
				


