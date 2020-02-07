package View;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
/**
 * Escreva a descrição da classe TelaPrincipal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TelaPrincipal extends JFrame implements ActionListener{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    JButton btnCriar;
    JButton btnLer;

    /**
     * Construtor para objetos da classe TelaPrincipal
     */
    public TelaPrincipal()
    {
        //Definindo configurações da janela
        this.setTitle("Recados - Grave ou leia recados");
        this.setSize(300,200);
        this.setLayout(null);
        
        // inicializa variáveis de instância
        btnCriar = new JButton("Iniciar criação de recados");
        btnLer = new JButton("Iniciar leitura de recados");
        
        //setando a disposição (local na tela) dos componentes
        btnCriar.setBounds(10,10,260,35);
        btnLer.setBounds(10,55,260,35);
        
        //Tornando componentes visiveis
        btnLer.setVisible(true);
        btnCriar.setVisible(true);
        
        //Adicionando o evento aos botões
        btnCriar.addActionListener(this);
        btnLer.addActionListener(this);
        
        //Adicionando os componentes á janela
        this.getContentPane().add(btnCriar);
        this.getContentPane().add(btnLer);
        
        //Tornando a janela encerrada quando clicar no X
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Tornando a janela visivel
        this.setVisible(true);
    }

    /**
     * Método que realiza a criação de outras janelas ao clicar em seu
     * respectivo botão.
     * 
     * @param evento ActionEvent - é o evento dizendo que algum botão foi
     * clicado
     * @return void - O método não retorna nenhum dado
     */
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == btnCriar){
            JOptionPane.showMessageDialog(null,"O botão de criação foi"+
                " clicado","Um botão foi clicado"
                ,JOptionPane.INFORMATION_MESSAGE);
        } else
        if(evento.getSource() == btnLer){
            JOptionPane.showMessageDialog(null,"O botão de leitura foi"+
                " clicado","Um botão foi clicado"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
