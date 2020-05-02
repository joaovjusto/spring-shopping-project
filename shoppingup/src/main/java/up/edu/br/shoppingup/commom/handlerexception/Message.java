package up.edu.br.shoppingup.commom.handlerexception;

public class Message {

	private String mensagem;
	private String codigo;	

	public Message(String mensagem, String codigo) {
		super();
		this.mensagem = mensagem;
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
