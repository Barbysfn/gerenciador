package com.esig.gerenciamento.service;

import com.esig.gerenciamento.dao.EquipeDAO;
import com.esig.gerenciamento.model.Equipe;
import java.util.List;

public class EquipeService {
    private EquipeDAO dao = new EquipeDAO();

    public List<Equipe> listar() {
        return dao.listar();
    }
}
