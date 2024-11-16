package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class PermissaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermissao;
    private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    // Getters e Setters
	@OneToMany(mappedBy = "permissao")
    private List<UsuarioPermissaoEntity> usuarios;
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}
