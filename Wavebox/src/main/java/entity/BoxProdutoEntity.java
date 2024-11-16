package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BoxProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBox;
    private int quantidadeItens;
    private String descricao;
    private String genero; // Pode ser "masculino", "feminino" ou "unissex"
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

    // Getters e Setters
	@OneToMany(mappedBy = "boxProduto")
    private List<EnvioEntity> envios; // Lista de envios relacionados a este BoxProduto
	public void setIdBox(Long idBox2) {
		// TODO Auto-generated method stub
		
	}

}
