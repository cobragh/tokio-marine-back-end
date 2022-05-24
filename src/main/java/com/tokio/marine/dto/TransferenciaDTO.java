package com.tokio.marine.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
public class TransferenciaDTO{
	protected Long id;

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
