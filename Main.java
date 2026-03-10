import java.util.List;

public class Main {
    public static void main(String[] args) {

        PeripheralDevice a1 = new PeripheralDevice("M6800", "wireless", true);
        PeripheralDevice a2 = new PeripheralDevice("AsusTuf", "wired", false);
        PeripheralDevice a3 = new PeripheralDevice("ThinkPad", "wired", true);

        DeviceDriver d1 = new DeviceDriver("12", "1.0", false);
        DeviceDriver d2 = new DeviceDriver("28", "22.0", true);
        DeviceDriver d3 = new DeviceDriver("45", "1.0", true);

        a1.receiveUserInput();
        String response=a1.sendSignalToComputer();
        System.out.printf(response);

        a2.receiveOSCommands("Close");
        String response2 = a2.RespondToOS();
        System.out.printf(response2);

        String response3= a3.RespondToOS();
        System.out.println(response3);

        Signal sig=new Signal("F11");
        d1.receiveDeviceSignal(sig);

        System.out.println(d2.checkIfUpToDate());
    }
}