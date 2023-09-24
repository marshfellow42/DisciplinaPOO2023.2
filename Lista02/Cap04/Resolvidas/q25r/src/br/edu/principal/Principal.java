package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int voltas = 0;
		
		System.out.print("Qual a medida do ângulo (em graus)?: ");
		int angulo = sc.nextInt();
		
		if (angulo > 360 || angulo < -360) {
			voltas = angulo/360;
			angulo = angulo/360;
		}
		else {
			voltas = 0;
		}
		
		if (angulo == 0 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
			System.out.println("Está sobre um desse eixos: ");
		}
		else {
			System.out.print("Ele se localiza no ");
		}
		
		
		if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
			System.out.println("1° Quadrante");
		}
		
		else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
			System.out.println("2° Quadrante");
		}
		
		else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
			System.out.println("3° Quadrante");
		}
		
		else if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
			System.out.println("4° Quadrante");
		}
		
		System.out.print(voltas + " voltas no sentido ");
		
		if (angulo < 0) {
			System.out.println("horário");
		}
		
		else if (angulo > 0) {
			System.out.println("anti-horário");
		}
		

	}

}
