package controle;

import java.util.ArrayList;

import  modelo.*;

public class PessoaDAO {
	
private static ArrayList<Pessoa> TPessoa;
	
	private static PessoaDAO FPessoaDAO;
	
	//Instacia
	public static PessoaDAO getInstancia() {
		if (FPessoaDAO == null) {
			FPessoaDAO = new PessoaDAO();
			TPessoa    = new ArrayList<>();
		}
		return FPessoaDAO;
	}
	
	//Insert
	public Boolean insert(Pessoa prModel) {
		if(prModel != null) {
			TPessoa.add(prModel);
			return true;
		}
		return false;
	}
	
	
	//Select
	public ArrayList<Pessoa> getList(){
		return TPessoa;
	}

}
