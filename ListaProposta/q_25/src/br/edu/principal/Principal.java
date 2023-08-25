package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas horas já se passaram: ");
		int hora = sc.nextInt();
		System.out.println("Quantos minutos já se passaram: ");
		int minutos = sc.nextInt();
		
		int hora_min = hora * 60;
		int total_min = minutos + hora_min;
		int min_segun = minutos * 60;
		
		System.out.println("Hora convertida em minutos: "+hora_min+" min");
		System.out.println("Total dos minutos: "+total_min+" min");
		System.out.println("Minutos convertidos em segundos: "+min_segun+" seg");
	}

}
