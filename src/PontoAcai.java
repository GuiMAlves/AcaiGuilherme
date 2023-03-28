import javax.swing.*;
import java.math.BigDecimal;

public class PontoAcai {
    public static void main(String[] args) {
        String medidastr = JOptionPane.showInputDialog("Escolha o tamanho do açaí, opções: \n 300 ml \n 500ml \n 700ml ");
        Integer medidaint = Integer.parseInt(medidastr);

        String acrescimostr = JOptionPane.showInputDialog("Haverá acréscimo de sorvete? \n Sim ou Não? ");
        Boolean acrescimobol = acrescimostr.equals("Sim")  ? true : false;

        Acai acai = new Acai();
        acai.setTamanho(medidaint);
        acai.setAcrescimo(acrescimobol);

        BigDecimal valorTotal;
        try {
            valorTotal = acai.calcularValor();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage());
            return;
        }
        JOptionPane.showMessageDialog(null,
                "Seu açaí ficou no valor de: " + valorTotal);
    }
}

