package Cadastro;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Cadastrouser {
   private int id_user;
   private String name;
   private int dia; // new
   private int mes; // new
   private int ano; // new
   private int idadeCalculada;
   private String cpf; 
   private double tell; //new
   private String email;
   private String senha; //new

   private ArrayList<CadAparelho> historicoAparelhos;
   

// construtor do cadastro de usuario
public Cadastrouser(String name, int dia, int mes, int ano, String cepefe, double fone, String meil, String pass){
    setName(name);
    setDia(dia);
    setMes(mes);
    setAno(ano);
    setCpf(cepefe);
    setTell(fone);
    setEmail(meil);
    this.senha = pass;

    this.historicoAparelhos = new ArrayList<>();

}
///////////*******METODOSSSS*********/////////////

public void converteIdade(int dia, int mes, int ano){
    LocalDate nascimento = LocalDate.of (ano,  mes,  dia);
    LocalDate hoje = LocalDate.now();
    Period idade = Period.between(nascimento, hoje);
    this.idadeCalculada = idade.getYears();
}


// metodo não iniciado
public void Login(){
    
}


   /////////////////GETTERS E SETTERS/////////////////////
   public double getTell() {
       return tell;
   }

   public void setTell(double fonee) {
       this.tell = fonee;
   }

//////////////////////////////////////////
   public String getName() {
       return name;
   }

   public void setName(String nome) {   // validação de nome
    if(nome != null && !nome.trim().isEmpty()){
        this.name = nome;
    } else{
        System.out.println("Nome inválido. Nome não pode ser vazio!");
    }
    
     
   }

//////////////////////////////////////////////

public void setCpf(String cpf) {
    if (cpf != null) {
        cpf = cpf.replace(".", "").replace("-", "");
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.err.println("CPF inválido. Seu CPF deve conter 11 dígitos.");
        }
    } else {
        System.err.println("CPF não pode ser nulo.");
    }
}

//////////////////////////////////////////////

public String getEmail() {
    return email;

}
public void setEmail(String email) {      // validação de email
    if(email != null && email.contains("@") && email.contains(".")){
        this.email = email;
    }else{
        System.out.println("Email inválido. O email deve conter '@' e '.' ");
    }
    
}
/////////////////////////////////////////////
public int getDia() {
    return dia;
}
public void setDia(int dia) {
    this.dia = dia;
}
/////////////////////////////////////////////
public int getMes() {
    return mes;
}
public void setMes(int mes) {
    this.mes = mes;
}
/////////////////////////////////////////////

public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
/////////////////////////////////////////////





/////////////////////////////////////////////
public String getSenha() {
    return senha;
}
public void setSenha(String senha) { // validaçao de senha

    if (senha.length() < 8) {
        throw new IllegalArgumentException("A senha deve ter no mínimo 8 caracteres.");
    }
    if (!senha.matches(".*[A-Z].*")) {
        throw new IllegalArgumentException("A senha deve conter pelo menos uma letra maiúscula.");
    }
    if (!senha.matches(".*[a-z].*")) {
        throw new IllegalArgumentException("A senha deve conter pelo menos uma letra minúscula.");
    }
    if (!senha.matches(".*\\d.*")) {
        throw new IllegalArgumentException("A senha deve conter pelo menos um número.");
    }
    if (!senha.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")) {
        throw new IllegalArgumentException("A senha deve conter pelo menos um caractere especial.");
    }
    if (senha.contains(" ")) {
        throw new IllegalArgumentException("A senha não pode conter espaços.");
    }

    this.senha = senha;
}
///////////////////////////////////////


// metodo para imprimir dados
public void imprimirDados(){
    System.out.println("Name: " + name);
    System.out.println("idade " + idadeCalculada);
    System.out.println("Email: " + email);

}



}