package modelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Visitante extends Usuario {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Variáveis
	private Calendar dataVisita;
	private boolean situacao;
	private Usuario usuario;
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public Calendar getDataVisita() {
		return dataVisita;
	}
	public void setDataVisita(Calendar dataVisita) {
		this.dataVisita = dataVisita;
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
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Visitante other = (Visitante) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	public Visitante() {}
	public Visitante(long idUsuario, String nome) {
		super(idUsuario, nome);
	}
	public Visitante(Calendar dataVisita, Usuario usuario) {
		super();
		this.dataVisita = dataVisita;
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Visitante [sdf=" + sdf + ", dataVisita=" + dataVisita + ", situacao=" + situacao + ", usuario="
				+ usuario + "]";
	}

}
