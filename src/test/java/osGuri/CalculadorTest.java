package osGuri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.*;

public class CalculadorTest{
    @Test
    @DisplayName("Testa se o metodo calcula  um numero de vida valido")
    public void testaCalculaNumeroDaVida() {
        FormatadorImpl mockFormatador = mock(FormatadorImpl.class);
        RedutorImpl mockRedutor = mock(RedutorImpl.class);
        when(mockRedutor.reducaoData("25/08/2000")).thenReturn(1);

        Calculador calculador = new Calculador(mockRedutor,mockFormatador);
        int result = calculador.calculaNumeroDaVida("25/08/2000");
        assertEquals(result,1);

    }

    @Test
    @DisplayName("Testa se o metodo calcula um numero de destino valido")
    public void calculaNumeroDestino() {
        FormatadorImpl mockFormatador = mock(FormatadorImpl.class);
        when(mockFormatador.formataFrase("Test")).thenReturn("Test2");
        RedutorImpl mockRedutor = mock(RedutorImpl.class);
        when(mockRedutor.reducaoData("Test2")).thenReturn(1);


        Calculador calculador = new Calculador(mockRedutor,mockFormatador);
        int result = calculador.calculaNumeroDaVida("Teste");
        assertEquals(result,1);

    }



}


