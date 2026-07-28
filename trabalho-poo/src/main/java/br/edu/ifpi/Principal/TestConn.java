package br.edu.ifpi.Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConn {
    public static void main(String[] args) {
        String[] users = {"root", "Larissa", "larissa"};
        String[] passwords = {"Larissalinda2008@", "larissalinda2008@", "Larissalinda2008", ""};
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL não encontrado!");
            return;
        }

        System.out.println("--- DIAGNÓSTICO DETALHADO MYSQL ---");
        
        for (String user : users) {
            for (String password : passwords) {
                String url = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
                try (Connection conn = DriverManager.getConnection(url, user, password)) {
                    System.out.println("SUCESSO: User='" + user + "', Senha='" + password + "'");
                    return;
                } catch (SQLException e) {
                    System.out.println("User='" + user + "' | Senha='" + password + "' -> Erro: " + e.getMessage());
                }
            }
        }
    }
}
