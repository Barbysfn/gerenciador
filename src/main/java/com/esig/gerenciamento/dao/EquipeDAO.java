package com.esig.gerenciamento.dao;

import com.esig.gerenciamento.model.Equipe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EquipeDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gerenciadorTarefasPU");

    public List<Equipe> listar() {
        EntityManager em = emf.createEntityManager();
        List<Equipe> equipe;
        try {
            equipe = em.createQuery("FROM Equipe", Equipe.class).getResultList();
        } finally {
            em.close();
        }
        return equipe;
    }

    public void salvar(Equipe equipe) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(equipe);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void atualizar(Equipe equipe) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(equipe);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void remover(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Equipe equipe = em.find(Equipe.class, id);
            if (equipe != null) {
                em.getTransaction().begin();
                em.remove(equipe);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }

    public Equipe buscarPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Equipe.class, id);
        } finally {
            em.close();
        }
    }
}
