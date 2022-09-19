package br.ucsal._20202.testequalidade.aula03.exception;

public class InvalidElementException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidElementException() {
	}

	public InvalidElementException(String message) {
		super(message);
	}

}
