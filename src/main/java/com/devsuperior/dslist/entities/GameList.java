package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade que representa uma lista de jogos.
 *
 * Uma GameList agrupa vários jogos e define a ordem em que
 * eles aparecem dentro da lista.
 *
 * O relacionamento com Game é feito de forma indireta,
 * por meio da entidade Belonging, permitindo controlar
 * a ordem de cada jogo na lista.
 */
@Entity
@Table(name = "tb_game_list")
public class GameList {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public GameList() {
		// Construtor padrão
	}

	public GameList(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	/* ----------------------
       Getters e Setters
       ---------------------- */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* ----------------------
       Equals e HashCode
       ---------------------- */

	/**
	 * Igualdade baseada apenas no ID,
	 * garantindo consistência no contexto de persistência.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameList other = (GameList) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
