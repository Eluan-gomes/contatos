package br.com.senai.contatos.domains;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String nomeCompleto;
    private LocalDate dataNascimento;
}
