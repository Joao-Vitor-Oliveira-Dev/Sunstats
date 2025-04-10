package Cadastro;

public class CadAparelho {

    private int id;
    private String desc;
    private String marca;
    private String model;
    private String medtimeon;
    private String pot;
    private String tensao;
    private int pic_time;
    private String consMensal;
    private double custEst;


    // construtorr
    public CadAparelho (int idzin, String descri, String marcazin, String modelin, String medtimeonzin,
    String potz,
    String tensaozinha,
    int pic_timezin,
    String consMensalzin,
    double custEstozin){

        this.id = idzin;
        this.desc = descri;
        this.marca = marcazin;
        this.model = modelin;
        this.medtimeon = medtimeonzin;
        this.pot = potz;
        this.tensao = tensaozinha;
        this.pic_time = pic_timezin;
        this.consMensal = consMensalzin;
        this.custEst = custEstozin;
        
    }
/////////////////////////////////////


public String exibeAp(){
    return "Nome: " + desc + ", Marca: " + marca + ", Modelo: " + model + ", Tempo médio ligado: " + medtimeon ;

}

public String exibeAp(Double price){
    return "Nome: " + desc + ", Marca: " + marca + ", Modelo: " + model + ", Tempo médio ligado: " + medtimeon + ", Preço: " + price;
}


}
