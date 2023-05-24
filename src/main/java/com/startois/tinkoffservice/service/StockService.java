package com.startois.tinkoffservice.service;

import com.startois.tinkoffservice.dto.FigiesDto;
import com.startois.tinkoffservice.dto.StockPricesDto;
import com.startois.tinkoffservice.dto.StocksDto;
import com.startois.tinkoffservice.dto.TickersDto;
import com.startois.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);

    StocksDto getStocksByTickers(TickersDto tickersDto);

    StockPricesDto getPrices(FigiesDto figiesDto);
}
