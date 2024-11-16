package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
}