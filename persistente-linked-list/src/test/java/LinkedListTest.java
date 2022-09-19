import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ucsal._20202.testequalidade.aula03.LinkedList;
import br.ucsal._20202.testequalidade.aula03.exception.InvalidElementException;

class LinkedListTest {

    public LinkedList<String> nomes;

    @BeforeEach
    void setup(){
        nomes = new LinkedList<>();
    }

    @Test
    void testAdd() throws InvalidElementException {
        LinkedList<Integer> list = new LinkedList<>();

        //Definir dados de entrada:
        Integer add1 = 3;
        Integer add2 = 2;
        Integer add3 = 1;

        //Definir a saída esperada:
        Integer a = 3;
        Integer b = 2;
        Integer c = 1;

        //Executar o método que está sendo testado:
        list.add(add1);
        list.add(add2);
        list.add(add3);

        //Obter a saída atual (resultado) e eomparar a saída esperada com a atual:
        assertAll("Testando",
            () -> assertEquals(a, list.get(0)),
            () -> assertEquals(b, list.get(1)),
            () -> assertEquals(c, list.get(2))
            );
    }

    @Test
    void testarAddElementInvalido(){
        //Dado de entrada inválida:
        String nomeInvalido = null;
        String msg = "The element can't be null";

        //Executar o método e comparar:
        InvalidElementException exception = assertThrows(InvalidElementException.class, () -> nomes.add(nomeInvalido));
        assertEquals(msg, exception.getMessage());
    }
}
