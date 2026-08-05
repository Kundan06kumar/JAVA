public class TrafficSignal {
    public static void main(String[] args) {
        String signal = "RED";

        if (signal.equals("RED"))
            System.out.println("STOP");
        else if (signal.equals("YELLOW"))
            System.out.println("READY");
        else
            System.out.println("GO");
    }
}
