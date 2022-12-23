import java.util.HashMap;
import java.util.Map;

public enum MainDialog {
    EXIT(0), LIST(1),UNKNOWN(-0);

    private final int value;

    private static Map map = new HashMap<>();

    private MainDialog(int value) {
        this.value = value;
    }

    static {
        for (MainDialog mainDialog : MainDialog.values()) {
            map.put(mainDialog.value, mainDialog);
        }
    }

    public static MainDialog valueOf(int mainDialog ) {
        return (MainDialog) map.get(mainDialog);
    }

    public int getValue() {
        return value;
    }
}