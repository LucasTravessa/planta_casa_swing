package org.example.models;

import java.awt.*;

public class Comodo {
    private String tipoComodo;
    private int x, y, largura, altura;

    public Comodo(String tipoComodo, int x, int y, int largura, int altura) {
        this.tipoComodo = tipoComodo;
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public void desenhar(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x-10, y-10, largura+20, altura+20);
        g.drawRect(x, y, largura, altura);

        g.drawString(tipoComodo, x + largura / 4, y + altura / 2);
    }
}
