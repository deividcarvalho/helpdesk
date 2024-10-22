package br.com.deivid.helpdesk.domain.enums;

public enum Prioridade {

	BAIXA(0, "BAIXA"), 
	MEDIA(1,"MEDIA"), 
	ALTA(2, "ALTA");
	
	private int cod;
	private String descricao;
		
	private Prioridade(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public Prioridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código inválido! "+cod);
		
	}


}
