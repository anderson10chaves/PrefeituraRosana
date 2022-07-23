package adcsitemas.com.model;

import java.util.Date;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa_medico")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaMedico extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private String crm;
	
	private String hora_atendimento;
	
	@Temporal(TemporalType.DATE)
	private Date diasSemanaAendimento;

	@ManyToOne()
	@JoinColumn(name = "esf_empresa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "esf_empresa_fk"))
	private Esf_Empresa esf_Empresa;
	
	@ManyToOne()
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getHora_atendimento() {
		return hora_atendimento;
	}

	public void setHora_atendimento(String hora_atendimento) {
		this.hora_atendimento = hora_atendimento;
	}

	public Date getDiasSemanaAendimento() {
		return diasSemanaAendimento;
	}

	public void setDiasSemanaAendimento(Date diasSemanaAendimento) {
		this.diasSemanaAendimento = diasSemanaAendimento;
	}

	public Esf_Empresa getEsf_Empresa() {
		return esf_Empresa;
	}

	public void setEsf_Empresa(Esf_Empresa esf_Empresa) {
		this.esf_Empresa = esf_Empresa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
