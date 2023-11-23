package teste;

import classes.ArqUrl;
import classes.Funcoes;
import java.io.File;

public class Teste {
    public static void main(String[] args) {
    
    ArqUrl arquivo = new ArqUrl(); //USADO PELA FUNCAO CRIAR PASTA
        
    //VERFICAR SE TEM AUTORIZADAS
    if(Funcoes.encotrarArquivos("C:\\202305\\", "glob:*55??????????????????????-procNFe.xml", arquivo) == true){
        System.out.println("encrontrado xmls autorizados");
                
        for(String nome : arquivo.nfeAutorizados){//contador para o número de 
            arquivo.contNfeAutorizados++;
        }
        
        if(Funcoes.criarPasta(arquivo, "NF-e\\Autorizadas")){//CRIA PASTA NFE
        System.out.println("PASTA CRIADA COM SUCESSO!");
        }else{
        System.out.println("ERRO ARQUIVO NÃO CRIADO!");
        }
        
       /* if(Funcoes.moveArquivo("C:\\202305\\31230505724542000120550010000066441623544765-procNFe.xml", "c:\\202305\\NF-e\\")){
            System.out.println("Arquivo movido com sucesso");
        }else{
            System.out.println("Erro arquivo não foi movido");
        }*/
       
       for(String nome : arquivo.nfeAutorizados){
           String nomeMover = "C:\\202305\\" + nome;
           if(Funcoes.moveArquivo(nomeMover, "C:\\202305\\NF-e\\Autorizadas")){
            System.out.println("Arquivo movido com sucesso");
        }else{
            System.out.println("Erro arquivo não foi movido");
        }
       }
       
    }
    else{
        System.out.println("Erro não foram encontrados arquivos autorizados");
        }
    }
}

