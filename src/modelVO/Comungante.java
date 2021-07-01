package modelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Comungante extends Usuario {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Variáveis
	private int numOrdem;
	private Calendar dataBatismo;
	private String pastorBatismo;
	private String igrejaBatismo;
	private Calendar dataProfFe;
	private String pastorProfFe;
	private String igrejaProfFe;
	private Calendar dataAdmissao;
	private int meioAdmissao;
	private boolean situacao;
	private Usuario usuario;
	
	
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public int getNumOrdem() {
		return numOrdem;
	}
	public void setNumOrdem(int numOrdem) {
		this.numOrdem = numOrdem;
	}
	public Calendar getDataBatismo() {
		return dataBatismo;
	}
	public void setDataBatismo(Calendar dataBatismo) {
		this.dataBatismo = dataBatismo;
	}
	public String getPastorBatismo() {
		return pastorBatismo;
	}
	public void setPastorBatismo(String pastorBatismo) {
		this.pastorBatismo = pastorBatismo;
	}
	public String getIgrejaBatismo() {
		return igrejaBatismo;
	}
	public void setIgrejaBatismo(String igrejaBatismo) {
		this.igrejaBatismo = igrejaBatismo;
	}
	public Calendar getDataProfFe() {
		return dataProfFe;
	}
	public void setDataProfFe(Calendar dataProfFe) {
		this.dataProfFe = dataProfFe;
	}
	public String getPastorProfFe() {
		return pastorProfFe;
	}
	public void setPastorProfFe(String pastorProfFe) {
		this.pastorProfFe = pastorProfFe;
	}
	public String getIgrejaProfFe() {
		return igrejaProfFe;
	}
	public void setIgrejaProfFe(String igrejaProfFe) {
		this.igrejaProfFe = igrejaProfFe;
	}
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public int getMeioAdmissao() {
		return meioAdmissao;
	}
	public void setMeioAdmissao(int meioAdmissao) {
		this.meioAdmissao = meioAdmissao;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numOrdem;
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
		Comungante other = (Comungante) obj;
		if (numOrdem != other.numOrdem)
			return false;
		return true;
	}
	
	
	public Comungante() {}
	public Comungante(long idUsuario, String nome) {
		super(idUsuario, nome);
		// TODO Auto-generated constructor stub
	}
	public Comungante(int numOrdem, Usuario usuario) {
		super();
		this.numOrdem = numOrdem;
		this.usuario = usuario;
	}
	
	
	@Override
	public String toString() {
		return "Comungante [sdf=" + sdf + ", numOrdem=" + numOrdem + ", dataBatismo=" + dataBatismo + ", pastorBatismo="
				+ pastorBatismo + ", igrejaBatismo=" + igrejaBatismo + ", dataProfFe=" + dataProfFe + ", pastorProfFe="
				+ pastorProfFe + ", igrejaProfFe=" + igrejaProfFe + ", dataAdmissao=" + dataAdmissao + ", meioAdmissao="
				+ meioAdmissao + ", situacao=" + situacao + ", usuario=" + usuario + "]";
	}
	
	
	

}
