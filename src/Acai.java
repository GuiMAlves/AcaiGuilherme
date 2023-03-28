import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Acai {
    private Integer tamanho;
    private BigDecimal valor;
    private Boolean acrescimo;

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(Boolean acrescimo) {
        this.acrescimo = acrescimo;
    }

    public BigDecimal calcularValor() throws Exception {

        if (tamanho == 300) {
            valor = new BigDecimal(8.00);
        } else if (tamanho == 500) {
            valor = new BigDecimal(10.00);
        } else if (tamanho == 700) {
            valor = new BigDecimal(12.00);
        } else {
            throw new Exception("Inviável");
        }

        if (acrescimo == true) {
            valor = valor.add(new BigDecimal(2.00));
        }

        return valor;
    }
}
