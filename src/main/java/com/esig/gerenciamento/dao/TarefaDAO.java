package com.esig.gerenciamento.dao;

import com.esig.gerenciamento.model.Tarefa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TarefaDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gerenciadorTarefasPU");

    public void salvar(Tarefa tarefa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(tarefa);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Tarefa tarefa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(tarefa);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(Long id) {
        EntityManager em = emf.createEntityManager();
        Tarefa tarefa = em.find(Tarefa.class, id);
        if (tarefa != null) {
            em.getTransaction().begin();
            em.remove(tarefa);
            em.getTransaction().commit();
        }
        em.close();
    }

    public List<Tarefa> listar() {
        EntityManager em = emf.createEntityManager();
        List<Tarefa> tarefas = em.createQuery("from Tarefa", Tarefa.class).getResultList();
        em.close();
        return tarefas;
    }
}