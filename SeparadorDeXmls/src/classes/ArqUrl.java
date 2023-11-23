package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArqUrl {
    private String url;
    private String codUf;
    private String anoXml;
    private String mesXml;
    public int contNfeAutorizados = 0;
    public ArrayList <String> nfeAutorizados = new ArrayList<String>(); 
    
    
    public ArqUrl(){ //pega os valores iniciais
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a URL/n=> "); //MANDAR URL TERMINADA COM /
        setUrl(ler.nextLine());
        /*System.out.println("Insira a UF/n=> ");
        setCodUf(ler.nextLine());
        System.out.println("Insira o ano/n=> ");
        setAnoXml(ler.nextLine());
        System.out.println("Insira a mes/n=> ");
        setMesXml(ler.nextLine());*/
    }


    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    public String getCodUf() {
        return codUf;
    }
    public void setCodUf(String codUf) {
        this.codUf = codUf;
    }

    public String getAnoXml() {
        return anoXml;
    }
    public void setAnoXml(String anoXml) {
        this.anoXml = anoXml;
    }

    public String getMesXml() {
        return mesXml;
    }
    public void setMesXml(String mesXml) {
        this.mesXml = mesXml;
    }
}