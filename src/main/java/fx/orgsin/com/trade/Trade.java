package fx.orgsin.com.trade;

import fx.orgsin.com.dto.TradeDto;

/**
 * The trade, for FX investment, processes.
 */
public interface Trade {
    TradeDto getTradeInfo(int tradeId);
}
