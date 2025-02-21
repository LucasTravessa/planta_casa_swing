package org.example.models;

import org.example.enums.Abertura;
import org.example.enums.Orientacao;

import java.awt.*;

public class Porta extends Vao{
    private Enum<Abertura> abertura;
    public Porta(int x, int y, int comp, Orientacao orientacao, Abertura abertura){
        this.abertura = abertura;
        this.orientacao = orientacao;
        this.x=x;
        this.y = y;
        this.comp = comp;
    }
    public void desenhar(Graphics g) {
        g.setColor(Color.BLACK);
        if(abertura == Abertura.DENTRO && orientacao == Orientacao.HORIZONTAL){
            g.drawLine(x, y, x, y + comp); // Batente
            g.drawArc(x- comp,y- comp, comp *2, comp *2, 0,-90); // Arco
        }
        if(abertura == Abertura.FORA && orientacao == Orientacao.HORIZONTAL){
            g.drawLine(x, y, x, y - comp); // Batente
            g.drawArc(x- comp,y- comp, comp *2, comp *2, 90,-90); // Arco
        }
        if(abertura == Abertura.DENTRO && orientacao == Orientacao.VERTICAL){
            g.drawLine(x, y, x+comp, y); // Batente
            g.drawArc(x- comp,y- comp, comp *2, comp *2, 0,-90); // Arco
        }
        if(abertura == Abertura.FORA && orientacao == Orientacao.VERTICAL){
            g.drawLine(x, y, x-comp, y); // Batente
            g.drawArc(x- comp,y- comp, comp *2, comp *2, 180,90); // Arco
        }
        new Passagem(x,y,comp,(Orientacao) orientacao).desenhar(g);

    }
}
