package com.esig.gerenciamento.view;

import com.esig.gerenciamento.model.Tarefa;
import com.esig.gerenciamento.service.TarefaService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;
import java.util.List;

@ManagedBean
@ViewScoped
public class TarefaMB {

    private TarefaService service = new TarefaService();
    private Tarefa tarefa = new Tarefa();
    private List<Tarefa> tarefas;
    private String filtroTitulo;
    private String filtroResponsavel;
    private boolean mostrarLista = false;

    @PostConstruct
    public void init() {
        tarefas = service.listar();
    }

    public void mostrarLista() {
        this.mostrarLista = true;
    }

    public void mostrarCadastro() {
        this.mostrarLista = false;
    }

    public void salvar() {
        if (tarefa.getId() == null) {
            service.salvar(tarefa);
        } else {
            service.atualizar(tarefa);
        }
        tarefa = new Tarefa();
        tarefas = service.listar();
    }

    public void editar(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public void remover(Long id) {
        service.remover(id);
        tarefas = service.listar();
    }

    public void concluir(Long id) {
        Tarefa tarefa = service.listar().stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (tarefa != null) {
            tarefa.setSituacao("Concluída");
            service.atualizar(tarefa);
            tarefas = service.listar();
        }
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public String getFiltroTitulo() {
        return filtroTitulo;
    }

    public void setFiltroTitulo(String filtroTitulo) {
        this.filtroTitulo = filtroTitulo;
    }

    public String getFiltroResponsavel() {
        return filtroResponsavel;
    }

    public void setFiltroResponsavel(String filtroResponsavel) {
        this.filtroResponsavel = filtroResponsavel;
    }

    public boolean isMostrarLista() {
        return mostrarLista;
    }

    public void setMostrarLista(boolean mostrarLista) {
        this.mostrarLista = mostrarLista;
    }
}
