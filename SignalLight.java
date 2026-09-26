public class SignalLight {

    // Private current color
    private String color;

    // Fixed ID
    private final String lightId;

    // Constructor
    public SignalLight(String lightId) {
        this.lightId = lightId;
        this.color = "RED";
    }

    // Move to the next color
    public void next() {

        if (color.equals("RED")) {
            color = "GREEN";
        }
        else if (color.equals("GREEN")) {
            color = "YELLOW";
        }
        else if (color.equals("YELLOW")) {
            color = "RED";
        }
    }

    // Read-only access to current color
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        SignalLight t = new SignalLight("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}
