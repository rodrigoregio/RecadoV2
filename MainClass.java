import javax.swing.JOptionPane;
import View.TelaPrincipal;
/**
 * Classe principal do projeto, ela instancia a classe tela que chama outras
 * classes.
 * 
 * @author Rodrigo Régio de Araújo
 * @version 2 - 06/05/2020
 */
public class MainClass{
    /**
     * Método principal que inicializa a classe da tela do sistema
     * 
     * @param args[] String - array de argumentos que podem ser usado como
     * parâmetros de inicialização do sistema.
     * @return void - O método não possui retorno.
     */
    public static void main(String [] args){
        TelaPrincipal janela = new TelaPrincipal();
    }
}
