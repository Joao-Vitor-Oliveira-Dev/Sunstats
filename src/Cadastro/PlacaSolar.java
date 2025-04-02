package Cadastro;

public class PlacaSolar {
private String pot; //potencia
private String efi; // eficiencia
private String temp; // temperatura
private String tensao; 
private String corrente;
private String tpfuncdiario; // tempo de funcionamento diario
private String status;



public String getCorrente() {
    return corrente;
}

public void setCorrente(String corrente) {
    this.corrente = corrente;
}


public String getEfi() {
    return efi;
}

public void setEfi(String efi) {
    this.efi = efi;
}


public String getPot() {
    return pot;
}

public void setPot(String pot) {
    this.pot = pot;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public String getTemp() {
    return temp;
}
public void setTemp(String temp) {
    this.temp = temp;
}


public String getTensao() {
    return tensao;
}


public void setTensao(String tensao) {
    this.tensao = tensao;
}

public String getTpfuncdiario() {
    return tpfuncdiario;
}


public void setTpfuncdiario(String tpfuncdiario) {
    this.tpfuncdiario = tpfuncdiario;
}












}
