package br.com.fiap.study_apir.repository;

import br.com.fiap.study_apir.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class RepositoryProdutoMockup {

    final private static List<Produto> produtos = new ArrayList<>();

    public RepositoryProdutoMockup() {
        produtos.add(new Produto(1L, "Calça"));
        produtos.add(new Produto(30L, "Celular"));
    }


    public List<Produto> findAll() {
        return produtos;
    }

    public Produto findById(Long id) {
        for(Produto p : produtos) {
            if(p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
