package Cadastro;

public class CadEnd {
    private String cep;
   private String bairro;
   private int numcasa;
   private String rua;
   private String compl;
   private int com;

   
   // construtorr
public void CadEnd (String cep, String bairro, int numcasa, String rua){
    this.cep = cep;
    this.bairro = bairro;
    this.numcasa = numcasa;
    this.rua = rua;
}
//////////////////////




// metodo 1
public void atualizaDados (String cepzin, String neighborr, int num, String street  ){
 
    this.cep = cepzin;
 this.bairro = neighborr;
   this.numcasa = num;
    this.rua = street;
} 
 ///////////////////
 


//// metodo 2
 public String ExibeDados(){
return "Bairro: " + bairro + ", " + "Rua: " + rua + ", " + "Numero: " + numcasa;
}
///////////


/// sobrecarga 1
public String ExibeDados(int quantCom){
    this.com = quantCom;
    return "Bairro: " + bairro + ", " + "Rua: " + rua + ", " + "Numero: " + numcasa + ", " + "Comodos na casa: " + quantCom;
}
/////////////////////



///// sobrecarga 1.1
public String ExibeDados(String complemento){
    this.compl = complemento;
    return "Bairro: " + bairro + ", " + "Rua: " + rua + ", " + "Numero: " + numcasa + ", " + "Comodos na casa: " + com + ", " + "complememto: "+ complemento;
}





   //////////////////// GETTERSS E SETTTERESSS ///////////////
   public String getBairro() {
       return bairro;
   }

   public void setBairro(String bairro) {
       this.bairro = bairro;
   }

   /////////////////////////////
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    /////////////////////////////
     public String getCompl() {
         return compl;
     }


     public void setCompl(String compl) {
         this.compl = compl;
     }

     //////////////////
     

public void setNumcasa(int numcasa) {
    this.numcasa = numcasa;
}

public int getNumcasa() {
    return numcasa;
}

///////////////////////////////////

public String getRua() {
    return rua;
}

public void setRua(String rua) {
    this.rua = rua;
}
///////////////////////////////////// FIM GET SET ///////////////////////////////








}
