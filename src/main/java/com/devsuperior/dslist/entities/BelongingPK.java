package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Classe que representa a chave primária composta
 * da entidade Belonging.
 *
 * Essa chave é formada pela combinação
 * de um Game e uma GameList.
 *
 * A existência dessa classe é necessária para
 * mapear corretamente o relacionamento muitos-para-muitos
 * com atributos adicionais usando JPA.
 */
@Embeddable
public class BelongingPK{
	
	/**
     * Jogo associado à lista.
     * Parte da chave composta.
     */
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;

	/**
     * Lista à qual o jogo pertence.
     * Parte da chave composta.
     */
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;

	public BelongingPK() {
		// Construtor padrão
	}

	// Construtor com parâmetros
	public BelongingPK(Game game, GameList list) {
		this.game = game;
		this.list = list;
	}
 
	/* ----------------------
       Getters e Setters
       ---------------------- */
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	/* ----------------------
       Getters e Setters
       ---------------------- */

	/**
     * Igualdade baseada nos dois campos da chave composta.
     * Isso garante que um jogo não seja duplicado
     * na mesma lista.
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

}
