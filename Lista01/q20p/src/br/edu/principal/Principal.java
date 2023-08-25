package br.edu.principal;

import java.text.*;
import java.util.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		System.out.println("Coloque o angulo que essa escada forma: ");
		int ang = sc.nextInt();
		System.out.println("Qual a distância que essa escada está da parede: ");
		int alt = sc.nextInt();
		double radiano = (ang * 3.14)/180;
		double escada = alt/radiano;
		
		System.out.println("Essa é a medida da escada para que se possa alcançar a sua ponta: "+casas.format(escada)+"°");
	}

}
