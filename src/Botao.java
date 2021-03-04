public class Botao {
    public class Botao extends JFrame{
        JSlider slider=new JSlider(0,200,0);//gerando um Slider
        public  Botao(){
            setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));//modificação no layout
            add(slider);//add um slider
        }
        public int getValorSlide(){
            return slider.getValue();//pega o valor do Slider
        }
        public void addChangeListener(ChangeListener cl){
            this.slider.addChangeListener(cl);
        }
        
    }
}
