package br.edu.ifpi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConfig {

    private static final String SERVER_URL = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/trabalho_poo?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "Larissalinda2008@";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL não encontrado: " + e.getMessage());
        }
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static void initDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL não encontrado: " + e.getMessage());
        }

        // 1. Criar o schema/database se não existir no MySQL
        try (Connection conn = DriverManager.getConnection(SERVER_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE DATABASE IF NOT EXISTS trabalho_poo;");
            System.out.println("Banco de dados 'trabalho_poo' verificado/criado.");
        } catch (SQLException e) {
            System.err.println("Aviso/Erro ao conectar ao servidor MySQL para criar o banco de dados trabalho_poo:");
            System.err.println("Detalhes: " + e.getMessage());
            System.err.println("Verifique se o seu servidor MySQL está rodando no localhost:3306, e se as credenciais (root/sem senha) estão corretas.");
        }

        // 2. Criar a tabela 'cliente' se não existir no database trabalho_poo
        String sql = "CREATE TABLE IF NOT EXISTS cliente (" +
                     "cpf VARCHAR(14) PRIMARY KEY, " +
                     "nome VARCHAR(100) NOT NULL, " +
                     "telefone VARCHAR(20), " +
                     "cnh VARCHAR(20) UNIQUE" +
                     ");";
        
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'cliente' verificada/criada com sucesso no MySQL.");
        } catch (SQLException e) {
            System.err.println("Erro ao inicializar a tabela 'cliente' no MySQL:");
            System.err.println("Detalhes: " + e.getMessage());
        }
    }
}
