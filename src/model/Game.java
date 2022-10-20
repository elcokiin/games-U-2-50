package model;
/*
 * Interfaz que define los métodos start, play y finish de los dos juegos.
 * @author Diego Aguirre, Vicente Matallana, Samir Molinares
 * version 1.0
 */
public interface Game {
    public String start(String[] names);
    public String play();
    public String finish(String message);
}
