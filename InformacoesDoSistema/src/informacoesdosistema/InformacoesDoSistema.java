
package informacoesdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author YureFr-BR
 */
public class InformacoesDoSistema {

 public static void main(String[] args) {
      Date relogio = new Date();
        System.out.print("A data e hora do sistema é: ");
        System.out.println(relogio.toString());
        
      Locale idioma = Locale.getDefault();
        System.out.print("O seu sistema está em: ");
        System.out.println(idioma.getDisplayLanguage());
        
      Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension D = resolucao.getScreenSize();
        System.out.println("A resolução do seu sistema é de " + D.width + "x" + D.height );
                  
    }
    
}
