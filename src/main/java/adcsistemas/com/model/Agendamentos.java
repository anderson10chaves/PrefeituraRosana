package adcsistemas.com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import adcsistemas.com.enums.TipoAgendamento;

@Entity
@Table(name = "agenda")
@SequenceGenerator(name = "seq_agenda", sequenceName = "seq_agenda", allocationSize = 1, initialValue = 1)
public class Agendamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_agenda")
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date dataAgenda;
	
	@Enumerated(EnumType.STRING)
	private TipoAgendamento tipoAgendamento;

	
	@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<PessoaMedico> pessoaMedicos = new ArrayList<PessoaMedico>();
	
	@ManyToOne(targetEntity = PessoaMedico.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private PessoaMedico pessoaMedico;
	
	@ManyToOne()
	@JoinColumn(name = "esf_empresa", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "esf_empresa_fk"))
	private Esf_Empresa esf_Empresa;
	
	private Boolean ativo = Boolean.TRUE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataAgenda() {
		return dataAgenda;
	}

	public void setDataAgenda(Date dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	public TipoAgendamento getTipoAgendamento() {
		return tipoAgendamento;
	}

	public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	public List<PessoaMedico> getPessoaMedicos() {
		return pessoaMedicos;
	}

	public void setPessoaMedicos(List<PessoaMedico> pessoaMedicos) {
		this.pessoaMedicos = pessoaMedicos;
	}

	public Esf_Empresa getEsf_Empresa() {
		return esf_Empresa;
	}

	public void setEsf_Empresa(Esf_Empresa esf_Empresa) {
		this.esf_Empresa = esf_Empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamentos other = (Agendamentos) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
