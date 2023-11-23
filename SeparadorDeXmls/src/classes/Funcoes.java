package classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import classes.ArqUrl;

public class Funcoes {
    
  //CRIA PASTAs
  public static boolean criarPasta(ArqUrl arquivo, String nome){
      boolean bool = true;
      
        try{
            String url = arquivo.getUrl();
            /*char ultimoChar = url.charAt(url.length());
        
            if(ultimoChar != '/'){
                nome = nome + "/";
            }*/
            
            url = url + nome;
            File file = new File(url);
            
            file.mkdirs();
        }catch(Exception e){
            bool = false;
        }
  return bool;
  }
  
  //MOVE XMLS AUTORIZADOS
  public static boolean moveAutorizados(ArqUrl arquivo){
      boolean bool = true;
        try{
            String url = arquivo.getUrl();
            url = url + "NF-e";
            File file = new File(url);
            file.mkdirs();
        }catch(Exception e){
            bool = false;
        }
  return bool;
  }
  
     //VERIFICA A EXISTENCIA DE ARQUIVOS E ARMAZENA EM ARRAYLIST
     public static boolean encotrarArquivos(String caminho, String expressao, ArqUrl arquivo){
            Boolean bool = false;
            Path diretorio = Paths.get(caminho); // Especifique o diretório onde deseja procurar os arquivos 
            PathMatcher matcher = FileSystems.getDefault().getPathMatcher(expressao);//expressao "glob:*.xml"

        try {
            DirectoryStream<Path> stream = java.nio.file.Files.newDirectoryStream(diretorio);

            for (Path achou : stream) {
                if (java.nio.file.Files.isRegularFile(achou) && matcher.matches(achou.getFileName())) {
                    arquivo.nfeAutorizados.add((achou.getFileName()).toString());
                    bool = true;
                  
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            bool = false;
        }
        return bool;
    }
     
     //MOVER ARQUIVOS
    public static boolean moveArquivo(String from, String to){
        File arq = new File(from);
     
        // diretorio de destino
        File dir = new File(to);
     
        // move o arquivo para o novo diretorio
        boolean bool = arq.renameTo(new File(dir, arq.getName()));
        return bool;
    }
}
