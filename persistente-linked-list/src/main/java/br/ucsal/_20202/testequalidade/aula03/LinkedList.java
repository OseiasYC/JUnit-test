package br.ucsal._20202.testequalidade.aula03;


import br.ucsal._20202.testequalidade.aula03.exception.InvalidElementException;
import br.ucsal._20202.testequalidade.aula03.interfaces.List;

// Este código pode conter defeitos. Seu objetivo é ilustrar falhas a serem
// reveladas por testes automatizados.
public class LinkedList<T> implements List<T> {

	protected Node start;

	private int size = 0;

	@Override
	public void add(T element) throws InvalidElementException {
		if (element == null) {
			throw new RuntimeException("The element can't be null.");
		}
		Node newNode = new Node(element);
		if (start == null) {
			start = newNode;
		} else {
			Node aux = start;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = newNode;
		}
		size++;
	}

	@Override
	public T get(int index) {
		Node aux = start;
		int i = 0;
		while (aux != null && i < index) {
			aux = aux.prox;
			i++;
		}
		if (aux == null) {
			return null;
		}
		return aux.element;
	}

	public int size() {
		return size;
	}

	@Override
	public void clear() {
		start = null;
		size = 0;
	}

	protected class Node {
		protected T element;
		protected Node prox;

		private Node(T element) {
			this.element = element;
		}
	}

}
