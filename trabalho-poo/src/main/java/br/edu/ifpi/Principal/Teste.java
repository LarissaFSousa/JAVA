package br.edu.ifpi.Principal;

import br.edu.ifpi.Model.*;

public class Teste {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("João");    
        System.out.println("Nome do cliente: " + cliente.getNome());
    }             
    
}
