import Cadastro.CadAparelho;
import Cadastro.CadEnd;
import Cadastro.Cadastrouser;
import java.util.Locale;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale LocaleBrasil = new Locale("pt", "br");


        System.out.println("Eae seus porr4 !");

       // Cadastrouser pessoa = new Cadastrouser("João Vitor", 20, 10, 2004, "548.658.597-59", 996451411, "joaopipinelas@gmail.com", "joaozinho");

CadEnd endpessoa = new CadEnd("16 678-946", "Jardim Cândida", 89, "Cidadela");

/* 
CadAparelho apPessoa = new CadAparelho(0, "Smart TV", "Samsumg", "55 pol, 4k", "6 Horas", "100 watts", "110V", 18, "R$ 60,00/ mês", 0); */
        
//pessoa.converteIdade(20, 10, 2004);
      //  pessoa.imprimirDados();
        System.out.println();
       System.out.println(endpessoa.ExibeDados()); 
       System.out.println();
      // System.out.println(apPessoa.exibeAp());
       System.out.println();
     // System.out.println(apPessoa.exibeAp(13.000));


}
}