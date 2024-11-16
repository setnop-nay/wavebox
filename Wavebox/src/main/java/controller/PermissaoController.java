package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.PermissaoEntity;
import repository.PermissaoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/permissoes")
public class PermissaoController {

    @Autowired
    private PermissaoRepository permissaoRepository;

    @PostMapping
    public PermissaoEntity createPermissao(@RequestBody PermissaoEntity permissao) {
        return permissaoRepository.save(permissao);
    }

    @GetMapping("/{id}")
    public PermissaoEntity getPermissao(@PathVariable Long id) {
        return permissaoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<PermissaoEntity> getAllPermissoes() {
        return permissaoRepository.findAll();
    }

    @PutMapping("/{id}")
    public PermissaoEntity updatePermissao(@PathVariable Long id, @RequestBody PermissaoEntity permissao) {
        permissao.setId(id); // Certifique-se de que o ID está sendo atualizado corretamente
        return permissaoRepository.save(permissao);
    }

    @DeleteMapping("/{id}")
    public void deletePermissao(@PathVariable Long id) {
        permissaoRepository.deleteById(id);
    }
}