package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Entidade associativa que representa o relacionamento
 * entre Game e GameList.
 *
 * Essa classe existe para resolver o relacionamento
 * muitos-para-muitos entre jogos e listas, permitindo
 * armazenar informações adicionais sobre esse vínculo,
 * como a posição (ordem) do jogo dentro da lista.
 *
 * Cada registro indica que um jogo pertence a uma lista
 * específica em uma determinada posição.
 */
@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
    /**
     * Chave composta que identifica unicamente
     * o relacionamento entre Game e GameList.
     */
	@EmbeddedId
	private BelongingPK id = new BelongingPK();

	/**
     * Define a posição do jogo dentro da lista.
     * Esse campo é usado para ordenação dos jogos
     * quando uma lista é exibida.
     */
	private Integer position;
	
	public Belonging() {	
		// Construtor padrão
	}

	/**
     * Associa um jogo a uma lista específica.
     * Esse método facilita a criação do relacionamento
     * sem expor diretamente a chave composta.
     */
	public Belonging(Game game, GameList list, Integer position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	/* ----------------------
       Getters e Setters
       ---------------------- */
	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	/* ----------------------
       Equals e HashCode
       ---------------------- */
	   
	/**
     * Igualdade baseada na chave composta,
     * garantindo que o vínculo entre jogo e lista
     * seja único no banco de dados.
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}
