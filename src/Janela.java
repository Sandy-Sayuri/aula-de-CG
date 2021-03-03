
import javax.swing.JFrame;
import javax.awt.BorderLayout;
public class Janela  extends JFrame{
    public Janela(){
        setSize(620,20);//tamanho da tela 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//fechar tela o VS n aceita a abrevição pelo menos não na versão que eu estou 
        setLayout(new BorderLayout());//criação do layout
        add(new Tela(),BorderLayout.CENTER);//ele fica no centro fo Jframe 
        add(new Botoes(),BorderLayout.LINE_END);//isso fica e esquerda no Jframe
        setVisible(true);//a janela está visivel
        pack();// para deicar do menor tamanho possivel
    }
}

