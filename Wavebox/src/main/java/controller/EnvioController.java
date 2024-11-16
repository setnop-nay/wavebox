package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.BoxProdutoEntity;
import entity.EnvioEntity;
import repository.EnvioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/envios")
public class EnvioController {

    @Autowired
    private EnvioRepository envioRepository;

    @PostMapping
    public EnvioEntity createEnvio(@RequestBody EnvioEntity envio) {
        return envioRepository.save(envio);
    }

    @GetMapping("/{id}")
    public EnvioEntity getEnvio(@PathVariable Long id) {
        return envioRepository.findById(id).orElse(null);
    }

    @GetMapping("/box/{idBox}")
    public List<EnvioEntity> getEnviosByBox(@PathVariable Long idBox) {
        BoxProdutoEntity boxProduto = new BoxProdutoEntity();
        boxProduto.setIdBox(idBox);
        return envioRepository.findByBoxProduto(boxProduto);
    }

    // Outros métodos (atualizar, deletar, etc.)
}