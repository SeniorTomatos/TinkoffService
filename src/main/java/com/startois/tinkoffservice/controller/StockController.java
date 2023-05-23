package com.startois.tinkoffservice.controller;

import com.startois.tinkoffservice.model.Stock;
import com.startois.tinkoffservice.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;

public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(String ticker) {
        return stockService.getStockByTicker(ticker);
    }
}
