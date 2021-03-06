package es.usefulearnings.entities.company.allowedvalues;

import es.usefulearnings.annotation.AllowedValuesRetriever;
import es.usefulearnings.engine.Core;
import es.usefulearnings.entities.company.OptionLink;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OptionCurrencyAllowedValues implements AllowedValuesRetriever {
  @Override
  public Collection<String> getAllowedValues() {
    Set<String> values = new HashSet<>();
    Core.getInstance().getAllCompanies().values().forEach(company -> {

      ArrayList<OptionLink> puts = company.getOptionChain().getPuts();
      if(puts != null && puts.size() > 0){
        puts.forEach(optionLink -> {
          if(optionLink.getCurrency() != null && !optionLink.getCurrency().equals(""))
            values.add(optionLink.getCurrency());
        });
      }

      ArrayList<OptionLink> calls = company.getOptionChain().getCalls();
      if(calls != null && calls.size() > 0){
        calls.forEach(optionLink -> {
          if(optionLink.getCurrency() != null && !optionLink.getCurrency().equals(""))
            values.add(optionLink.getCurrency());
        });
      }
    });

    return values;
  }
}
