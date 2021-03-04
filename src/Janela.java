
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.awt.BorderLayout;
public class Janela  extends JFrame{
    Tela tela=new Tela();
    Botao botao= new Botao();
    public Janela(){
        setSize(620,20);//tamanho da tela 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//fechar tela o VS n aceita a abrevição pelo menos não na versão que eu estou 
        setLayout(new BorderLayout());//criação do layout
        add(new Tela(),BorderLayout.CENTER);//ele fica no centro fo Jframe 
        add(new Botoes(),BorderLayout.LINE_END);//isso fica e esquerda no Jframe
        botao.addChangeListenerSlide(new MudarReta());//modifica o local da reta
        setVisible(true);//a janela está visivel
        pack();// para deicar do menor tamanho possivel
    }
    //atializa um valor
    class MudarReta implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e){
            int valor = botoes.getValorSlide();// quando mover deslizar o botão 
            tela.atualizarValor(valor);// um novo valor será gerado
        }
    }
}

