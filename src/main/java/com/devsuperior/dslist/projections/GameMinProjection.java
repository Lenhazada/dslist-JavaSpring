package com.devsuperior.dslist.projections;

/**
 * Projection utilizada para retornar apenas os dados essenciais do jogo.
 *
 * É usada para otimizar consultas ao banco de dados,
 * evitando carregar todas as informações da entidade Game
 * quando apenas um subconjunto de campos é necessário.
 */

public interface GameMinProjection {
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
