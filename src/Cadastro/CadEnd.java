package Cadastro;

public class CadEnd {
    private char cep;
   private String bairro;
   private int numcasa;
   private String rua;
   private String compl;
   private String com;
   


public String ExibeDados(String neighborr, String street, int num ){
    return "Bairro: " + bairro + ", " + "Rua: " + rua + ", " + "Numero: " + numcasa;

}

public String ExibeDados(String quantCom){
    return "Bairro: " + bairro + ", " + "Rua: " + rua + ", " + "Numero: " + numcasa + ", " + "Comodos na casa: " + com  ;

}




   //////////////////// GETTERSS E SETTTERESSS ///////////////
   public String getBairro() {
       return bairro;
   }

   public void setBairro(String bairro) {
       this.bairro = bairro;
   }

   /////////////////////////////
    public char getCep() {
        return cep;
    }

    public void setCep(char cep) {
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
