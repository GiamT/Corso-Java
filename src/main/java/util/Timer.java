package util;

/**
 * Timer è una classe di utilità per misurare il tempo trascorso tra la chiamata dei due metodi
 * start() e end()
 * L'accuratezza è al millisecondo
 */
public class Timer {
    private long startTime;
    private long endTime;

    public Timer() {
        // Costruttore vuoto
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    /**
     * Mi ritorna il tempo trascorso tra lo start() e l'end()
     * ovvero la differenza tra endTime e startTime in millisecondi
     */

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public double getElapsedTimeInSeconds() {
        return (endTime - startTime) / 1000.0; // Convert milliseconds to seconds
    }

    public static void main(String[] args) {
        // Utilizzo della classe Timer all'interno del blocco di codice principale
        Timer timer = new Timer();

        // Inizio del timer
        timer.start();

        // Codice il cui tempo di esecuzione vogliamo misurare
        // Inserisci qui il pezzo di codice da misurare

        // Fine del timer
        timer.end();

        // Tempo di esecuzione in millisecondi
        long elapsedTimeMillis = timer.getElapsedTime();
        System.out.println("Tempo di esecuzione in millisecondi: " + elapsedTimeMillis);

        // Tempo di esecuzione in secondi
        double elapsedTimeSeconds = timer.getElapsedTimeInSeconds();
        System.out.println("Tempo di esecuzione in secondi: " + elapsedTimeSeconds);
    }
}

