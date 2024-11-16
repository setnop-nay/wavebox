package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.UsuarioPermissaoEntity;
import repository.UsuarioPermissaoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/usuarioPermissoes")
public class UsuarioPermissaoController {

    @Autowired
    private UsuarioPermissaoRepository usuarioPermissaoRepository;

    @PostMapping
    public UsuarioPermissaoEntity createUsuarioPermissao(@RequestBody UsuarioPermissaoEntity usuarioPermissao) {
        return usuarioPermissaoRepository.save(usuarioPermissao);
    }

    @GetMapping("/{id}")
    public UsuarioPermissaoEntity getUsuarioPermissao(@PathVariable Long id) {
        return usuarioPermissaoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<UsuarioPermissaoEntity> getAllUsuarioPermissoes() {
        return usuarioPermissaoRepository.findAll();
    }

    @PutMapping("/{id}")
    public UsuarioPermissaoEntity updateUsuarioPermissao(@PathVariable Long id, @RequestBody UsuarioPermissaoEntity usuarioPermissao) {
        usuarioPermissao.setId(id);
        return usuarioPermissaoRepository.save(usuarioPermissao);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuarioPermissao(@PathVariable Long id) {
        usuarioPermissaoRepository.deleteById(id);
    }
}