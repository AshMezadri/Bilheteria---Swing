package controle;

import java.util.ArrayList;

import  modelo.*;

public class PessoaDAO {
	
private static ArrayList<Pessoa> Pessoas;
	
	private static PessoaDAO PessoaDAO;
	
	//Instacia
	public static PessoaDAO getInstancia() {
		if (PessoaDAO == null) {
			PessoaDAO = new PessoaDAO();
			Pessoas = new ArrayList<>();
		}
		return PessoaDAO;
	}
	
	//Insert
	public Boolean insert(Pessoa p) {
		if(p != null) {
			Pessoa.add(p);
			return true;
		}
		return false;
	}
	
	
	//Select
	public ArrayList<Pessoa> getList(){
		return Pessoas;
	}

}
