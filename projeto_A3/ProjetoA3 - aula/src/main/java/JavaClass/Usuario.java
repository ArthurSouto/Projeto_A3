package JavaClass;

public class Usuario {
    private String email;
    private String nome;
    private String peso;
    private String altura;
    private String idade;
    private String senha;
    public static String loggedUserObj;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String getAltura() {
        return altura;
    }
    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public Usuario(String email, String nome, String peso, String altura, String idade, String senha) {
    this.email = email;
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
    this.idade = idade;
    this.senha = senha;
    }

}

//criar todos os campos que temos no DB (usuario) - ok
//metodo get set para todos eles - ok
//construtor para cada atributo - ok
