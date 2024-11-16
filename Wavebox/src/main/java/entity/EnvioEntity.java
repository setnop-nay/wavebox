package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
	public class EnvioEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idEnvio;
	    private String dataHora; // Pode ser um formato de data e hora
	    private String destino; // Endereço do usuário
		public String getDataHora() {
			return dataHora;
		}
		public void setDataHora(String dataHora) {
			this.dataHora = dataHora;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}

	    // Getters e Setters
		
		@ManyToOne
	    @JoinColumn(name = "idBox", referencedColumnName = "idBox")
	    private BoxProdutoEntity boxProduto; // Referência ao BoxProduto
	}

