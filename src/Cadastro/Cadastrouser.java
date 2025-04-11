package Cadastro;

import java.util.ArrayList;

public class Cadastrouser {
   private int id_user;
   private String name;
   private int age;
   private String cpf; 
   private int tell; //new
   private String email;
   private String senha; //new

   private ArrayList<CadAparelho> historicoAparelhos;
   

// construtor do cadastro de usuario
public Cadastrouser(String name, int idade, String cepefe, int fone, String meil, String pass){
    setName(name);
    this.age = idade;
    setCpf(cepefe);
    this.tell = fone;
    setEmail(meil);
    this.senha = pass;

    this.historicoAparelhos = new ArrayList<>();

}

// metodo não iniciado
public void Login(){
    
}


   /////////////////GETTERS E SETTERS/////////////////////
   public int getTell() {
       return tell;
   }

   public void setTell(int fonee) {
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

//////////////////////////////////////////

public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

//////////////////////////////////////////////

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {  // validação de cpf
    int tamanhocpf = this.cpf.length();
    if (tamanhocpf == 11){
        this.cpf = cpf;  
    }else{
        System.err.println("CPF inválido. Seu CPF deve conter 11 dígitos");
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
    System.out.println("Age: " + age);
    System.out.println("Email: " + email);

}



}