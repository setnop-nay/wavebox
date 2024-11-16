package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.AssinaturaEntity;
import repository.AssinaturaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/assinaturas")
public class AssinaturaController {

    @Autowired
    private AssinaturaRepository assinaturaRepository;

    @PostMapping
    public AssinaturaEntity createAssinatura(@RequestBody AssinaturaEntity assinatura) {
        return assinaturaRepository.save(assinatura);
    }

    @GetMapping("/{id}")
    public AssinaturaEntity getAssinatura(@PathVariable Long id) {
        return assinaturaRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<AssinaturaEntity> getAllAssinaturas() {
        return assinaturaRepository.findAll();
    }
    }
