
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




package osGuri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;


public class RedutorImplTest{
    public RedutorImpl(){

    }
    @Test
    @DisplayName("Testa se o metodo formata uma string valida")
    // Decodifica um caracter segundo a tabela Pitagorica
    public int tabPitagorica(char c){

    }

    // Decodifica um caracter segundo a tabela Chaldean
    public int tabChaldean(char c){

    }

    // Decodifica um caracter segundo a tabela selecionada
    public int decodChar(char c){

    }

    public String reducaoSimples(String str){

    }


    @Override
	public void setTipoTabela(TipoTabela tipo){

    }


    @Override
	public int reducaoPalavra(String palavra){

    }


    @Override
	public int reducaoFrase(String frase){

    }


    @Override
	public int reducaoData(String data){
    }
}
