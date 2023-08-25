package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int horas_t = 40;
		int vlr_sal_min = 2500;
		int vlr_hora_t = vlr_sal_min/2;
		int vlr_sal_bru = vlr_hora_t * horas_t;
		int imp = (vlr_sal_bru * 3)/100;
		int vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.println("Salário Líquido: R$"+vlr_sal_liq);
	}

}
