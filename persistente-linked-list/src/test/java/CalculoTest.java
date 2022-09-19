import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import br.ucsal._20202.testequalidade.aula03.util.CalculoUtil;

class CalculoTest {  
    
    //@Test
    //@Disabled - desabilita teste abaixo.
    @DisplayName("Fatorial de 5")
    void testFatorial() {
        //Definir dados de entrada:
        int n = 5;

        //Definir a saída esperada:
        long fatorialEsperado = 120;

        //Executar o método que está sendo testado e obter a saída atual (resultado):
        long fatorialAtual = CalculoUtil.calcularFatorial(n);
        
        if (fatorialEsperado != fatorialAtual) {
            System.out.println("Diferentes");
        }else{
            System.out.println("Executado com sucesso");
        }

        //Comparar a saída esperada com a atual:
        Assertions.assertEquals(fatorialEsperado, fatorialAtual);
    }
}
