package modelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Usuario {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Variáveis
	private long idUsuario;
	private String nome;
	private Calendar dataNascimento;
	private Endereco endereco;
	private String naturalidade;
	private boolean valido;
	private String email;
	private String senha;
	private String observacao;
	
	
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idUsuario ^ (idUsuario >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Usuario other = (Usuario) obj;
		if (idUsuario != other.idUsuario)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	public Usuario() {}
	public Usuario(long idUsuario, String nome) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [sdf=" + sdf + ", idUsuario=" + idUsuario + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", endereco=" + endereco + ", naturalidade=" + naturalidade + ", valido=" + valido
				+ ", email=" + email + ", senha=" + senha + ", observacao=" + observacao + "]";
	}
	
}
