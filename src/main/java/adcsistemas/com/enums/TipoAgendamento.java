package adcsistemas.com.enums;

public enum TipoAgendamento {
	
	CONSULTA("Consulta"),
	RETORNO("Retorno");
	
	
	private String descricao;
	
	private TipoAgendamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
