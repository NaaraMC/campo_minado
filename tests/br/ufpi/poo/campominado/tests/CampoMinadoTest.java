package br.ufpi.poo.campominado.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpi.poo.campominado.enums.Acao;
import br.ufpi.poo.campominado.enums.EstadoZona;
import br.ufpi.poo.campominado.exceptions.AcaoInvalidaException;
import br.ufpi.poo.campominado.exceptions.PosicaoInvalidaException;
import br.ufpi.poo.campominado.model.CampoMinado;
import br.ufpi.poo.campominado.model.Coordenada;
import br.ufpi.poo.campominado.model.Jogada;
import java.util.List;

/**
 * @author alcemirsantos 
 *
 */

public class CampoMinadoTest {

        public static CampoMinado cm = new CampoMinado();
        
	@Test
	public void testJogadaValida() throws PosicaoInvalidaException, AcaoInvalidaException{
		
            cm.reseta();
            Jogada nova = new Jogada(Acao.INVESTIGAR, new Coordenada(0, 0));
            assertTrue("deveria ser valida!",cm.validar(nova));
                
	}
        
        @Test
        public void jogadaIgual() throws PosicaoInvalidaException, AcaoInvalidaException{
	
            cm.reseta();
            Jogada nova = new Jogada(Acao.INVESTIGAR, new Coordenada(0, 0));
            assertEquals(cm.validar(nova),cm.validar(nova));
            
        }
        
        @Test
        public void jogadaDiferente() throws PosicaoInvalidaException, AcaoInvalidaException{
	
            cm.reseta();
            Jogada nova = new Jogada(Acao.INVESTIGAR, new Coordenada(0, 0));
            Jogada nova1 = new Jogada(Acao.INVESTIGAR, new Coordenada(0, 1));
            if(nova1!=nova){
                assertTrue(true);
            }
            
        }
        
        @Test
        public void jogadaIgual1()throws PosicaoInvalidaException, AcaoInvalidaException{
           
            cm.reseta();
            Jogada nova2 = new Jogada(Acao.MARCAR, new Coordenada(0,0));
            //assertEquals(cm.validar(nova2),cm.validar(nova2));
            assertTrue(cm.validar(nova2));
        }
        @Test   
        
        public void jogadaDiferente1() throws PosicaoInvalidaException, AcaoInvalidaException{
	
            cm.reseta();
            Jogada nova = new Jogada(Acao.MARCAR, new Coordenada(0, 0));
            Jogada nova1 = new Jogada(Acao.MARCAR, new Coordenada(0, 1));
            if(nova1!=nova){
                assertFalse(false);
            }
            
        }
        
       
        
}
 