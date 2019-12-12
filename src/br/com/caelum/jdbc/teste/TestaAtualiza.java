package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAtualiza {
	
	public static void main(String[] args) throws SQLException {
	 ContatoDao dao = new ContatoDao();

     Contato contato = new Contato();

     long id = 1;

     contato.setId(id);
     contato.setNome("Raiane");
     contato.setEmail("rai@Gmail.com");
     contato.setEndereco("Av. Paula Ferreira");
     Calendar novaData = Calendar.getInstance();

     contato.setDataNascimento(novaData);

     dao.altera(contato);
     System.out.println("Contato alterado!");
	}
}
