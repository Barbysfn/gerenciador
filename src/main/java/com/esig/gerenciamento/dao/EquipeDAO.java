package com.esig.gerenciamento.dao;

import com.esig.gerenciamento.model.Equipe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EquipeDAO {

    // Configuração da unidade de persistência
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gerenciadorTarefasPU");

    // Método para listar todos os membros da equipe
    public List<Equipe> listar() {
        EntityManager em = emf.createEntityManager();
        List<Equipe> equipe;
        try {
            equipe = em.createQuery("FROM Equipe", Equipe.class).getResultList(); // Consulta todos os registros da tabela equipe
        } finally {
            em.close();
        }
        return equipe;
    }

    // Método para salvar um membro da equipe
    public void salvar(Equipe equipe) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(equipe); // Salva o objeto no banco de dados
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Método para atualizar um membro da equipe
    public void atualizar(Equipe equipe) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(equipe); // Atualiza o objeto no banco de dados
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Método para remover um membro da equipe pelo ID
    public void remover(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Equipe equipe = em.find(Equipe.class, id);
            if (equipe != null) {
                em.getTransaction().begin();
                em.remove(equipe); // Remove o objeto do banco de dados
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }

    // Método para buscar um membro pelo ID
    public Equipe buscarPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Equipe.class, id); // Busca o objeto pelo ID
        } finally {
            em.close();
        }
    }
}
