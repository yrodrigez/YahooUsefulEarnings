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
 * Generated by: "https://query2.finance.yahoo.com/v10/finance/quoteSummary/AAPL?formatted=true&modules=cashflowStatementHistory"
 * key to find in jackson: cashflowStatements
 * CashFlowStatement will have list of objects will be called CashFlowStatements
 *
 * @author Yago Rodríguez
 */

@Entity(name = "Cash Flow Statement")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CashFlowStatement extends CompanyData {

  @JsonProperty("endDate")
  @ObservableField(name = "End date", fieldType = FieldType.NUMERIC)
  private Field endDate;
  
  @JsonProperty("netIncome")  
  @ObservableField(name = "Net income", fieldType = FieldType.NUMERIC)
  private LongFormatField netIncome;
  
  @JsonProperty("depreciation")
  @ObservableField(name = "Depreciation", fieldType = FieldType.NUMERIC)
  private LongFormatField depreciation;
  
  @JsonProperty("changeToNetincome")
  @ObservableField(name = "Change to net income", fieldType = FieldType.NUMERIC)
  private LongFormatField changeToNetincome;
  
  @JsonProperty("changeToAccountReceivables")
  @ObservableField(name = "Change to Account Receivables", fieldType = FieldType.NUMERIC)
  private LongFormatField changeToAccountReceivables;
  
  @JsonProperty("changeToLiabilities")
  @ObservableField(name = "Change to liabilities", fieldType = FieldType.NUMERIC)
  private LongFormatField changeToLiabilities;
  
  @JsonProperty("changeToInventory")
  @ObservableField(name = "Change to inventory", fieldType = FieldType.NUMERIC)
  private LongFormatField changeToInventory;
  
  @JsonProperty("changeToOperatingActivities")
  @ObservableField(name = "Change to operating activities", fieldType = FieldType.NUMERIC)
  private LongFormatField changeToOperatingActivities;
  
  @JsonProperty("totalCashFromOperatingActivities")
  @ObservableField(name = "Total cash from operating activities", fieldType = FieldType.NUMERIC)
  private LongFormatField totalCashFromOperatingActivities;
  
  @JsonProperty("capitalExpenditures")
  @ObservableField(name = "Capital Expenditures", fieldType = FieldType.NUMERIC)
  private LongFormatField capitalExpenditures;
  
  @JsonProperty("investments")
  @ObservableField(name = "Investments", fieldType = FieldType.NUMERIC)
  private LongFormatField investments;
  
  @JsonProperty("otherCashflowsFromInvestingActivities")
  @ObservableField(name = "Other cashflows from investing", fieldType = FieldType.NUMERIC)
  private LongFormatField otherCashflowsFromInvestingActivities;

  @JsonProperty("totalCashflowsFromInvestingActivities")
  @ObservableField(name = "Total cashflow from investing activities", fieldType = FieldType.NUMERIC)
  private LongFormatField totalCashflowsFromInvestingActivities;

  @JsonProperty("dividendsPaid")
  @ObservableField(name = "Dividends paid", fieldType = FieldType.NUMERIC)
  private LongFormatField dividendsPaid;

  @JsonProperty("salePurchaseOfStock")
  @ObservableField(name = "Sale purchase of stock", fieldType = FieldType.NUMERIC)
  private LongFormatField salePurchaseOfStock;

  @JsonProperty("netBorrowings")
  @ObservableField(name = "Net borrowings", fieldType = FieldType.NUMERIC)
  private LongFormatField netBorrowings;

  @JsonProperty("otherCashflowsFromFinancingActivities")
  @ObservableField(name = "Other cashflows from financing activities", fieldType = FieldType.NUMERIC)
  private LongFormatField otherCashflowsFromFinancingActivities;

  @JsonProperty("totalCashFromFinancingActivities")
  @ObservableField(name = "Totalca", fieldType = FieldType.NUMERIC)
  private LongFormatField totalCashFromFinancingActivities;

  @JsonProperty("changeInCash")
  private LongFormatField changeInCash;

  public Field getEndDate() {
    return endDate;
  }

  public void setEndDate(Field endDate) {
    this.endDate = endDate;
  }

  public LongFormatField getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(LongFormatField netIncome) {
    this.netIncome = netIncome;
  }

  public LongFormatField getDepreciation() {
    return depreciation;
  }

  public void setDepreciation(LongFormatField depreciation) {
    this.depreciation = depreciation;
  }

  public LongFormatField getChangeToNetincome() {
    return changeToNetincome;
  }

  public void setChangeToNetincome(LongFormatField changeToNetincome) {
    this.changeToNetincome = changeToNetincome;
  }

  public LongFormatField getChangeToAccountReceivables() {
    return changeToAccountReceivables;
  }

  public void setChangeToAccountReceivables(LongFormatField changeToAccountReceivables) {
    this.changeToAccountReceivables = changeToAccountReceivables;
  }

  public LongFormatField getChangeToLiabilities() {
    return changeToLiabilities;
  }

  public void setChangeToLiabilities(LongFormatField changeToLiabilities) {
    this.changeToLiabilities = changeToLiabilities;
  }

  public LongFormatField getChangeToInventory() {
    return changeToInventory;
  }

  public void setChangeToInventory(LongFormatField changeToInventory) {
    this.changeToInventory = changeToInventory;
  }

  public LongFormatField getChangeToOperatingActivities() {
    return changeToOperatingActivities;
  }

  public void setChangeToOperatingActivities(LongFormatField changeToOperatingActivities) {
    this.changeToOperatingActivities = changeToOperatingActivities;
  }

  public LongFormatField getTotalCashFromOperatingActivities() {
    return totalCashFromOperatingActivities;
  }

  public void setTotalCashFromOperatingActivities(LongFormatField totalCashFromOperatingActivities) {
    this.totalCashFromOperatingActivities = totalCashFromOperatingActivities;
  }

  public LongFormatField getCapitalExpenditures() {
    return capitalExpenditures;
  }

  public void setCapitalExpenditures(LongFormatField capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
  }

  public LongFormatField getInvestments() {
    return investments;
  }

  public void setInvestments(LongFormatField investments) {
    this.investments = investments;
  }

  public LongFormatField getOtherCashflowsFromInvestingActivities() {
    return otherCashflowsFromInvestingActivities;
  }

  public void setOtherCashflowsFromInvestingActivities(LongFormatField otherCashflowsFromInvestingActivities) {
    this.otherCashflowsFromInvestingActivities = otherCashflowsFromInvestingActivities;
  }

  public LongFormatField getTotalCashflowsFromInvestingActivities() {
    return totalCashflowsFromInvestingActivities;
  }

  public void setTotalCashflowsFromInvestingActivities(LongFormatField totalCashflowsFromInvestingActivities) {
    this.totalCashflowsFromInvestingActivities = totalCashflowsFromInvestingActivities;
  }

  public LongFormatField getDividendsPaid() {
    return dividendsPaid;
  }

  public void setDividendsPaid(LongFormatField dividendsPaid) {
    this.dividendsPaid = dividendsPaid;
  }

  public LongFormatField getSalePurchaseOfStock() {
    return salePurchaseOfStock;
  }

  public void setSalePurchaseOfStock(LongFormatField salePurchaseOfStock) {
    this.salePurchaseOfStock = salePurchaseOfStock;
  }

  public LongFormatField getNetBorrowings() {
    return netBorrowings;
  }

  public void setNetBorrowings(LongFormatField netBorrowings) {
    this.netBorrowings = netBorrowings;
  }

  public LongFormatField getOtherCashflowsFromFinancingActivities() {
    return otherCashflowsFromFinancingActivities;
  }

  public void setOtherCashflowsFromFinancingActivities(LongFormatField otherCashflowsFromFinancingActivities) {
    this.otherCashflowsFromFinancingActivities = otherCashflowsFromFinancingActivities;
  }

  public LongFormatField getTotalCashFromFinancingActivities() {
    return totalCashFromFinancingActivities;
  }

  public void setTotalCashFromFinancingActivities(LongFormatField totalCashFromFinancingActivities) {
    this.totalCashFromFinancingActivities = totalCashFromFinancingActivities;
  }

  public LongFormatField getChangeInCash() {
    return changeInCash;
  }

  public void setChangeInCash(LongFormatField changeInCash) {
    this.changeInCash = changeInCash;
  }
}
