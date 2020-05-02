package up.edu.br.shoppingup.commom.exception;

public enum BusinessExceptionCode {
	
	ERR001("Não é possível cadastrar um veiculo com o ano menor que 1980"),
	ERR002("A quilometragem do veículo não pode ultrapassar 200.000 km"),
	ERR003(""),
	ERR600 ("É obrigatório fornecer um nome para cadastro"),
	ERR601 ("É obrigatório fornecer um telefone para cadastro"),
		
	ERR700("É obrigatório fornecer numero da Nota Fiscal"),
	ERR701("É obrigatório fornecer numero da Requisição de Compra"),
	ERR702("Valor Total da Nota Fiscal tem de ser maior que R$0,00"),
	ERR703("Quantidade tem que ser maior que Zero");
	
	
	private final String message;

	private BusinessExceptionCode(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
