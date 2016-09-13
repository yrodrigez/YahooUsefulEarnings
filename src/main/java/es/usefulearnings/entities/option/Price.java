package es.usefulearnings.entities.option;

import com.fasterxml.jackson.annotation.JsonProperty;
import es.usefulearnings.annotation.FieldType;
import es.usefulearnings.annotation.ObservableField;
import es.usefulearnings.entities.Field;
import es.usefulearnings.entities.LongFormatField;

import java.io.Serializable;

/**
 * Generated by: "https://query1.finance.yahoo.com/v10/finance/quoteSummary/OPTION_SYMBOL?modules=price"
 * key to find in jackson: price
 *
 * @author Yago Rodríguez
 */
public class Price extends OptionData implements Serializable {
  @JsonProperty("exchange")
  @ObservableField(name = "Exchange")
  private String exchange; // "OPR",

  @JsonProperty("exchangeName")
  @ObservableField(name = "Exchange name")
  private String exchangeName; // "OPR",

  @JsonProperty("marketState")
  @ObservableField(name = "Market state")
  private String marketState; // "REGULAR",

  @JsonProperty("quoteType")
  @ObservableField(name = "Quote type")
  private String quoteType; // "OPTION",

  @JsonProperty("symbol")
  @ObservableField(name = "Symbol")
  private String symbol; // "AAPL160812C00070000",

  @JsonProperty("underlyingSymbol")
  @ObservableField(name = "Company's symbol")
  private String underlyingSymbol; // "AAPL",

  @JsonProperty("currency")
  @ObservableField(name = "Currency")
  private String currency; // "USD",

  @JsonProperty("currencySymbol")
  @ObservableField(name = "Currency symbol")
  private String currencySymbol; // "$"

  @JsonProperty("regularMarketChangePercent")
  @ObservableField(name = "Regular market change percent", fieldType = FieldType.NUMERIC)
  private Field regularMarketChangePercent;

  @JsonProperty("regularMarketChange")
  @ObservableField(name = "Regular market change", fieldType = FieldType.NUMERIC)
  private Field regularMarketChange;

  @JsonProperty("regularMarketTime")
  @ObservableField(name = "Regular market time", fieldType = FieldType.DATE)
  private Field regularMarketTime; // 1470439901,

  @JsonProperty("regularMarketPrice")
  @ObservableField(name = "Regular market price", fieldType = FieldType.NUMERIC)
  private Field regularMarketPrice;

  @JsonProperty("regularMarketDayHigh")
  @ObservableField(name = "Regular market day high", fieldType = FieldType.NUMERIC)
  private Field regularMarketDayHigh;

  @JsonProperty("regularMarketDayLow")
  @ObservableField(name = "Regular market day low", fieldType = FieldType.NUMERIC)
  private Field regularMarketDayLow;

  @JsonProperty("regularMarketVolume")
  @ObservableField(name = "Regular market volume", fieldType = FieldType.NUMERIC)
  private LongFormatField regularMarketVolume;

  @JsonProperty("regularMarketPreviousClose")
  @ObservableField(name = "Regular market previous close", fieldType = FieldType.NUMERIC)
  private Field regularMarketPreviousClose;

  @JsonProperty("regularMarketSource")
  @ObservableField(name = "Regular market source", fieldType = FieldType.STRING)
  private Field regularMarketSource; // "DELAYED",

  @JsonProperty("regularMarketOpen")
  @ObservableField(name = "regular market open", fieldType = FieldType.NUMERIC)
  private Field regularMarketOpen;

  @JsonProperty("strikePrice")
  @ObservableField(name = "Strike price", fieldType = FieldType.NUMERIC)
  private Field strikePrice;

  @JsonProperty("openInterest")
  @ObservableField(name = "Open interest", fieldType = FieldType.NUMERIC)
  private LongFormatField openInterest;

  @JsonProperty("expireDate")
  @ObservableField(name = "Expiration date", fieldType = FieldType.DATE)
  private Field expireDate;

  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public String getMarketState() {
    return marketState;
  }

  public void setMarketState(String marketState) {
    this.marketState = marketState;
  }

  public String getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(String quoteType) {
    this.quoteType = quoteType;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }

  public void setUnderlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public Field getRegularMarketChangePercent() {
    return regularMarketChangePercent;
  }

  public void setRegularMarketChangePercent(Field regularMarketChangePercent) {
    this.regularMarketChangePercent = regularMarketChangePercent;
  }

  public Field getRegularMarketChange() {
    return regularMarketChange;
  }

  public void setRegularMarketChange(Field regularMarketChange) {
    this.regularMarketChange = regularMarketChange;
  }

  public Field getRegularMarketTime() {
    return regularMarketTime;
  }

  public void setRegularMarketTime(Field regularMarketTime) {
    this.regularMarketTime = regularMarketTime;
  }

  public Field getRegularMarketPrice() {
    return regularMarketPrice;
  }

  public void setRegularMarketPrice(Field regularMarketPrice) {
    this.regularMarketPrice = regularMarketPrice;
  }

  public Field getRegularMarketDayHigh() {
    return regularMarketDayHigh;
  }

  public void setRegularMarketDayHigh(Field regularMarketDayHigh) {
    this.regularMarketDayHigh = regularMarketDayHigh;
  }

  public Field getRegularMarketDayLow() {
    return regularMarketDayLow;
  }

  public void setRegularMarketDayLow(Field regularMarketDayLow) {
    this.regularMarketDayLow = regularMarketDayLow;
  }

  public LongFormatField getRegularMarketVolume() {
    return regularMarketVolume;
  }

  public void setRegularMarketVolume(LongFormatField regularMarketVolume) {
    this.regularMarketVolume = regularMarketVolume;
  }

  public Field getRegularMarketPreviousClose() {
    return regularMarketPreviousClose;
  }

  public void setRegularMarketPreviousClose(Field regularMarketPreviousClose) {
    this.regularMarketPreviousClose = regularMarketPreviousClose;
  }

  public Field getRegularMarketSource() {
    return regularMarketSource;
  }

  public void setRegularMarketSource(Field regularMarketSource) {
    this.regularMarketSource = regularMarketSource;
  }

  public Field getRegularMarketOpen() {
    return regularMarketOpen;
  }

  public void setRegularMarketOpen(Field regularMarketOpen) {
    this.regularMarketOpen = regularMarketOpen;
  }

  public Field getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(Field strikePrice) {
    this.strikePrice = strikePrice;
  }

  public LongFormatField getOpenInterest() {
    return openInterest;
  }

  public void setOpenInterest(LongFormatField openInterest) {
    this.openInterest = openInterest;
  }

  public Field getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Field expireDate) {
    this.expireDate = expireDate;
  }
}
