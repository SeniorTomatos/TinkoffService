package com.startois.tinkoffservice.controller;

import com.startois.tinkoffservice.dto.FigiesDto;
import com.startois.tinkoffservice.dto.StockPricesDto;
import com.startois.tinkoffservice.dto.StocksDto;
import com.startois.tinkoffservice.dto.TickersDto;
import com.startois.tinkoffservice.model.Stock;
import com.startois.tinkoffservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickers) {
        return stockService.getStocksByTickers(tickers);
    }

    @PostMapping("/prices")
    public StockPricesDto getPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPrices(figiesDto);
    }


}
