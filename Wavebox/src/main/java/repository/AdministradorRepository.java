package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import entity.AdministradorEntity;

public interface AdministradorRepository extends JpaRepository<AdministradorEntity, Long> {
    AdministradorEntity findByname(String nome);
}