package utilities;

public class Manutencao {
    private final String tipo;
    private final int dia ;
    private final int mes ;
    private final int ano;

    public Manutencao(String tipo, int dia, int mes, int ano){
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

public String getTipo() {
        return tipo;
    }
public int getDia() {
    return dia;
}
public int getMes() {
    return mes;
}
public int getAno() {
    return ano;
}

}
