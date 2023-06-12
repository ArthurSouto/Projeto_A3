package Telas;

import static Telas.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JavaClass.Atividades;
import JavaClass.Rotina;
import JavaClass.UserSession;
import JavaClass.Usuario;


public class DAO {
    private Connection connection;

    public DAO() {
        // Configurar a conexÃ£o com o banco de dados
        String url = "jdbc:mysql://localhost:3306/projetoa3";
        String username = "root";
        String password = "1234";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarAtividade(String atividade, String descricao) {
        String sql = "INSERT INTO TB_ATIVIDADES (Atividade, Descricao, emailAtividades) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, atividade);
            statement.setString(2, descricao);
            statement.setString(3, UserSession.getInstance().email());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Atividades> listarAtividade(String email) {
        List<Atividades> listaAtividade = new ArrayList<>();
        String sql = "SELECT * FROM TB_ATIVIDADES WHERE emailAtividades = ?";

        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = null;
            statement.setString(1, email);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                
                String atividadeResult = resultSet.getString("Atividade");
                String descricaoResult = resultSet.getString("descricao");
                String emailAtividadeResult = resultSet.getString("emailAtividades");
                int id = resultSet.getInt("id");
               
                Atividades atividade = new Atividades
                (atividadeResult, descricaoResult, emailAtividadeResult);
                
                atividade.setId(id);

                listaAtividade.add(atividade);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAtividade;
    }
    
    public void deleteAtividade(int id){
        String query = "DELETE FROM TB_ATIVIDADES WHERE ID = ?";
        
        try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, id);
        statement.executeUpdate();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    
    public void editAtividade(String descricao, int id){
        String query = "UPDATE TB_ATIVIDADES SET descricao = ? WHERE id = ?";
        
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, descricao);
            statement.setInt(2, id);
        
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
    public void InserirUsuario(Usuario usuario) {
        String query = "INSERT INTO TB_USUARIOS (email, nome, peso, altura, idade, senha) VALUES (?, ?, ?, ?, ?, ?)";
    
        UserSession.getInstance().setUser(usuario.getNome());
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, usuario.getEmail());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getPeso());
            statement.setString(4, usuario.getAltura());
            statement.setString(5, usuario.getIdade());
            statement.setString(6, usuario.getSenha());
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar credenciais do usuário: " + ex.getMessage());
        }
    }
    

    public static boolean VerificaUsuario(String email, String senha) {
        String sql = "SELECT * FROM TB_USUARIOS WHERE email = ? AND senha = ?";
        
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, email);
            statement.setString(2, senha);
            
            
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar credenciais do usuário: " + ex.getMessage());
        }
        
        return false;
    }
    
    public String buscarNomeUsuario(String email) {
        String query = "SELECT * FROM TB_USUARIOS WHERE email = ?";
        
        String nome = null;
        ResultSet rs = null;
    
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, email);
            rs = statement.executeQuery();
            if(rs.next()){
                nome = rs.getString("nome");
            }
            
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar credenciais do usuário: " + ex.getMessage());
        }
        return nome;
    }
    
    public List<Usuario> listaUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM TB_USUARIOS";

        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = null;
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                
                
                String email = resultSet.getString("email");
                String nome = resultSet.getString("nome");
                String peso = resultSet.getString("peso");
                String altura = resultSet.getString("altura");
                String idade = resultSet.getString("idade");
                String senha = resultSet.getString("senha");
               
                Usuario usuario = new Usuario
                (email, nome, peso, altura, idade, senha);

                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaUsuarios;
    }
    
    public void deleteUsuario(String email){
        deletarAtividadesPorEmail(email);
        String query = "DELETE FROM TB_USUARIOS WHERE EMAIL = ?";
        
        try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, email);
        statement.executeUpdate();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    public void deletarAtividadesPorEmail(String email) {
        String sql = "DELETE FROM TB_ATIVIDADES WHERE emailAtividades = ?";

        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);
            statement.executeUpdate();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    
    public Usuario buscaInfoUsuario(String email) {
        String sql = "SELECT * FROM TB_USUARIOS WHERE EMAIL = ?";
        Usuario usuario = null;
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = null;
            statement.setString(1, email);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                
                String nome = resultSet.getString("nome");
                String peso = resultSet.getString("peso");
                String altura = resultSet.getString("altura");
                String idade = resultSet.getString("idade");
                String senha = resultSet.getString("senha");
               
                usuario = new Usuario
                (email, nome, peso, altura, idade, senha);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }
    
    public void editProfile(Usuario usuario) {
        String query = "UPDATE TB_USUARIOS SET peso = ?, altura = ?, idade = ? WHERE email = ?";
    
        UserSession.getInstance().setUser(usuario.getEmail());
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, usuario.getPeso());
            statement.setString(2, usuario.getAltura());
            statement.setString(3, usuario.getIdade());
            statement.setString(4, usuario.getEmail());
            
            System.out.println(statement);
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar credenciais do usuário: " + ex.getMessage());
        }
    }
    
}