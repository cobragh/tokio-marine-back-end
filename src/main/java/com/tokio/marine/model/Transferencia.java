package com.tokio.marine.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Transferencia implements Serializable {

	private static final long serialVersionUID = 5502401917657330677L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/Sao_Paulo")
	protected LocalDate dataAtualizacao;

	@Column(length = 6)
	private String contaOrigem;

	@Column(length = 6)
	private String contaDestino;

	private double valor;

	private double taxa;

	private String tipoOperacao;

	private LocalDate dataTransferencia;

	private LocalDate dataAgendamento;

	private String agendamentoFormatado;

	private String transferenciaFormatado;

}
