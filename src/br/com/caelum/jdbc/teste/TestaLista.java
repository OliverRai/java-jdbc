package br.com.caelum.jdbc.teste;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) throws SQLException {
	
	ContatoDao dao = new ContatoDao();
	List<Contato> contatos = dao.getLista();
	
	for (Contato contato : contatos) {
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endere�o: " + contato.getEndereco());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		//yyyy = Ano,MM = M�s,dd=Dia,hh  = Hora(HH maiusculo padrao 24hrs) e mm � minuto
		String dataAtual = sdf.format(new Date());
		System.out.println("Data: " + dataAtual);
		}
	}
}
