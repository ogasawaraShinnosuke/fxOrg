package fx.orgsin.com.dto;

import fx.orgsin.com.value.TradeAction;
import fx.orgsin.com.value.TradeSymbol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sinnosuke on 2017/03/08.
 */
public class TradeDto {

    List<Settlement> dailySettlement = new ArrayList<>();

    public boolean isWin() {
        return this.dailySettlement.stream().anyMatch(v -> v.isWin());
    }

    /**
     * One trade settlement.
     */
    public class Settlement {
        private Date openDate;
        private Date closeDate;
        private TradeSymbol symbol;
        private TradeAction action;
        private double lot;
        private double openPrice;
        private double closePrice;
        private double pips;
        private int netProfit;
        private long span;
        private double profitAndLoss;

        public boolean isWin() {
            return this.netProfit >= 0;
        }
    }
}
