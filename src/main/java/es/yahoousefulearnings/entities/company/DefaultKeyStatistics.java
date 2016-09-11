package es.yahoousefulearnings.entities.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import es.yahoousefulearnings.annotation.Entity;
import es.yahoousefulearnings.annotation.FieldType;
import es.yahoousefulearnings.annotation.ObservableField;
import es.yahoousefulearnings.entities.Field;
import es.yahoousefulearnings.entities.LongFormatField;

/**
 * Generated by: "https://query2.finance.yahoo.com/v10/finance/quoteSummary/AAPL?formatted=true&modules=defaultKeyStatistics"
 * key to find in jackson: defaultKeyStatistics
 *
 * @author Yago Rodríguez
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity(name = "Default Key Statistics")
public class DefaultKeyStatistics extends CompanyData {

  @JsonProperty("lastSplitFactor")
  @ObservableField(name = "Last split factor", fieldType = FieldType.STRING)
  private String lastSplitFactor;

  @JsonProperty("forwardPE")
  @ObservableField(name = "Forward price to earnings", fieldType = FieldType.NUMERIC)
  private Field forwardPE;

  @JsonProperty("profitMargins")
  @ObservableField(name = "Profit margins", fieldType = FieldType.NUMERIC)
  private Field profitMargins;

  @JsonProperty("heldPercentInsiders")
  @ObservableField(name = "Held percent insiders", fieldType = FieldType.NUMERIC)
  private Field heldPercentInsiders;

  @JsonProperty("heldPercentInstitutions")
  @ObservableField(name = "Held percent institutions", fieldType = FieldType.NUMERIC)
  private Field heldPercentInstitutions;

  @JsonProperty("shortRatio")
  @ObservableField(name = "Short ratio", fieldType = FieldType.NUMERIC)
  private Field shortRatio;

  @JsonProperty("shortPercentOfFloat")
  @ObservableField(name = "Short percent of float", fieldType = FieldType.NUMERIC)
  private Field shortPercentOfFloat;

  @JsonProperty("beta")
  @ObservableField(name = "Beta", fieldType = FieldType.NUMERIC)
  private Field beta;

  @JsonProperty("bookValue")
  @ObservableField(name = "Book value", fieldType = FieldType.NUMERIC)
  private Field bookValue;

  @JsonProperty("priceToBook")
  @ObservableField(name = "Price to book", fieldType = FieldType.NUMERIC)
  private Field priceToBook;

  @JsonProperty("lastFiscalYearEnd")
  @ObservableField(name = "Last fiscal Year End", fieldType = FieldType.NUMERIC)
  private Field lastFiscalYearEnd;

  @JsonProperty("nextFiscalYearEnd")
  private Field nextFiscalYearEnd;
  @JsonProperty("mostRecentQuarter")
  private Field mostRecentQuarter;
  @JsonProperty("earningsQuarterlyGrowth")
  private Field earningsQuarterlyGrowth;
  @JsonProperty("trailingEps")
  private Field trailingEps;
  @JsonProperty("forwardEps")
  private Field forwardEps;
  @JsonProperty("pegRatio")
  private Field pegRatio;
  @JsonProperty("lastSplitDate")
  private Field lastSplitDate;
  @JsonProperty("enterpriseToRevenue")
  private Field enterpriseToRevenue;
  @JsonProperty("enterpriseToEbitda")
  private Field enterpriseToEbitda;
  @JsonProperty("SandP52WeekChange")
  private Field sandP52WeekChange;

  @JsonProperty("floatShares")
  private LongFormatField floatShares;
  @JsonProperty("sharesOutstanding")
  private LongFormatField sharesOutstanding;
  @JsonProperty("sharesShort")
  private LongFormatField sharesShort;
  @JsonProperty("sharesShortPriorMonth")
  private LongFormatField sharesShortPriorMonth;
  @JsonProperty("netIncomeToCommon")
  private LongFormatField netIncomeToCommon;
  @JsonProperty("enterpriseValue")
  private LongFormatField enterpriseValue;

  public String getLastSplitFactor() {
    return lastSplitFactor;
  }

  public void setLastSplitFactor(String lastSplitFactor) {
    this.lastSplitFactor = lastSplitFactor;
  }

  public Field getForwardPE() {
    return forwardPE;
  }

  public void setForwardPE(Field forwardPE) {
    this.forwardPE = forwardPE;
  }

  public Field getProfitMargins() {
    return profitMargins;
  }

  public void setProfitMargins(Field profitMargins) {
    this.profitMargins = profitMargins;
  }

  public Field getHeldPercentInsiders() {
    return heldPercentInsiders;
  }

  public void setHeldPercentInsiders(Field heldPercentInsiders) {
    this.heldPercentInsiders = heldPercentInsiders;
  }

  public Field getHeldPercentInstitutions() {
    return heldPercentInstitutions;
  }

  public void setHeldPercentInstitutions(Field heldPercentInstitutions) {
    this.heldPercentInstitutions = heldPercentInstitutions;
  }

  public Field getShortRatio() {
    return shortRatio;
  }

  public void setShortRatio(Field shortRatio) {
    this.shortRatio = shortRatio;
  }

  public Field getShortPercentOfFloat() {
    return shortPercentOfFloat;
  }

  public void setShortPercentOfFloat(Field shortPercentOfFloat) {
    this.shortPercentOfFloat = shortPercentOfFloat;
  }

  public Field getBeta() {
    return beta;
  }

  public void setBeta(Field beta) {
    this.beta = beta;
  }

  public Field getBookValue() {
    return bookValue;
  }

  public void setBookValue(Field bookValue) {
    this.bookValue = bookValue;
  }

  public Field getPriceToBook() {
    return priceToBook;
  }

  public void setPriceToBook(Field priceToBook) {
    this.priceToBook = priceToBook;
  }

  public Field getLastFiscalYearEnd() {
    return lastFiscalYearEnd;
  }

  public void setLastFiscalYearEnd(Field lastFiscalYearEnd) {
    this.lastFiscalYearEnd = lastFiscalYearEnd;
  }

  public Field getNextFiscalYearEnd() {
    return nextFiscalYearEnd;
  }

  public void setNextFiscalYearEnd(Field nextFiscalYearEnd) {
    this.nextFiscalYearEnd = nextFiscalYearEnd;
  }

  public Field getMostRecentQuarter() {
    return mostRecentQuarter;
  }

  public void setMostRecentQuarter(Field mostRecentQuarter) {
    this.mostRecentQuarter = mostRecentQuarter;
  }

  public Field getEarningsQuarterlyGrowth() {
    return earningsQuarterlyGrowth;
  }

  public void setEarningsQuarterlyGrowth(Field earningsQuarterlyGrowth) {
    this.earningsQuarterlyGrowth = earningsQuarterlyGrowth;
  }

  public Field getTrailingEps() {
    return trailingEps;
  }

  public void setTrailingEps(Field trailingEps) {
    this.trailingEps = trailingEps;
  }

  public Field getForwardEps() {
    return forwardEps;
  }

  public void setForwardEps(Field forwardEps) {
    this.forwardEps = forwardEps;
  }

  public Field getPegRatio() {
    return pegRatio;
  }

  public void setPegRatio(Field pegRatio) {
    this.pegRatio = pegRatio;
  }

  public Field getLastSplitDate() {
    return lastSplitDate;
  }

  public void setLastSplitDate(Field lastSplitDate) {
    this.lastSplitDate = lastSplitDate;
  }

  public Field getEnterpriseToRevenue() {
    return enterpriseToRevenue;
  }

  public void setEnterpriseToRevenue(Field enterpriseToRevenue) {
    this.enterpriseToRevenue = enterpriseToRevenue;
  }

  public Field getEnterpriseToEbitda() {
    return enterpriseToEbitda;
  }

  public void setEnterpriseToEbitda(Field enterpriseToEbitda) {
    this.enterpriseToEbitda = enterpriseToEbitda;
  }

  public Field getSandP52WeekChange() {
    return sandP52WeekChange;
  }

  public void setSandP52WeekChange(Field sandP52WeekChange) {
    this.sandP52WeekChange = sandP52WeekChange;
  }

  public LongFormatField getFloatShares() {
    return floatShares;
  }

  public void setFloatShares(LongFormatField floatShares) {
    this.floatShares = floatShares;
  }

  public LongFormatField getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(LongFormatField sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }

  public LongFormatField getSharesShort() {
    return sharesShort;
  }

  public void setSharesShort(LongFormatField sharesShort) {
    this.sharesShort = sharesShort;
  }

  public LongFormatField getSharesShortPriorMonth() {
    return sharesShortPriorMonth;
  }

  public void setSharesShortPriorMonth(LongFormatField sharesShortPriorMonth) {
    this.sharesShortPriorMonth = sharesShortPriorMonth;
  }

  public LongFormatField getNetIncomeToCommon() {
    return netIncomeToCommon;
  }

  public void setNetIncomeToCommon(LongFormatField netIncomeToCommon) {
    this.netIncomeToCommon = netIncomeToCommon;
  }

  public LongFormatField getEnterpriseValue() {
    return enterpriseValue;
  }

  public void setEnterpriseValue(LongFormatField enterpriseValue) {
    this.enterpriseValue = enterpriseValue;
  }



  /*
  * *** NULL DATA ***
  @JsonProperty("revenueQuarterlyGrowth")
  private ObservableField revenueQuarterlyGrowth;
  @JsonProperty("morningStarOverallRating")
  private ObservableField morningStarOverallRating;
  @JsonProperty("morningStarRiskRating")
  private ObservableField morningStarRiskRating;
  @JsonProperty("category")
  private ObservableField category; // null,
  @JsonProperty("annualReportExpenseRatio")
  private ObservableField annualReportExpenseRatio;
  @JsonProperty("ytdReturn")
  private ObservableField ytdReturn;
  @JsonProperty("beta3Year")
  private ObservableField beta3Year;
  @JsonProperty("totalAssets")
  private ObservableField totalAssets;
  @JsonProperty("yield")
  private ObservableField yield;
  @JsonProperty("fundFamily")
  private ObservableField fundFamily; // null,
  @JsonProperty("fundInceptionDate")
  private ObservableField fundInceptionDate;
  @JsonProperty("legalType")
  private ObservableField legalType; // null,
  @JsonProperty("threeYearAverageReturn")
  private ObservableField threeYearAverageReturn;
  @JsonProperty("fiveYearAverageReturn")
  private ObservableField fiveYearAverageReturn;
  @JsonProperty("priceToSalesTrailing12Months")
  private ObservableField priceToSalesTrailing12Months;
  @JsonProperty("lastDividendValue")
  private ObservableField lastDividendValue;
  @JsonProperty("lastCapGain")
  private ObservableField lastCapGain;
  @JsonProperty("annualHoldingsTurnover")
  private ObservableField annualHoldingsTurnover;
   */

}
