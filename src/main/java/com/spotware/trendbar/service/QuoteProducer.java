package com.spotware.trendbar.service;

import com.spotware.trendbar.model.Quote;

public interface QuoteProducer {

    Quote nextQuote() throws InterruptedException;
}
