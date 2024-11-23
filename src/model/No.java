package model;

public class No {

	protected int info;
	private No esquerda;
	private No direita;

	public No(int info) {
		this.info = info;
		this.esquerda = null;
		this.direita = null;
	}

	public int getInfo() {
		return info;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}
	
}
