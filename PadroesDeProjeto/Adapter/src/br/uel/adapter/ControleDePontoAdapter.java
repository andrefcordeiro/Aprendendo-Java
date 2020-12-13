package br.uel.adapter;


public class ControleDePontoAdapter extends ControleDePonto {
	
	private ControleDePontoNovo controle;
	
	public ControleDePontoAdapter() {
		controle = new ControleDePontoNovo();
	}
	

	public void registrarEntrada(Funcionario f){
		this.controle.registrar(f, true);
	}
	
	public void registrarSaida(Funcionario f){
		this.controle.registrar(f, false);
	}

}
