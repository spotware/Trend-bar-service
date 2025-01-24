package com.spotware.trendbar.service;

import com.spotware.trendbar.model.Quote;

public interface TrendBarsAggregateService {
    void consume(Quote quote) throws InterruptedException;
}

