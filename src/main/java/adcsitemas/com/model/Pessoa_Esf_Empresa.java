package adcsitemas.com.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa_esf_empresa")
@PrimaryKeyJoinColumn(name = "id")
public class Pessoa_Esf_Empresa extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date agendaEsf;
	
	@ManyToOne(targetEntity = Pessoa.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "esf_empresa")
	private Pessoa pessoa_esf_empresa;

}
