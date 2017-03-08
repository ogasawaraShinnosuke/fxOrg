package fx.orgsin.com.value;

import fx.orgsin.com.value.interfaces.KeyValue;

/**
 * Action Enum.
 */
public enum TradeAction implements KeyValue<Integer, String> {
    LONG(1, "購入"), SHORT(2, "売却"), DEPOSIT(3, "保証金");

    private int key;
    private String name;

    TradeAction(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public static boolean isPosition(TradeAction ta) {
        return LONG == ta || SHORT == ta;
    }

    public Integer getKey() {
        return this.key;
    }

    public String getValue() {
        return this.name;
    }
}
