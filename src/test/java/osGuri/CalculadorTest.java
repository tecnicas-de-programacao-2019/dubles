
package osGuri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadorTest{
    @Test
    @DisplayName("Testa se o metodo calcula um numero de vida valido")
    public void testaCalculaNumeroDaVida() {
        mockFormatador = mock(FormatadorImpl.class);
        mockRedutor = mock(RedutorImpl.class);
        when(mockRedutor.reducaoData("25/08/2000")).thenReturn(1);


        Calculador calculador = new FormatadorImpl(mockRedutor,mockFormatador);
        int result = calculador.calculaNumeroDaVida("25/08/2000");
        assertEquals(result,1);

    }

    @Test
    @DisplayName("Testa se o metodo calcula um numero de destino valido")
    public void calculaNumeroDestino() {
        mockFormatador = mock(FormatadorImpl.class);
        when(mockFormatador.formataFrase("Test")).thenReturn("Test2");
        mockRedutor = mock(RedutorImpl.class);
        when(reducao.reducaoData("Test2")).thenReturn(1);


        Calculador calculador = new FormatadorImpl(mockRedutor,mockFormatador);
        int result = calculador.calculaNumeroDaVida("Teste");
        assertEquals(result,1);

    }



}


