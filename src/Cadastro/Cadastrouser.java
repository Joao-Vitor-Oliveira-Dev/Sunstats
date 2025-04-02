package Cadastro;

public class Cadastrouser {
   private int id_user;
   private String name;
   private int age;
   private double cpf; // tentando
   private int tell; //new
   private String email;
   private String senha; //new
   

// construtor do cadastro de usuario
public Cadastrouser(String name, int idade, double cepefe, int fone, String meil, String pass){
    this.name = name;
    this.age = idade;
    this.cpf = cepefe;
    this.tell = fone;
    this.email = meil;
    this.senha = pass;

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

   public void setName(String nome) {
       this.name = nome;
     
   }

//////////////////////////////////////////

public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

//////////////////////////////////////////////

public double getCpf() {
    return cpf;
}
public void setCpf(char cpf) {
    this.cpf = cpf;
}
//////////////////////////////////////////////

public String getEmail() {
    return email;
}public void setEmail(String email) {
    this.email = email;
}
/////////////////////////////////////////////

public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
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