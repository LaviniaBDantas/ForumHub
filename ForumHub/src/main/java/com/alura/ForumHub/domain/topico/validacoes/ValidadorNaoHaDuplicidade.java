package com.alura.ForumHub.domain.topico.validacoes;

import com.alura.ForumHub.domain.ValidacaoException;
import com.alura.ForumHub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorNaoHaDuplicidade {
    private final TopicoRepository topicoRepository;

    @Autowired
    public ValidadorNaoHaDuplicidade(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public void validarDuplicidade(String titulo, String mensagem) {
        if (topicoRepository.existsByTituloAndMensagem(titulo, mensagem)) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem.");
        }
    }
}
