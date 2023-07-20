import java.time.LocalDate;

public class VokabelStatistik {
    private int anzahl_trainings = 0;
    private int anzahl_erfolgreich = 0;
    private int anzahlLetzteErfolgsreihe = 0;
    private LocalDate letztesTraining= LocalDate.MIN;


    public VokabelStatistik() {
        letztesTraining = LocalDate.now();
    }
//TODO
// wenn noch keine Trainings gelaufen sind, sollte
// letztes Training den Wert LocalDate.MIN haben
    public void updateTraining(boolean erfolg) {
        this.anzahl_trainings++;
        if (erfolg) {
            this.anzahl_erfolgreich++;
            this.anzahlLetzteErfolgsreihe++;
        }else {
            this.anzahlLetzteErfolgsreihe = 0;
        }
    }

    public double getErfolgsquote() {
        if (this.anzahl_trainings > 0) {
            return (double) this.anzahl_erfolgreich / (double) this.anzahl_trainings;
        } else {
            return 0.0;
        }
    }

    public LocalDate getTraingsdatum(){
        return this.letztesTraining;
    }

    public int getErfolgsreihe(){
        return this.anzahlLetzteErfolgsreihe;
    }
}