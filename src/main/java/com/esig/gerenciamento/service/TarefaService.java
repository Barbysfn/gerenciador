package com.esig.gerenciamento.service;

import com.esig.gerenciamento.dao.TarefaDAO;
import com.esig.gerenciamento.model.Tarefa;
import java.util.List;

public class TarefaService {

    private TarefaDAO dao = new TarefaDAO();

    public void salvar(Tarefa tarefa) {
        dao.salvar(tarefa);
    }

    public void atualizar(Tarefa tarefa) {
        dao.atualizar(tarefa);
    }

    public void remover(Long id) {
        dao.remover(id);
    }

    public List<Tarefa> listar() {
        return dao.listar();
    }

    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        return tarefa;
    }
}