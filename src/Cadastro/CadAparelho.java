package Cadastro;

public class CadAparelho {

    private String desc;
    private String marca;
    private String model;
    private Double medtimeon;
    private int pot;
    private String tensao;
    private String pic_time;
    private String consMensal; // teremos que remover
    private double custEst;


    // construtorr
    public CadAparelho ( String descri, String marcazin, String modelin, Double medtimeonzin,
    int potz,
    String pic_timezin,
    String tensaozinha,
    String consMensalzin,
    double custEstozin){


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
//////////////////////////////////////// 
public double gastoEnergia(){     /// metodo que retorna o gasto de pot do ap

    double valorgasto = (this.pot * this.medtimeon)/1000;

    System.out.println("Este aparelho gasta em média: " + valorgasto);
    return valorgasto;
}

public String exibeAp(){ 
    return "Nome: " + desc + ", Marca: " + marca + ", Modelo: " + model + ", Tempo médio ligado: " + medtimeon ;

}

public String exibeAp(String ano) {         /// sobrecarga q puxa o metodo e adiciona a info de que ano o ap é
    return exibeAp() + ", Ano: " + ano;
}


/*    private String desc;
    private String marca;
    private String model;
    private Double medtimeon;
    private int pot;
    private String tensao;
    private String pic_time;
    private String consMensal; // teremos que remover
    private double custEst;
*/
get


}

