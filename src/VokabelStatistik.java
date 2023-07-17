public class VokabelStatistik {
    private int anzahl_trainings = 0;
    private int anzahl_erfolgreich = 0;

    public VokabelStatistik() {
    }

    public void updateTraining(boolean erfolg) {
        if (erfolg) {
            this.anzahl_erfolgreich++;
        }
        this.anzahl_trainings++;
    }

    public double getErfolgsquote() {
        if (this.anzahl_trainings > 0) {
            return (double) this.anzahl_erfolgreich / (double) this.anzahl_trainings;
        } else {
            return 0.0;
        }
    }
}