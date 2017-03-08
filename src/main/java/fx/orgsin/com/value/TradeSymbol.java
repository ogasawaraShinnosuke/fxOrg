package fx.orgsin.com.value;

import fx.orgsin.com.value.interfaces.KeyValue;

/**
 * Symbol Enum.
 */
public enum TradeSymbol implements KeyValue<Integer, String> {
    GBP(1, "ポンド"), USD(2, "ドル"), EUR(3, "ユーロ"),;

    private int key;
    private String name;

    TradeSymbol(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public Integer getKey() {
        return this.key;
    }

    public String getValue() {
        return this.name;
    }
}
