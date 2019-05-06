package br.com.fiap.main;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Filme;

public class ServerSocketTeste {
  public static void main(String[] args) throws Exception {

    // Receber um objeto via rede
    ServerSocket server = new ServerSocket(1234);

    System.out.println("Aguardando conexão...");
    Socket socket = server.accept();

    // Ler o objeto filme e exibir seus valores
    ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

    Filme filme = (Filme) input.readObject();

    System.out.println(filme.getNome());
    System.out.println("Duração: " + filme.getDuracao());
    System.out.println("Gênero: " + filme.getGenero());

    socket.close();
    server.close();

  }
}