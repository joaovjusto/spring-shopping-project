package up.edu.br.shoppingup.contasapagar.entity.enums;

public enum TipoSolicitante {

	PESSOAFISICA(1, "Pessoa Física"), 
	PESSOAJURIDICA(2, "Pessoa Jurídica");

	private int cod;
	private String descricao;

	private TipoSolicitante(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoSolicitante toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoSolicitante x : TipoSolicitante.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
