package JavaClass;

public class Atividades {
    private String atividade;
    private String descricao;
    private String emailAtividades;
    private Integer id;
    
    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getemailAtividades() {
        return emailAtividades;
    }
    public void setemailAtividades(String emailAtividades) {
        this.emailAtividades = emailAtividades;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId (Integer id){
        this.id = id;
    }

    public Atividades(String atividade, String descricao, String emailAtividades) {
    this.atividade = atividade;
    this.descricao = descricao;
    this.emailAtividades = emailAtividades;
    this.id = null;
    }
    
    
}        
    //criar todos os campos que temos no DB (usuario) - ok
    //metodo get set para todos eles - ok
    //construtor para cada atributo - ok

    /*public Atividade() {
        }

        private Atividade(String Ativiade, String Descricao) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getAtividade() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getDescricao() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}*/


