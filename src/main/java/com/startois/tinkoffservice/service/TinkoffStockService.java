package com.startois.tinkoffservice.service;

import com.startois.tinkoffservice.model.Stock;
import ru.tinkoff.invest.openapi.OpenApi;

public class TinkoffStockService implements StockService{
    private final OpenApi openApi;
    @Override
    public Stock getStockByTicker(String ticker) {
        var context = openApi.getMarketContext();
        var listCF = context.searchMarketInstrumentsByTicker(ticker);
        var list = listCF.join().getInstruments();
        if (list.isEmpty()) {
            
        }
        return null;
    }


}
