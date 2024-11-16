package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.BoxProdutoEntity;

public interface BoxProdutoRepository extends JpaRepository<BoxProdutoEntity, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
}
