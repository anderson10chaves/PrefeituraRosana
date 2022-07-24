package adcsistemas.com.model;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import adcsistemas.com.enums.Sexo;

@Entity
@Table(name = "pessoa_funcionario")
@PrimaryKeyJoinColumn(name = "id")
public class Pessoa_Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private String cpf;
	
	private String funcao;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@ManyToOne()
	@JoinColumn(name = "esf_empresa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "esf_empresa_fk"))
	private Esf_Empresa esf_Empresa;
	

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

	public Esf_Empresa getEsf_Empresa() {
		return esf_Empresa;
	}

	public void setEsf_Empresa(Esf_Empresa esf_Empresa) {
		this.esf_Empresa = esf_Empresa;
	}

	

}
