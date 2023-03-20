package com.algaworks.algalog.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class Problemas {

	private Integer status;
	private LocalDateTime dataHora;
	private String Titulo;
	private List<Campo> campo;
	
	@Getter
	@AllArgsConstructor
	public static class Campo{
		
		private String nome;
		private String mensagem;
		
	}
}