package org.example.models;

import org.example.enums.Orientacao;

import java.awt.*;

public class Passagem extends Vao{
    private static final int largura= 10;

    public Passagem(int x, int y, int comp, Orientacao orientacao){
        this.orientacao = orientacao;
        this.x=x;
        this.y = y;
        this.comp = comp;
    }

    public void desenhar(Graphics g) {
        g.setColor(Color.BLACK);
        if(orientacao == Orientacao.VERTICAL){
            g.drawRect(x, y, largura, comp);
            g.setColor(Color.WHITE);
            g.fillRect(x-1, y+1, largura+2, comp-2);
        }
        if(orientacao == Orientacao.HORIZONTAL){
            g.drawRect(x, y, comp, largura);
            g.setColor(Color.WHITE);
            g.fillRect(x+1, y-1, comp-2, largura+2);
        }
    }
}
