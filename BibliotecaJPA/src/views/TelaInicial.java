package views;

import java.awt.*;
import javax.swing.*;

public class TelaInicial {
	
	public TelaInicial(){
		
		System.out.println("A tela inicial foi chamada");
		
		JFrame inicial = new JFrame();
		inicial.setBounds(200,100,300,300);
		inicial.setTitle("Tela inicial - Biblioteca");
		inicial.setLayout(null);
		inicial.setResizable(false);
		inicial.setVisible(true);
		
		JLabel lb01 = new JLabel("Bem vindo ao sistema da biblioteca!");
		lb01.setBounds(30,10,220,20);
		inicial.add(lb01);
		
		JPanel painel = new JPanel();
		painel.setBounds(30, 30, 300, 300);
		painel.setLayout(null);
		
		JButton btnCadastroUser = new JButton("Cadastrar Usuário");
		btnCadastroUser.setBounds(0,40,200, 20);
		painel.add(btnCadastroUser);
		
		JButton btnCadastroObra = new JButton("Cadastrar Livro");
		btnCadastroObra.setBounds(0,80,200, 20);
		painel.add(btnCadastroObra);
		
		JButton btnSolicitaLivro = new JButton("Solicitar livro");
		btnSolicitaLivro.setBounds(0,120,200, 20);
		painel.add(btnSolicitaLivro);
		
		inicial.add(painel);
		
	}
}
