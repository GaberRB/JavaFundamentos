package stream;

public class Incidente {
	
	final int id;
	String descricao;
	String solicitante;
	String prioridade;
	String status;
	
	public Incidente(int id, String descricao, String solicitante, String prioridade, String status) {
		this.id = id;
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.prioridade = prioridade;
		this.status = status;
	}
	
	
}
