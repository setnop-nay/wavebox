package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AssinaturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssinatura;
    private String dataInicio;
    private String dataFim;
    private double valor;
    private Long idBox; // Referência ao BoxProduto
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Long getIdBox() {
		return idBox;
	}
	public void setIdBox(Long idBox) {
		this.idBox = idBox;
	}

    // Getters e Setters
	
	 @ManyToOne
	    @JoinColumn(name = "idBox")
	    private BoxProdutoEntity boxProduto; // Referência ao BoxProduto

	    @ManyToOne
	    @JoinColumn(name = "idEnvio")
	    private EnvioEntity envio; // Referência ao Envio
}
