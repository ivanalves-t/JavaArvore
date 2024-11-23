package model;

public class Arvore {
	private No raiz;

	public No getRaiz() {
		return this.raiz;
	}

	public Arvore() {
		this.raiz = null;
	}

	public void insere(int valor) {
		if (this.raiz == null) {
			this.raiz = new No(valor);
			return;
		}
		insereRecursivo(this.raiz, valor);
	}

	private void insereRecursivo(No no, int valor) {

		if (valor < no.getInfo()) {
			if (no.getEsquerda() == null) {
				no.setEsquerda(new No(valor));
				return;
			}
			insereRecursivo(no.getEsquerda(), valor);
		} else {
			if (no.getDireita() == null) {
				no.setDireita(new No(valor));
				return;
			}
			insereRecursivo(no.getDireita(), valor);
		}
	}

	private String res = "";

	public String preOrdem() {
		if (this.raiz == null) {
			return "arvore vazia";
		}
		res = "";
		preOrdemRecursivo(this.raiz);
		return res;
	}

	private void preOrdemRecursivo(No aux) {

		res += aux.getInfo() + " ";

		if (aux.getEsquerda() != null) {
			preOrdemRecursivo(aux.getEsquerda());
		}

		if (aux.getDireita() != null) {
			preOrdemRecursivo(aux.getDireita());
		}
	}

	public String emOrdem() {
		if (this.raiz == null) {
			return "arvore vazia";
		}
		res = "";
		emOrdemRecursivo(this.raiz);
		return res;
	}

	private boolean arvoreVazia() {
		return this.raiz == null;
	}

	private void emOrdemRecursivo(No aux) {

		if (aux.getEsquerda() != null) {
			emOrdemRecursivo(aux.getEsquerda());
		}

		res += aux.getInfo() + " ";

		if (aux.getDireita() != null) {
			emOrdemRecursivo(aux.getDireita());
		}
	}

	public String posOrdem() {
		if (this.raiz == null) {
			return "arvore vazia";
		}
		res = "";
		posOrdemRecursivo(this.raiz);
		return res;
	}

	private void posOrdemRecursivo(No aux) {

		if (aux.getEsquerda() != null) {
			posOrdemRecursivo(aux.getEsquerda());
		}

		if (aux.getDireita() != null) {
			posOrdemRecursivo(aux.getDireita());
		}

		res += aux.getInfo() + " ";
	}

	public String busca(int valor) {
		if (arvoreVazia()) {
			return "arvore vazia";
		}
		buscaRecursiva(this.raiz, valor);
		
		if (res.equals(String.valueOf(valor))) {
			return "encontrado: " + valor;
		}
		return "não encontrado: " + valor;
	}

	public void buscaRecursiva(No aux, int valor) {
		
		if (aux.getInfo() == valor) {
			res = String.valueOf(valor);
			return;
		}

		if (aux.getEsquerda() != null) {
			buscaRecursiva(aux.getEsquerda(), valor);
		}

		if (aux.getDireita() != null) {
			buscaRecursiva(aux.getDireita(), valor);
		}
	}
}
