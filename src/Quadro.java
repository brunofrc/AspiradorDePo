
public class Quadro {
	private String nome;
	private Boolean sujo;

	Quadro() {

	}

	Quadro(String nome) {
		this.nome = nome;
	}

	public Boolean getSujo() {
		return sujo;
	}

	public void setSujo(Boolean sujo) {
		this.sujo = sujo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
