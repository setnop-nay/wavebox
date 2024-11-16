package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.UsuarioPermissaoEntity;

public interface UsuarioPermissaoRepository extends JpaRepository<UsuarioPermissaoEntity, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
}