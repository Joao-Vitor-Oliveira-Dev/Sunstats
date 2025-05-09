package Cadastro;

public class PlacaSolar {
private double pot; //potencia
private double efi; // eficiencia 
private double tensao; 
private double corrente;
private double tpfuncdiario; // tempo de funcionamento diario
private String status;
private double area;
private double irradiacao;
 
/*********METODOS E FUNÇÕES ***************** */
public Double calculaPotenciaGerada(double tensao, double corrente){
 this.tensao = tensao;
 this.corrente = corrente;
return  tensao * corrente;
}


///////////////////////////////////////////
public Double Pin(double irradiacao, double area){
    this.area = area;
    this.irradiacao = irradiacao;

    return irradiacao * area;
}

///////////////////////////////////////

public void calculaEficiencia(){
    this.efi = ( calculaPotenciaGerada(tensao, corrente) / Pin(irradiacao, area) * 100);

}

///////////////////////////////////////

public void exibeCalculoDeEficiencia(){
    System.out.println("A Potência Gerada é de:\n" + calculaPotenciaGerada(tensao, corrente));
    System.out.println("O Pin Gerado é de: \n" + Pin(irradiacao, area));
    System.out.println("A Eficiência real da sua placa é de: \n" + this.efi);
}




/****************getters e setters ******************* */
public double getCorrente() {
    return corrente;
}

public void setCorrente(double corrente) {
    this.corrente = corrente;
}


public double getEfi() {
    return efi;
}

public void setEfi(double efi) {
    this.efi = efi;
}


public double getPot() {
    return pot;
}

public void setPot(double pot) {
    this.pot = pot;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public double getArea() {
    return area;
}
public void setArea(double area) {
    this.area = area;
}


public double getTensao() {
    return tensao;
}


public void setTensao(double tensao) {
    this.tensao = tensao;
}

public double getTpfuncdiario() {
    return tpfuncdiario;
}


public void setTpfuncdiario(double tpfuncdiario) {
    this.tpfuncdiario = tpfuncdiario;
}
public double getIrradiacao() {
    return irradiacao;
}
public void setIrradiacao(double irradiacao) {
    this.irradiacao = irradiacao;
}











}
