package es.yahoousefulearnings.entities.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import es.yahoousefulearnings.engine.Field;
import es.yahoousefulearnings.engine.LongFormatField;

import java.util.ArrayList;

/**
 * Generated by: "https://query2.finance.yahoo.com/v10/finance/quoteSummary/AAPL?formatted=true&modules=calendarEvents"
 * key to find in jackson: calendarEvents
 *
 * @author Yago Rodríguez
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CalendarEvents extends CompanyData {

  @JsonProperty("earnings")
  private Earnings earnings;

  @JsonProperty("exDividendDate")
  private Field exDividendDate;
  @JsonProperty("dividendDate")
  private Field dividendDate;

  public ArrayList<Field> getEarningsDate() {
    return this.earnings.getEarningsDate();
  }

  public void setEarningsDate(ArrayList<Field> earningsDate) {
    this.earnings.setEarningsDate(earningsDate);
  }

  public Field getEarningsAverage() {
    return this.earnings.getEarningsAverage();
  }

  public void setEarningsAverage(Field earningsAverage) {
    this.earnings.setEarningsAverage(earningsAverage);
  }

  public Field getEarningsLow() {
    return this.earnings.getEarningsLow();
  }

  public void setEarningsLow(Field earningsLow) {
    this.earnings.setEarningsLow(earningsLow);
  }

  public Field getEarningsHigh() {
    return this.earnings.getEarningsHigh();
  }

  public void setEarningsHigh(Field earningsHigh) {
    this.earnings.setEarningsHigh(earningsHigh);
  }

  public LongFormatField getRevenueAverage() {
    return this.earnings.getRevenueAverage();
  }

  public void setRevenueAverage(LongFormatField revenueAverage) {
    this.earnings.setRevenueAverage(revenueAverage);
  }

  public LongFormatField getRevenueLow() {
    return this.earnings.getRevenueLow();
  }

  public LongFormatField getRevenueHigh() {
    return this.earnings.getRevenueHigh();
  }

  public void setRevenueLow(LongFormatField revenueLow) {
    this.earnings.setRevenueLow(revenueLow);
  }

  public Field getExDividendDate() {
    return exDividendDate;
  }

  public void setExDividendDate(Field exDividendDate) {
    this.exDividendDate = exDividendDate;
  }

  public Field getDividendDate() {
    return dividendDate;
  }

  public void setDividendDate(Field dividendDate) {
    this.dividendDate = dividendDate;
  }

  public Earnings getEarnings() {
    return earnings;
  }

  public void setEarnings(Earnings earnings) {
    this.earnings = earnings;
  }
}
