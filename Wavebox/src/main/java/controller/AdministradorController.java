package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.AdministradorEntity;
import repository.AdministradorRepository;

import java.util.List;

@RestController
@RequestMapping("/api/administradores")
public class AdministradorController {

    @Autowired
    private AdministradorRepository administradorRepository;

    @PostMapping
    public AdministradorEntity createAdministrador(@RequestBody AdministradorEntity administrador) {
        return administradorRepository.save(administrador);
    }

    @GetMapping("/{id}")
    public AdministradorEntity getAdministrador(@PathVariable Long id) {
        return administradorRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<AdministradorEntity> getAllAdministradores() {
        return administradorRepository.findAll();
    }

    @PutMapping("/{id}")
    public AdministradorEntity updateAdministrador(@PathVariable Long id, @RequestBody AdministradorEntity administrador) {
        administrador.setIdAdministrador(id);
        return administradorRepository.save(administrador);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrador(@PathVariable Long id) {
        administradorRepository.deleteById(id);
    }
}
