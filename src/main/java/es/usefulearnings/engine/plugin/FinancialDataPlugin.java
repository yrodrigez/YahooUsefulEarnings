package es.usefulearnings.engine.plugin;

import com.fasterxml.jackson.databind.JsonNode;
import es.usefulearnings.engine.connection.YahooFinanceAPI;
import es.usefulearnings.entities.Company;
import es.usefulearnings.entities.company.FinancialData;

import java.io.IOException;

/**
 * ${PATH}
 * Created by yago on 12/09/16.
 */
public class FinancialDataPlugin extends YahooFinanceAPIPlugin{
  @Override
  protected String getValueToSearch() {
    return "financialData";
  }

  @Override
  protected String getModuleName() {
    return YahooFinanceAPI.COMPANY_FINANCIAL_DATA;
  }

  @Override
  protected void processJsonNode(Company company, JsonNode node) throws IOException {
    FinancialData financialData = mapper.readValue(node.traverse(), FinancialData.class);
    company.setFinancialData(financialData);
  }
}
