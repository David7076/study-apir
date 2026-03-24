package br.com.fiap.study_apir.controller.produtos;

import br.com.fiap.study_apir.model.Produto;
import br.com.fiap.study_apir.repository.RepositoryProdutoMockup;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/${api.version}/produtos.")
public class ProdutoController {

    final private RepositoryProdutoMockup mockup = new RepositoryProdutoMockup();

    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(mockup.findById(id));
    }

    @PutMapping
    public ResponseEntity<String> update() {
        return ResponseEntity.ok("Produto atualizado");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity.noContent().build();
    }

}
