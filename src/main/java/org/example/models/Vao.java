package org.example.models;

import org.example.enums.Orientacao;

import java.awt.*;

public abstract class Vao {
    int x, y, comp;
    Enum<Orientacao> orientacao;

    public abstract void desenhar(Graphics g);

}
