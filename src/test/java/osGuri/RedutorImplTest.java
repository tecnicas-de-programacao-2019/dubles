package osGuri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RedutorImplTest {
    @Test
    @DisplayName("Testa se o metodo reduz uma string valida")
    public void testaReducaoPalavra() {
        RedutorImpl redutor = new RedutorImpl();
        int result = redutor.reducaoPalavra("Hello");
        assertEquals("85336", result);
    }

    @Test
    @DisplayName("Testa se o metodo reduz uma string invalida")
    public void testaReducaoPalavraInValida() {
        RedutorImpl redutor = new RedutorImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            redutor.reducaoPalavra("H]ello");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            redutor.reducaoPalavra("");
        });
    }

    @Test
    @DisplayName("Testa se o metodo reduz uma frase valida")
    public void testaReducaoFrase() {
        RedutorImpl redutor = new RedutorImpl();
        int result = redutor.reducaoFrase("Hello ABC");
        assertEquals("85336123", result);
    }

    @Test
    @DisplayName("Testa se o metodo reduz uma frase invalida")
    public void testaReducaoFraseInValida() {
        RedutorImpl redutor = new RedutorImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            redutor.reducaoFrase("H]ello ABC");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            redutor.reducaoFrase("");
        });
    }

    @DisplayName("Testa se o metodo reduz uma data valida")
    public void testaReducaoData() {
        RedutorImpl redutor = new RedutorImpl();
        int result = redutor.reducaoData("22/06/1989");
        assertEquals("22061989", result);
    }

    @Test
    @DisplayName("Testa se o metodo reduz uma data invalida")
    public void testaReducaoDataInValida() {
        RedutorImpl redutor = new RedutorImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            redutor.reducaoData("22]06]1989");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            redutor.reducaoData("");
        });
    }

}
