package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.BoxProdutoEntity;
import repository.BoxProdutoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/boxProdutos")
public class BoxProdutoController {

    @Autowired
    private BoxProdutoRepository boxProdutoRepository;

    @PostMapping
    public BoxProdutoEntity createBoxProduto(@RequestBody BoxProdutoEntity boxProduto) {
        return boxProdutoRepository.save(boxProduto);
    }

    @GetMapping("/{id}")
    public BoxProdutoEntity getBoxProduto(@PathVariable Long id) {
        return boxProdutoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<BoxProdutoEntity> getAllBoxProdutos() {
        return boxProdutoRepository.findAll();
    }

    @PutMapping("/{id}")
    public BoxProdutoEntity updateBoxProduto(@PathVariable Long id, @RequestBody BoxProdutoEntity boxProduto) {
        boxProduto.setIdBox(id);
        return boxProdutoRepository.save(boxProduto);
    }

    @DeleteMapping("/{id}")
    public void deleteBoxProduto(@PathVariable Long id) {
        boxProdutoRepository.deleteById(id);
    }
}
