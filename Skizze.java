
import javafx.scene.canvas.GraphicsContext;
import java.time.LocalTime;
import javafx.scene.shape.ArcType;
import javafx.scene.text.*;

public class Skizze
{
  
       void draw(GraphicsContext gc){
        gc.clearRect(0,0,400,400);  // Bild löschen
        
        // Die neue Zeit holen!
        LocalTime localTime = LocalTime.now();
        int stunde = localTime.getHour();
        int minute = localTime.getMinute();
        int sekunde = localTime.getSecond();
        
        // Ausgabestring zusammensetzen
        String zeit = stunde + " : " + minute + " : " + sekunde;
        
        // String zeichnen
        gc.setLineWidth(1); // Setzt die Liniendicke auf 1
        gc.setFont(new Font(20));  //Sorgt für eine größere Schrift
        gc.setTextAlign(TextAlignment.CENTER);  // Text wird zentriert angezeigt
        gc.strokeText(zeit,200,200);
        
        // Setzt die Liniendicke auf 5
        gc.setLineWidth(5);  
        // Zeichnet einen Bogen
        gc.strokeArc(100,100,200,200,90-sekunde*6,sekunde*6, ArcType.OPEN);
        // gc.strokeArc(x,y,breite,hoehe,anfang,laenge,typ)      

    }

}
