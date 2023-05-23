package com.startois.tinkoffservice.service;

import com.startois.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
