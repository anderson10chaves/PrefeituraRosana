package adcsitemas.com.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import adcsitemas.com.enums.Sexo;

@Entity
@Table(name = "pessoa_paciente")
@PrimaryKeyJoinColumn(name = "id")
public class Pessoa_Paciente extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	private Date data_nascimento;
	
	private String sus;
	
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

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSus() {
		return sus;
	}

	public void setSus(String sus) {
		this.sus = sus;
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
