package com.alura.ForumHub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name="topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String status;
    private String autor;
    private String curso;
    @ElementCollection
    private List<String> respostas;


    public Topico(DadosCadastrotopico dados, String usuarioLogado) {
        this.titulo= dados.titulo();
        this.mensagem= dados.mensagem();
        this.dataCriacao=LocalDateTime.now();
        this.status="NAO_RESPONDIDO";
        this.autor=usuarioLogado;
        this.curso= dados.curso();
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {
        if(dados.titulo()!=null){
            this.titulo=dados.titulo();
        }
        if (dados.mensagem()!=null){
            this.mensagem=dados.mensagem();
        }
    }
}
