package com.spotware.trendbar.dao;

import java.util.List;

import com.spotware.trendbar.model.PeriodType;
import com.spotware.trendbar.model.Symbol;
import com.spotware.trendbar.model.TrendBar;

public interface TrendBarDao {

    void save(TrendBar trendbar);

    List<TrendBar> findByPeriod(Symbol symbol, PeriodType periodType, long from, long to);
}
