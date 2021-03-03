import java.swing.Swingtilities;
public class Teste {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){//oq é isso ??
            @Override
            public void run(){//ele faz a função aconteça
                createAndShowGUI();
            }
        
        });
    
        
    }
    public static void createAndShowGUI(){//eu posso cria a janela 
        new Janela();
    }
}
