package br.com.fiap.study_apir.controller.produtos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/${api.version}/produtos.")
public class ProdutoController {


    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado");
    }

    @GetMapping
    public String findById() {
        return "Maça";

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
