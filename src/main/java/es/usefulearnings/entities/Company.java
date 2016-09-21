package es.usefulearnings.entities;


import es.usefulearnings.annotation.EntityParameter;
import es.usefulearnings.annotation.EntityParameterType;
import es.usefulearnings.entities.company.*;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Representation of a company in this application
 *
 * @author Yago Rodríguez
 */

public class Company implements Serializable, Entity {
  @EntityParameter(name = "Symbol", entityType = EntityParameterType.IGNORE)
  private String symbol;

  @EntityParameter(name = "Stock", entityType = EntityParameterType.IGNORE)
  private String stockName;

  @EntityParameter(name = "Profile")
  private Profile profile;
  @EntityParameter(name = "Calendar events")
  private CalendarEvents calendarEvents;
  @EntityParameter(name = "Financial data")
  private FinancialData financialData;
  @EntityParameter(name = "Default key statistics")
  private DefaultKeyStatistics defaultKeyStatistics;

  @EntityParameter(name = "Cashflow statements", entityType = EntityParameterType.ARRAY_LIST)
  private ArrayList<CashFlowStatement> cashFlowStatements;
  @EntityParameter(name = "Income statements", entityType = EntityParameterType.ARRAY_LIST)
  private ArrayList<IncomeStatement> incomeStatements;
  @EntityParameter(name = "Balance sheet statement" , entityType = EntityParameterType.ARRAY_LIST)
  private ArrayList<BalanceSheetStatement> balanceSheetStatements;

  /**
   * TODO DELETE THIS...
   */
  public Company() {
    profile = new Profile();
    calendarEvents = new CalendarEvents();
    financialData = new FinancialData();
    defaultKeyStatistics = new DefaultKeyStatistics();

    cashFlowStatements = new ArrayList<>();
    cashFlowStatements.add(new CashFlowStatement());

    incomeStatements = new ArrayList<>();
    incomeStatements.add(new IncomeStatement());

    balanceSheetStatements = new ArrayList<>();
    balanceSheetStatements.add(new BalanceSheetStatement());
  }

  public Company(String symbol, String stockName){
    this.symbol = symbol;
    this.stockName = stockName;

    profile = new Profile();
    calendarEvents = new CalendarEvents();
    financialData = new FinancialData();
    defaultKeyStatistics = new DefaultKeyStatistics();

    cashFlowStatements = new ArrayList<>();
    cashFlowStatements.add(new CashFlowStatement());

    incomeStatements = new ArrayList<>();
    incomeStatements.add(new IncomeStatement());

    balanceSheetStatements = new ArrayList<>();
    balanceSheetStatements.add(new BalanceSheetStatement());
  }


  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ArrayList<Field> getEarningsDates() {
    return this.calendarEvents.getEarningsDate();
  }

  public CalendarEvents getCalendarEvents() {
    return calendarEvents;
  }

  public void setCalendarEvents(CalendarEvents calendarEvents) {
    this.calendarEvents = calendarEvents;
    this.calendarEvents.set();
  }

  public FinancialData getFinancialData() {
    return financialData;
  }

  public void setFinancialData(FinancialData financialData) {
    this.financialData = financialData;
    this.financialData.set();
  }

  public DefaultKeyStatistics getDefaultKeyStatistics() {
    return defaultKeyStatistics;
  }

  public void setDefaultKeyStatistics(DefaultKeyStatistics defaultKeyStatistics) {
    this.defaultKeyStatistics = defaultKeyStatistics;
    this.defaultKeyStatistics.set();
  }

  public ArrayList<CashFlowStatement> getCashFlowStatements() {
    return cashFlowStatements;
  }

  public void setCashFlowStatements(ArrayList<CashFlowStatement> cashFlowStatements) {
    this.cashFlowStatements = cashFlowStatements;
    this.calendarEvents.set();
  }

  public ArrayList<IncomeStatement> getIncomeStatements() {
    return incomeStatements;
  }

  public void setIncomeStatements(ArrayList<IncomeStatement> incomeStatements) {
    this.incomeStatements = incomeStatements;
    this.incomeStatements.forEach(incomeStatement -> incomeStatement.set());
  }

  public ArrayList<BalanceSheetStatement> getBalanceSheetStatements() {
    return balanceSheetStatements;
  }

  public void setBalanceSheetStatements(ArrayList<BalanceSheetStatement> balanceSheetStatements) {
    this.balanceSheetStatements = balanceSheetStatements;
    this.balanceSheetStatements.forEach(balanceSheetStatement -> balanceSheetStatement.set());
  }

  public Profile getProfile() {
    return profile;
  }

  public void setProfile(Profile profile) {
    this.profile = profile;
    this.profile.set();
  }

  @Override
  public String toString(){
    return this.symbol;
  }

  public String getStockName() {
    return this.stockName;
  }

  @Override
  public boolean isEmpty() {
    return !(profile.isSet() || calendarEvents.isSet() || financialData.isSet() || defaultKeyStatistics.isSet()
      || cashFlowStatements.isEmpty() || incomeStatements.isEmpty());
  }
}
