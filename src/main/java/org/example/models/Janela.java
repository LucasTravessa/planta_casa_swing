package org.example.models;

import org.example.enums.Orientacao;

import java.awt.*;

public class Janela extends Vao{
    private static final int largura= 10;
    public Janela(int x, int y,int comp, Orientacao orientacao){
        this.orientacao = orientacao;
        this.comp = comp;
        this.x=x;
        this.y = y;
    }

    public void desenhar(Graphics g) {
        g.setColor(Color.BLACK);
        if(orientacao == Orientacao.VERTICAL){
            g.drawRect(x, y, largura, comp);
            g.fillRect(x, y, largura, comp);
        }
        if(orientacao == Orientacao.HORIZONTAL){
            g.drawRect(x, y, comp, largura);
            g.fillRect(x, y, comp, largura);
        }
    }
}
