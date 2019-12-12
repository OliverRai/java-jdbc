package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {
	public static void main(String[] args) throws SQLException {
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		
		long id = 3; 
		contato.setId(id);
		dao.remove(contato);
	}
}
