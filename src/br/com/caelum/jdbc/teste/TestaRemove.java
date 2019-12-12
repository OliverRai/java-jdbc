package br.com.caelum.jdbc.teste;

import java.sql.SQLException;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {
	public static void main(String[] args) throws SQLException {
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
	}
}
