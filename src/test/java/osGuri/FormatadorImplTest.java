package osGuri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FormatadorImplTest {
    @Test
    @DisplayName("Testa se o metodo formata uma string valida")
    public void testaFormatacaoValida() {
        FormatadorImpl formatador = new FormatadorImpl();
        String result = formatador.formataPalavra("HelloWorld");
        assertEquals("HELLOWORLD", result); 
    }

    @Test
    @DisplayName("Testa se o metodo formata uma string invalida")
    public void testaFormatacaoInValida() {
        FormatadorImpl formatador = new FormatadorImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            formatador.formataPalavra("H]ello World");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            formatador.formataPalavra("");
        });
    }

    
}