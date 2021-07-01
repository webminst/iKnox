package modelVO;

	public class Igreja {

		// Variáveis
		private long idIgreja;
		private String nomeIgreja;
		private String cnpjIgreja;
		private Lider oficialPastorIgreja;
		private Endereco endereco;
		private String observacaoIgreja;
		
		
		public long getIdIgreja() {
			return idIgreja;
		}
		public void setIdIgreja(long idIgreja) {
			this.idIgreja = idIgreja;
		}
		public String getNomeIgreja() {
			return nomeIgreja;
		}
		public void setNomeIgreja(String nomeIgreja) {
			this.nomeIgreja = nomeIgreja;
		}
		public String getCnpjIgreja() {
			return cnpjIgreja;
		}
		public void setCnpjIgreja(String cnpjIgreja) {
			this.cnpjIgreja = cnpjIgreja;
		}
		public Lider getOficialPastorIgreja() {
			return oficialPastorIgreja;
		}
		public void setOficialPastorIgreja(Lider oficialPastorIgreja) {
			this.oficialPastorIgreja = oficialPastorIgreja;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		public String getObservacaoIgreja() {
			return observacaoIgreja;
		}
		public void setObservacaoIgreja(String observacaoIgreja) {
			this.observacaoIgreja = observacaoIgreja;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (idIgreja ^ (idIgreja >>> 32));
			result = prime * result + ((nomeIgreja == null) ? 0 : nomeIgreja.hashCode());
			return result;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Igreja other = (Igreja) obj;
			if (idIgreja != other.idIgreja)
				return false;
			if (nomeIgreja == null) {
				if (other.nomeIgreja != null)
					return false;
			} else if (!nomeIgreja.equals(other.nomeIgreja))
				return false;
			return true;
		}
		
		
		public Igreja() {}
		public Igreja(long idIgreja, String nomeIgreja) {
			super();
			this.idIgreja = idIgreja;
			this.nomeIgreja = nomeIgreja;
		}
		
		
		@Override
		public String toString() {
			return "Igreja [idIgreja=" + idIgreja + ", nomeIgreja=" + nomeIgreja + ", cnpjIgreja=" + cnpjIgreja
					+ ", oficialPastorIgreja=" + oficialPastorIgreja + ", endereco=" + endereco + ", observacaoIgreja="
					+ observacaoIgreja + "]";
		}
		
}
