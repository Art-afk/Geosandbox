import java.util.HashMap;
import java.util.Map;

public enum MainDialog {
    UNKNOWN(-1),EXIT(0), LIST(1), CREATE_SHAPE(2);

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

        MainDialog key = (MainDialog) map.get(mainDialog);
        if(key == null){
            key = UNKNOWN;
        }
        return key;
    }

    public int getValue() {
        return value;
    }
}
