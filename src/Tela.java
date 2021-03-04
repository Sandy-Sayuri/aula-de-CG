import java.awt.Graphics;

public class Janela  extends JPanel{
    //expecificaçaõ do Jpanel
    //pontos inicial
    int x0=10;
    int y0=10;
    //ponto final 
    int x1=120;
    int y1=120;
    //recebe o valor novo do ponto
     int valor=0;
    /*obrigatorio*/
    public void paintComponent(Graphics g){//é tipo o papel
        super.paintComponents(g);//ele atualiza o desenho 
        Graphics g2d = (Graphics2D)g;//fala que isso é 2d 
        //oq voce vai fazer
        this.setBackground(Color.CYAN);//fundo da tela
        g2d.setColor(Color.MAGENTA);//cor da linha
        g2d.setStroke(new BasicStroke(10));
       
        x0=10;
        y0=10;
        y1=120;
        x1=120;
        //modifica o tamanha da linha
        x0+=value;
        x1+=value; 
        //redefinindo para fazer a conta
        g2d.drawLine(x0, y0, x1, y1);

    }
    public void atualizarValor(int novoValor){
        this.valor=novoValor;
        this.repaint();
    }
}
