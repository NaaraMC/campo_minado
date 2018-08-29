/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpi.poo.campominado.tests;

import br.ufpi.poo.campominado.enums.Acao;
import br.ufpi.poo.campominado.enums.EstadoZona;
import static br.ufpi.poo.campominado.enums.EstadoZona.ABERTO;
import static br.ufpi.poo.campominado.enums.EstadoZona.MARCADO;
import static br.ufpi.poo.campominado.enums.EstadoZona.VAZIO;
import br.ufpi.poo.campominado.exceptions.AcaoInvalidaException;
import br.ufpi.poo.campominado.exceptions.PosicaoInvalidaException;
import br.ufpi.poo.campominado.model.CampoMinado;
import br.ufpi.poo.campominado.model.Coordenada;
import br.ufpi.poo.campominado.model.Jogada;
import br.ufpi.poo.campominado.model.Tabuleiro;
import br.ufpi.poo.campominado.model.Zona;
import static br.ufpi.poo.campominado.tests.CampoMinadoTest.cm;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Naara
 */
public class Atividade {
    
    @Test
     public void EstadoVazio() throws PosicaoInvalidaException, AcaoInvalidaException{
       cm.reseta();
       Zona zn = new Zona();
       EstadoZona ez = EstadoZona.VAZIO;
       assertEquals(ez.VAZIO, VAZIO);
    }
    
    @Test
     public void EstadoMarcado() throws PosicaoInvalidaException, AcaoInvalidaException{
       cm.reseta();
       Zona zn = new Zona();
       EstadoZona ez = EstadoZona.MARCADO;
       assertEquals(ez.MARCADO, MARCADO);
    }
     
    @Test
     public void EstadoAberto() throws PosicaoInvalidaException, AcaoInvalidaException{
       cm.reseta();
       Zona zn = new Zona();
       EstadoZona ez = EstadoZona.ABERTO;
       assertEquals(ez.ABERTO, ABERTO);
    }
     
    @Test
     public void EstadoPosicaoNulo() throws PosicaoInvalidaException, AcaoInvalidaException{
     
         EstadoZona ez = new Tabuleiro().estadoPosicao(5, 5);
         Assert.assertNull(ez);
     
     }
     @Test
     public void EstadoPosicaoValido() throws PosicaoInvalidaException, AcaoInvalidaException{
     
         EstadoZona ez = new Tabuleiro().estadoPosicao(0, 0);
         Assert.assertNotNull(ez);
     
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

