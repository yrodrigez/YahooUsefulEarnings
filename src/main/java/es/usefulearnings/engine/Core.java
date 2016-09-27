package es.usefulearnings.engine;

import es.usefulearnings.engine.connection.YahooLinks;
import es.usefulearnings.engine.filter.CompanyFilter;
import es.usefulearnings.engine.filter.Filter;
import es.usefulearnings.engine.filter.RestrictionValue;
import es.usefulearnings.engine.plugin.*;
import es.usefulearnings.entities.*;
import es.usefulearnings.utils.EntitiesPackage;
import es.usefulearnings.utils.NoStocksFoundException;
import es.usefulearnings.utils.ResourcesHelper;

import java.beans.IntrospectionException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class Core {

  private ArrayList<Plugin> companiesPlugins;

  private List<Stock> mStocks;

  public static Core getInstance() {
    return instance;
  }

  private static Core instance = new Core();

  private List<Filter> appliedFilters;

  private Core() {
    // Add companiesPlugins.
    companiesPlugins = new ArrayList<>();
    companiesPlugins.add(new ProfilePlugin());
    companiesPlugins.add(new BalanceSheetStatementsPlugin());
    companiesPlugins.add(new CalendarEventsPlugin());
    companiesPlugins.add(new CashFlowStatementsPlugin());
    companiesPlugins.add(new DefaultKeyStatisticsPlugin());
    companiesPlugins.add(new IncomeStatmentsPlugin());
    companiesPlugins.add(new FinancialDataPlugin());

    // get the available mStocks.
    try {
      mStocks = ResourcesHelper.getInstance().getAvailableStocks();
    } catch (NoStocksFoundException e) {
      throw new RuntimeException(e);
    }

    appliedFilters = new LinkedList<>();
  }

  /**
   * TODO: DELETE THIS
   * Sets all Company's data depending on it's modules.
   *
   * @param symbol Company's symbol in the selected stock.
   * @return a new Company with it's modules set.
   * @see YahooLinks for modules.
   * @see Company
   */
  public Company getSingleCompanyData(String symbol) {
    Company company = new Company();
    company.setSymbol(symbol);
    try {
      for (Plugin<Company> plugin :
        companiesPlugins) {
        plugin.addInfo(company);
      }

      return company;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return company;
  }

  public Map<String, Company> getAllCompanies() {
    Map<String, Company> companies = new TreeMap<>();

    for (Stock stock : mStocks) {
      companies.putAll(stock.getCompanies());
    }

    return companies;
  }

  public Map<String, Option> getAllOptions(){
    System.err.println("getAllOptions() -> not implemented yet...");
    return new TreeMap<>();
  }


  public Map<String, Company> getCompaniesFromStock(String stockName) throws IllegalArgumentException {
    for (Stock stock : mStocks) {
      if (stock.getName().equals(stockName)) {
        return stock.getCompanies();
      }
    }

    throw new IllegalArgumentException("Can not find a stock named " + stockName);
  }

  public ArrayList<Plugin> getCompanyPlugins() {
    return this.companiesPlugins;
  }

  public <E> void setEntityData(E entity) {
    if (entity != null) {
      if (entity instanceof Company) {
        setCompanyData((Company)entity);
      }

      if (entity instanceof Option) {
        // TODO implement method setOptionsChainData()
      }

      if (entity instanceof OptionChain) {
        // TODO implement method setOptionsChainData()
      }
    }
  }

  private void setCompanyData(Company settedCompany){
    mStocks.stream()
      .filter(
        stock -> stock.getName().equals(settedCompany.getStockName())
      )
      .forEach(
        stock -> stock.getCompanies().replace(settedCompany.getSymbol(), settedCompany)
      );
  }

  public void removeEntities(Collection<Entity> entitiesToRemove) {
    //TODO: implement remove for options & options chains.
    Collection<Company> companies = new ArrayList<>();
    // Collection<Option> options = new ArrayList<>();

    for (Entity e: entitiesToRemove) {
      if(e instanceof Company) {
        companies.add((Company)e);
      }else if (e instanceof Option){
        // options.add((Option)e);
        System.err.println("Remove empty Options not implemented yet");
      }else if(e instanceof OptionChain){
        // optionChains.add((OptionChain)e);
        System.err.println("Remove empty OptionChains not implemented yet");
      }
    }
    removeCompanies(companies);
  }

  public void removeCompanies(Collection<Company> companiesToRemove) {
    companiesToRemove.forEach(company ->
      getCompaniesFromStock(company.getStockName()).remove(company.getSymbol())
    );
  }

  public void setFromEntitiesPackage(EntitiesPackage entitiesPackage) {
    List<Stock> newStocks = new LinkedList<>();

    for(Company company : entitiesPackage.getCompanies().values()){
      List<Stock> stocks = newStocks.stream().filter(stock -> stock.getName().equals(company.getStockName())).collect(Collectors.toList());
      if(stocks.isEmpty()){
        Map<String, Company> map = new TreeMap<>();
        map.put(company.getSymbol(), company);
        newStocks.add(new Stock(company.getStockName(), map));
      } else {
        stocks.forEach(s-> s.putCompany(company));
      }
    }

    mStocks = newStocks;
  }


  public void applyFilter(Map<Field, RestrictionValue> parameters) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
    CompanyFilter companyFilter = new CompanyFilter(new HashSet<>(getAllCompanies().values()), parameters);
    appliedFilters.add(companyFilter);
    companyFilter.filter();
  }

}

