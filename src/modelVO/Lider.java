package modelVO;

	import java.text.SimpleDateFormat;
	import java.util.Calendar;

	public class Lider extends Comungante {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Variáveis
		private Calendar dataPriEleicao;
		private Calendar dataUltEleicao;
		private String cargoOficio;
		private String entidade;
		private Comungante comungante;
		public SimpleDateFormat getSdf() {
			return sdf;
		}
		public void setSdf(SimpleDateFormat sdf) {
			this.sdf = sdf;
		}
		public Calendar getDataPriEleicao() {
			return dataPriEleicao;
		}
		public void setDataPriEleicao(Calendar dataPriEleicao) {
			this.dataPriEleicao = dataPriEleicao;
		}
		public Calendar getDataUltEleicao() {
			return dataUltEleicao;
		}
		public void setDataUltEleicao(Calendar dataUltEleicao) {
			this.dataUltEleicao = dataUltEleicao;
		}
		public String getCargoOficio() {
			return cargoOficio;
		}
		public void setCargoOficio(String cargoOficio) {
			this.cargoOficio = cargoOficio;
		}
		public String getEntidade() {
			return entidade;
		}
		public void setEntidade(String entidade) {
			this.entidade = entidade;
		}
		public Comungante getComungante() {
			return comungante;
		}
		public void setComungante(Comungante comungante) {
			this.comungante = comungante;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((comungante == null) ? 0 : comungante.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Lider other = (Lider) obj;
			if (comungante == null) {
				if (other.comungante != null)
					return false;
			} else if (!comungante.equals(other.comungante))
				return false;
			return true;
		}
		public Lider() {}
		public Lider(int numOrdem, Usuario usuario) {
			super(numOrdem, usuario);
		}
		public Lider(long idUsuario, String nome) {
			super(idUsuario, nome);
		}
		public Lider(String cargoOficio, String entidade, Comungante comungante) {
			super();
			this.cargoOficio = cargoOficio;
			this.entidade = entidade;
			this.comungante = comungante;
		}
		
		
}
