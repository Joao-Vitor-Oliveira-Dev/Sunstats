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












}
