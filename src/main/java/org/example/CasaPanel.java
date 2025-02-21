package org.example;

import org.example.enums.Abertura;
import org.example.enums.Orientacao;
import org.example.models.*;

import javax.swing.*;
import java.awt.*;

class CasaPanel extends JPanel {
    private Casa casa;

    public CasaPanel() {
        casa = new Casa(730,430);

        Comodo cozinha = new Comodo( "Cozinha",  50, 50, 220, 150);
        Comodo quarto1 = new Comodo( "Quarto 1",  50, 310, 200, 150);
        Comodo quarto2 = new Comodo( "Quarto 2",  370, 310, 200, 150);
        Comodo suite = new Comodo( "Suite",  580, 210, 180, 250);
        Comodo banheiro_suite = new Comodo( "Banheiro",  580, 50, 180, 150);
        Comodo sala = new Comodo("Sala" ,280, 50, 180, 150);
        Comodo banheiro = new Comodo( "Banheiro",260, 310, 100, 150);
        Comodo lavanderia = new Comodo( "Lavanderia",  470, 50, 100, 150);

        casa.adicionarComodo(sala);
        casa.adicionarComodo(quarto1);
        casa.adicionarComodo(quarto2);
        casa.adicionarComodo(suite);
        casa.adicionarComodo(banheiro_suite);
        casa.adicionarComodo(cozinha);
        casa.adicionarComodo(banheiro);
        casa.adicionarComodo(lavanderia);

        //Portas
        casa.adicionarVao(new Porta( 70, 200, 50, Orientacao.HORIZONTAL, Abertura.FORA));
        casa.adicionarVao(new Porta( 290, 200, 50, Orientacao.HORIZONTAL, Abertura.FORA));
        casa.adicionarVao(new Porta( 480, 200, 50, Orientacao.HORIZONTAL, Abertura.FORA));
        casa.adicionarVao(new Porta( 590, 200, 50, Orientacao.HORIZONTAL, Abertura.FORA));

        casa.adicionarVao(new Porta( 70, 300, 50, Orientacao.HORIZONTAL, Abertura.DENTRO));
        casa.adicionarVao(new Porta( 270, 300, 50, Orientacao.HORIZONTAL, Abertura.DENTRO));
        casa.adicionarVao(new Porta( 390, 300, 50, Orientacao.HORIZONTAL, Abertura.DENTRO));


        casa.adicionarVao(new Porta( 40, 230, 60, Orientacao.VERTICAL, Abertura.DENTRO));
        casa.adicionarVao(new Porta( 570, 230, 60, Orientacao.VERTICAL, Abertura.DENTRO));

        //Janelas
        // esquerda
        casa.adicionarVao(new Janela( 40, 70, 50,Orientacao.VERTICAL));
        // cima
        casa.adicionarVao(new Janela( 130, 40,80, Orientacao.HORIZONTAL));
        casa.adicionarVao(new Janela( 330, 40, 80, Orientacao.HORIZONTAL));
        casa.adicionarVao(new Janela( 500, 40, 30, Orientacao.HORIZONTAL));
        casa.adicionarVao(new Janela( 650, 40, 60, Orientacao.HORIZONTAL));
        // baixo
        casa.adicionarVao(new Janela( 130, 460,80, Orientacao.HORIZONTAL));
        casa.adicionarVao(new Janela( 280, 460, 30, Orientacao.HORIZONTAL));
        casa.adicionarVao(new Janela( 450, 460, 60, Orientacao.HORIZONTAL));
        casa.adicionarVao(new Janela( 650, 460, 80, Orientacao.HORIZONTAL));
        // direita
        casa.adicionarVao(new Janela( 760, 300, 80,Orientacao.VERTICAL));

        //Passagem
        casa.adicionarVao(new Passagem(270, 70, 90, Orientacao.VERTICAL));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        casa.desenhar(g);
    }
}

