package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.BoxProdutoEntity;
import entity.EnvioEntity;

public interface EnvioRepository extends JpaRepository<EnvioEntity, Long> {
    List<EnvioEntity> findByBoxProduto(BoxProdutoEntity boxProduto);
}