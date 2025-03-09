package com.esig.gerenciamento.service;

import com.esig.gerenciamento.model.Tarefa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarefaServiceTest {

    @Test
    public void testCriarTarefa() {
        TarefaService tarefaService = new TarefaService();
        Tarefa tarefa = tarefaService.criarTarefa("Nova Tarefa", "Descrição da Tarefa");

        assertNotNull(tarefa);
        assertEquals("Nova Tarefa", tarefa.getTitulo());
        assertEquals("Descrição da Tarefa", tarefa.getDescricao());
    }
}