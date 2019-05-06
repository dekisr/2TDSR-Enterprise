package br.com.fiap.main;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Filme;

public class ServerSocketTeste {

	public static void main(String[] args) throws Exception {

		//Receber um objeto via rede
		ServerSocket server = new ServerSocket(1234);
		while(true) {
			System.out.println("Aguardando conex�o...");
			Socket socket = server.accept();
			
			//Ler o objeto filme e exibir seus valores
			ObjectInputStream input = 
					new ObjectInputStream(socket.getInputStream());
			
			Filme filme = (Filme) input.readObject();
			
			System.out.println(filme.getNome());
			System.out.println("Dura��o: " + filme.getDuracao());
			System.out.println("G�nero: " + filme.getGenero());
		}
//		socket.close();
//		server.close();
		
	}
	
}


