package adcsitemas.com.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import adcsitemas.com.enums.Sexo;

@Entity
@Table(name = "pessoa_funcionario")
@PrimaryKeyJoinColumn(name = "id")
public class Pessoa_Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String cpf;
	
	private String funcao;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@ManyToOne(targetEntity = Pessoa.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "esf_empresa")
	private Pessoa_Esf_Empresa esf_Empresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Pessoa_Esf_Empresa getEsf_Empresa() {
		return esf_Empresa;
	}

	public void setEsf_Empresa(Pessoa_Esf_Empresa esf_Empresa) {
		this.esf_Empresa = esf_Empresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa_Funcionario other = (Pessoa_Funcionario) obj;
		return Objects.equals(id, other.id);
	}

}
