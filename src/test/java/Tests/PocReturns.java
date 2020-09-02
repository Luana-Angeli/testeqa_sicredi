package tests;

import org.junit.Test;

public class PocReturns {

    @Test
    public void poc(){
        Double valor = getMensagem().getNumero().retornaUmTrueOrFalse().retornaUmDouble();
        System.out.println(valor);
    }

    public PocReturns getMensagem(){
        String mensagem = "mensagem";
        return this;
    }

    public PocReturns getNumero(){
        int numero = 02;
        return this;
    }

    public PocReturns retornaUmTrueOrFalse(){
        boolean validacao = false;
        return this;
    }

    public double retornaUmDouble(){
        return 2.50;
    }

}
