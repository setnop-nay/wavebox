package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.AssinaturaEntity;

public interface AssinaturaRepository extends JpaRepository<AssinaturaEntity, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
}