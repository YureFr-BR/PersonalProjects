package informacoesdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
/*
 * @author: YureFr-BR
 */
public class InformacoesDoSistema {

 public static void main(String[] args) {
     
     // Retorna nome do usuário atual
     System.out.print("Olá ");
     Properties usuario = System.getProperties();
        System.out.print( System.getProperty("user.name") );
        System.out.println(", bem vindo de volta!");
        
     Date relogio = new Date();
        System.out.print("A data e hora do sistema é: ");
        System.out.println(relogio.toString());
        
// Retorna informações do S.O

       Properties propriedades = System.getProperties();
        System.out.print("O seu sistema operacional é: ");
        System.out.println( System.getProperty("os.name") );
        System.out.print("A arquitetura do seu sistema é: ");
        System.out.println( System.getProperty("os.arch"));
        
      Locale idioma = Locale.getDefault();
        System.out.print("O idioma atual do seu sistema é: ");
        System.out.println(idioma.getDisplayLanguage());
        
      Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension D = resolucao.getScreenSize();
        System.out.println("A resolução do seu sistema é de " + D.width + "x" + D.height );
      
    }
 
}
