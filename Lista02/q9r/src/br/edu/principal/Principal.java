package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		int dia, mes, ano, hora, min;
		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		cal.setTime(d);
		dia = cal.get(Calendar.DAY_OF_MONTH);
		mes = cal.get(Calendar.MONTH) + 1;
		ano = cal.get(Calendar.YEAR);
		
		System.out.println("Data atual: " +dia+ "/" +mes+ "/" +ano+ "-");
		
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		if (mes == 2) {
			System.out.println("Fevereiro");
		}
		if (mes == 3) {
			System.out.println("Março");
		}
		if (mes == 4) {
			System.out.println("Abril");
		}
		if (mes == 5) {
			System.out.println("Maio");
		}
		if (mes == 6) {
			System.out.println("Junho");
		}
		if (mes == 7) {
			System.out.println("Julho");
		}
		if (mes == 8) {
			System.out.println("Agosto");
		}
		if (mes == 9) {
			System.out.println("Setembro");
		}
		if (mes == 10) {
			System.out.println("Outubro");
		}
		if (mes == 11) {
			System.out.println("Novembro");
		}
		if (mes == 12) {
			System.out.println("Dezembro");
		}
		
		hora = cal.get(Calendar.HOUR);
		min = cal.get(Calendar.MINUTE);
		
		System.out.print("Hora Atual: ");
		System.out.println(hora + ":" + min);
	}

}
