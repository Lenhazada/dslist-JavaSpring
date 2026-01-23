package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

/**
 * DTO utilizado para transferir os dados de uma lista de jogos.
 *
 * Representa a entidade GameList de forma segura,
 * sem expor diretamente o modelo de domínio.
 */
public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
		// Construtor padrão
	}

	// Construtor com argumentos
	public GameListDTO(GameList entity ) {
		id = entity.getId();
		name = entity.getName();
	}

	/* ----------------------
       Getters e Setters
       ---------------------- */
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
