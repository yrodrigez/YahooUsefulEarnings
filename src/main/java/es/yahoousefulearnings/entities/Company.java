package es.yahoousefulearnings.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import es.yahoousefulearnings.engine.Field;
import es.yahoousefulearnings.engine.LongFormatField;

public class Company {
  private class FinancialData {
    @JsonProperty("maxAge") private long maxAge; //86400,

    @JsonProperty("currentPrice") private Field currentPrice; //{"raw"40.9741,"fmt""40.97"},
    @JsonProperty("targetHighPrice") private Field targetHighPrice; //{"raw"50.0,"fmt""50.00"},
    @JsonProperty("targetLowPrice") private Field targetLowPrice; //{"raw"34.0,"fmt""34.00"},
    @JsonProperty("targetMeanPrice") private Field targetMeanPrice; //{"raw"43.34,"fmt""43.34"},
    @JsonProperty("targetMedianPrice") private Field targetMedianPrice; //{"raw"43.0,"fmt""43.00"},
    @JsonProperty("recommendationMean") private Field recommendationMean; //{"raw"1.9,"fmt""1.90"},
    @JsonProperty("recommendationKey") private String recommendationKey; //"buy",
    @JsonProperty("totalCashPerShare") private Field totalCashPerShare; //{"raw"3.89,"fmt""3.89"},
    @JsonProperty("quickRatio") private Field quickRatio; //{"raw"1.402,"fmt""1.40"},
    @JsonProperty("currentRatio") private Field currentRatio; //{"raw"1.726,"fmt""1.73"},
    @JsonProperty("returnOnAssets") private Field returnOnAssets; //{"raw"0.05136,"fmt""5.14%"},
    @JsonProperty("returnOnEquity") private Field returnOnEquity; //{"raw"0.10702,"fmt""10.70%"}
    @JsonProperty("earningsGrowth") private Field earningsGrowth; //{"raw"-0.151,"fmt""-15.10%"},
    @JsonProperty("revenueGrowth") private Field revenueGrowth; //{"raw"0.138,"fmt""13.80%"},
    @JsonProperty("grossMargins") private Field grossMargins; //{"raw"0.65647006,"fmt""65.65%"},
    @JsonProperty("ebitdaMargins") private Field ebitdaMargins; //{"raw"0.32906,"fmt""32.91%"},
    @JsonProperty("operatingMargins") private Field operatingMargins; //{"raw"0.26379,"fmt""26.38%"},
    @JsonProperty("profitMargins") private Field profitMargins; //{"raw"0.17228001,"fmt""17.23%"}

    @JsonProperty("numberOfAnalystOpinions") private LongFormatField numberOfAnalystOpinions; // {"raw"19,"fmt""19","longFmt""19"},
    @JsonProperty("totalCash") private LongFormatField totalCash; //{"raw"2872000000,"fmt""2.87B","longFmt""2,872,000,000"},
    @JsonProperty("ebitda") private LongFormatField ebitda; //{"raw"1592999936,"fmt""1.59B","longFmt""1,592,999,936"},
    @JsonProperty("totalDebt") private LongFormatField totalDebt; //{"raw"5840999936,"fmt""5.84B","longFmt""5,840,999,936"},
    @JsonProperty("totalRevenue") private LongFormatField totalRevenue; //{"raw"4840999936,"fmt""4.84B","longFmt""4,840,999,936"},
    @JsonProperty("debtToEquity") private LongFormatField debtToEquity; //{"raw"69.969,"fmt""69.97"},"revenuePerShare"{"raw"6.622,"fmt""6.62"},
    @JsonProperty("grossProfits") private LongFormatField grossProfits; //{"raw"3079000000,"fmt""3.08B", "longFmt""3,079,000,000"},
    @JsonProperty("freeCashflow") private LongFormatField freeCashflow; //{"raw"1875374976,"fmt""1.88B","longFmt""1,875,374,976"},
    @JsonProperty("operatingCashflow") private LongFormatField operatingCashflow; //{"raw"1292000000,"fmt""1.29B","longFmt""1,292,000,000"},


    public long getMaxAge() {
      return maxAge;
    }

    public void setMaxAge(long maxAge) {
      this.maxAge = maxAge;
    }

    public Field getCurrentPrice() {
      return currentPrice;
    }

    public void setCurrentPrice(Field currentPrice) {
      this.currentPrice = currentPrice;
    }

    public Field getTargetHighPrice() {
      return targetHighPrice;
    }

    public void setTargetHighPrice(Field targetHighPrice) {
      this.targetHighPrice = targetHighPrice;
    }

    public Field getTargetLowPrice() {
      return targetLowPrice;
    }

    public void setTargetLowPrice(Field targetLowPrice) {
      this.targetLowPrice = targetLowPrice;
    }

    public Field getTargetMeanPrice() {
      return targetMeanPrice;
    }

    public void setTargetMeanPrice(Field targetMeanPrice) {
      this.targetMeanPrice = targetMeanPrice;
    }

    public Field getTargetMedianPrice() {
      return targetMedianPrice;
    }

    public void setTargetMedianPrice(Field targetMedianPrice) {
      this.targetMedianPrice = targetMedianPrice;
    }

    public Field getRecommendationMean() {
      return recommendationMean;
    }

    public void setRecommendationMean(Field recommendationMean) {
      this.recommendationMean = recommendationMean;
    }

    public String getRecommendationKey() {
      return recommendationKey;
    }

    public void setRecommendationKey(String recommendationKey) {
      this.recommendationKey = recommendationKey;
    }

    public Field getTotalCashPerShare() {
      return totalCashPerShare;
    }

    public void setTotalCashPerShare(Field totalCashPerShare) {
      this.totalCashPerShare = totalCashPerShare;
    }

    public Field getQuickRatio() {
      return quickRatio;
    }

    public void setQuickRatio(Field quickRatio) {
      this.quickRatio = quickRatio;
    }

    public Field getCurrentRatio() {
      return currentRatio;
    }

    public void setCurrentRatio(Field currentRatio) {
      this.currentRatio = currentRatio;
    }

    public Field getReturnOnAssets() {
      return returnOnAssets;
    }

    public void setReturnOnAssets(Field returnOnAssets) {
      this.returnOnAssets = returnOnAssets;
    }

    public Field getReturnOnEquity() {
      return returnOnEquity;
    }

    public void setReturnOnEquity(Field returnOnEquity) {
      this.returnOnEquity = returnOnEquity;
    }

    public Field getEarningsGrowth() {
      return earningsGrowth;
    }

    public void setEarningsGrowth(Field earningsGrowth) {
      this.earningsGrowth = earningsGrowth;
    }

    public Field getRevenueGrowth() {
      return revenueGrowth;
    }

    public void setRevenueGrowth(Field revenueGrowth) {
      this.revenueGrowth = revenueGrowth;
    }

    public Field getGrossMargins() {
      return grossMargins;
    }

    public void setGrossMargins(Field grossMargins) {
      this.grossMargins = grossMargins;
    }

    public Field getEbitdaMargins() {
      return ebitdaMargins;
    }

    public void setEbitdaMargins(Field ebitdaMargins) {
      this.ebitdaMargins = ebitdaMargins;
    }

    public Field getOperatingMargins() {
      return operatingMargins;
    }

    public void setOperatingMargins(Field operatingMargins) {
      this.operatingMargins = operatingMargins;
    }

    public Field getProfitMargins() {
      return profitMargins;
    }

    public void setProfitMargins(Field profitMargins) {
      this.profitMargins = profitMargins;
    }

    public LongFormatField getNumberOfAnalystOpinions() {
      return numberOfAnalystOpinions;
    }

    public void setNumberOfAnalystOpinions(LongFormatField numberOfAnalystOpinions) {
      this.numberOfAnalystOpinions = numberOfAnalystOpinions;
    }

    public LongFormatField getTotalCash() {
      return totalCash;
    }

    public void setTotalCash(LongFormatField totalCash) {
      this.totalCash = totalCash;
    }

    public LongFormatField getEbitda() {
      return ebitda;
    }

    public void setEbitda(LongFormatField ebitda) {
      this.ebitda = ebitda;
    }

    public LongFormatField getTotalDebt() {
      return totalDebt;
    }

    public void setTotalDebt(LongFormatField totalDebt) {
      this.totalDebt = totalDebt;
    }

    public LongFormatField getTotalRevenue() {
      return totalRevenue;
    }

    public void setTotalRevenue(LongFormatField totalRevenue) {
      this.totalRevenue = totalRevenue;
    }

    public LongFormatField getDebtToEquity() {
      return debtToEquity;
    }

    public void setDebtToEquity(LongFormatField debtToEquity) {
      this.debtToEquity = debtToEquity;
    }

    public LongFormatField getGrossProfits() {
      return grossProfits;
    }

    public void setGrossProfits(LongFormatField grossProfits) {
      this.grossProfits = grossProfits;
    }

    public LongFormatField getFreeCashflow() {
      return freeCashflow;
    }

    public void setFreeCashflow(LongFormatField freeCashflow) {
      this.freeCashflow = freeCashflow;
    }

    public LongFormatField getOperatingCashflow() {
      return operatingCashflow;
    }

    public void setOperatingCashflow(LongFormatField operatingCashflow) {
      this.operatingCashflow = operatingCashflow;
    }
  }

}
