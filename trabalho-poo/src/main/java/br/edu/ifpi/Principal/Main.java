package br.edu.ifpi.Principal;

import br.edu.ifpi.DAO.ClienteDAO;
import br.edu.ifpi.DAO.DatabaseConfig;
import br.edu.ifpi.Model.Cliente;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Inicializa o banco de dados e cria a tabela se não existir
        DatabaseConfig.initDatabase();

        ClienteDAO clienteDAO = new ClienteDAO();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=================================");
            System.out.println("   LOCADORA - CONTROLE DE CLIENTES");
            System.out.println("=================================");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Pesquisar Cliente por CPF");
            System.out.println("3. Listar Todos os Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarCliente(clienteDAO, scanner);
                    break;
                case 2:
                    buscarCliente(clienteDAO, scanner);
                    break;
                case 3:
                    listarClientes(clienteDAO);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void cadastrarCliente(ClienteDAO clienteDAO, Scanner scanner) {
        System.out.println("\n--- Novo Cadastro ---");
        Cliente cliente = new Cliente();

        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("CPF: ");
        cliente.setCpf(scanner.nextLine());

        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());

        System.out.print("CNH: ");
        cliente.setCnh(scanner.nextLine());

        try {
            clienteDAO.salvar(cliente);
            System.out.println("Cliente salvo com sucesso!");
        } catch (SQLException e) {
            if (e.getMessage().contains("UNIQUE constraint failed") || e.getMessage().contains("PRIMARY KEY")) {
                System.out.println("Erro: CPF ou CNH já cadastrado no sistema.");
            } else {
                System.out.println("Erro ao salvar cliente: " + e.getMessage());
            }
        }
    }

    private static void buscarCliente(ClienteDAO clienteDAO, Scanner scanner) {
        System.out.println("\n--- Pesquisa por CPF ---");
        System.out.print("Digite o CPF a ser pesquisado: ");
        String cpf = scanner.nextLine();

        try {
            Cliente cliente = clienteDAO.buscarPorCpf(cpf);
            if (cliente != null) {
                System.out.println("\nCliente Encontrado:");
                System.out.println("Nome:     " + cliente.getNome());
                System.out.println("CPF:      " + cliente.getCpf());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("CNH:      " + cliente.getCnh());
            } else {
                System.out.println("Nenhum cliente encontrado com o CPF informado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao realizar a busca: " + e.getMessage());
        }
    }

    private static void listarClientes(ClienteDAO clienteDAO) {
        System.out.println("\n--- Lista de Clientes ---");
        try {
            List<Cliente> clientes = clienteDAO.listarTodos();
            if (clientes.isEmpty()) {
                System.out.println("Nenhum cliente cadastrado.");
            } else {
                for (Cliente c : clientes) {
                    System.out.println("---------------------------------");
                    System.out.println("Nome:     " + c.getNome());
                    System.out.println("CPF:      " + c.getCpf());
                    System.out.println("Telefone: " + c.getTelefone());
                    System.out.println("CNH:      " + c.getCnh());
                }
                System.out.println("---------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
        }
    }
}