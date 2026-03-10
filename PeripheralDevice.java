import java.util.Scanner;

public class PeripheralDevice {
    // private variables

    String deviceID;
    String connectionType;
    boolean isConnected;

    // public methods

    public void receiveUserInput()
    {
        Scanner in = new Scanner(System.in);
        while (true) 
        {
            System.out.println("input:");
            try {
                isConnected=true;
                String input = in.nextLine();
                System.out.println(input);
                if(input=="x")
                {
                    break;
                }
            }
            catch (java.util.InputMismatchException e) {
                this.isConnected=false;
            }
        }
    }

    public void receiveOSCommands(String Command)
    {
        System.out.println("Recieved from the OS: " + Command + " DeviceID: " + this.deviceID);
    }

    public String RespondToOS()
    {
        StringBuffer sb = new StringBuffer();
        char ch[] = deviceID.toCharArray();
        for(int i = 0; i < ch.length; i++){
            String hex = Integer.toHexString(ch[i]);
            sb.append(hex);
        }
        String ans = sb.toString();
        return ans;
    }

    public String sendSignalToComputer()
    {
        if(isConnected)
        {
            return "1#ACCEPTED " + this.deviceID;
        }
        else
        {
            return "0#REFUSED " + this.deviceID;
        }
    }

}
