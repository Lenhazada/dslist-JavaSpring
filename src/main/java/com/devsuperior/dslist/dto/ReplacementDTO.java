package com.devsuperior.dslist.dto;

/**
 * DTO utilizado para receber os dados necessários
 * para a operação de reordenação de jogos em uma lista.
 *
 * Encapsula as posições de origem e destino.
 */
public class ReplacementDTO {
	
	private Integer sourceIndex;
	private Integer destinationIndex;
	
	public Integer getSourceIndex() {
		return sourceIndex;
	}
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	public Integer getDestinationIndex() {
		return destinationIndex;
	}
	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
	
	
	
}
