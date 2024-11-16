package entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UsuarioPermissaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermissao;
    private Long idUsuario; // Referência ao Usuario
    
 // Getters e Setters
    
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
    
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario; // Referência ao Usuario

    @ManyToOne
    @JoinColumn(name = "idPermissao")
    private PermissaoEntity permissao; // Referência à Permissao

	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

   
}
