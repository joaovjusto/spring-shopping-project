package up.edu.br.shoppingup.contasapagar.commom.exception;

public enum BusinessExceptionCode {

	ERR001("Não possível cadastar a conta"),
	ERR002("A data de vencimento expirou");
	
	private final String message;

	BusinessExceptionCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
