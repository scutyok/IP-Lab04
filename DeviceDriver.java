public class DeviceDriver {
    // Atribute conform diagramei
    private String driverId;
    private String version;
    private boolean isUpToDate;

    // Constructor
    public DeviceDriver(String driverId, String version, boolean isUpToDate) {
        this.driverId = driverId;
        this.version = version;
        this.isUpToDate = isUpToDate;
    }

    // Metodele din diagrama UML

    public void receiveDeviceSignal(Signal signal) {
        System.out.println("Semnal primit de la dispozitiv: " + signal);
        // Aici se procesează semnalul brut
    }

    public boolean checkIfUpToDate() {
        System.out.println("Se verifică versiunea driverului " + driverId);
        return isUpToDate;
    }

    public OSCommand convertSignalForOS() {
        System.out.println("Conversia semnalului în comandă OS...");
        // Logica de conversie
        return new OSCommand("Comandă procesată");
    }

    public void alertOutdatedOrMissing() {
        if (!isUpToDate) {
            System.out.println("ALERTĂ: Driverul " + driverId + " este învechit sau lipsește!");
        }
    }

    // Getters și Setters (opțional, pentru bune practici)
    public String getDriverId() {
        return driverId;
    }

    public String getVersion() {
        return version;
    }
}

// Clase suport pentru a evita erorile de compilare
class Signal {
    private String data;

    public Signal(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}

class OSCommand {
    private String command;

    public OSCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return command;
    }
}