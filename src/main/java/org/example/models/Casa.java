package org.example.models;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Casa {
    private int largura, altura;
    private List<Comodo> comodos;
    private List<Vao> vaos;

    public Casa (int largura, int altura) {
        this.altura = altura;
        this.largura = largura;
        this.comodos = new ArrayList<>();
        this.vaos= new ArrayList<>();
    }

    public void adicionarComodo(Comodo comodo) {
        comodos.add(comodo);
    }

    public void adicionarVao(Vao vao) { vaos.add(vao); }

    public void desenhar(Graphics g){
        g.drawRect(40, 40, largura, altura);

        for (Comodo comodo : this.comodos) {
            comodo.desenhar(g);
        }

        for (Vao vao : this.vaos) {
            vao.desenhar(g);
        }
    }


}
