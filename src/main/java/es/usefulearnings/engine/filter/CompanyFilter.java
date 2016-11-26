package es.usefulearnings.engine.filter;

import es.usefulearnings.annotation.EntityParameter;
import es.usefulearnings.annotation.ParameterType;
import es.usefulearnings.entities.Company;
import es.usefulearnings.entities.YahooField;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Yago.
 */
public class CompanyFilter extends Filter<Company> {

  public CompanyFilter(Set<Company> companies, Map<Field, RestrictionValue> parameters) {
    super(companies, parameters);
  }


  @Override
  public void filter() throws IllegalAccessException, IntrospectionException, InvocationTargetException {
    Set<Company> listToIterate = new HashSet<>(_filteredEntities);
    for(Company company: listToIterate){
      applyFilter(company, Company.class, company);
    }
  }

  @SuppressWarnings("unchecked")
  private <E> void applyFilter(
    Company company,
    Class<?> elementType,
    E elementValue
  ) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
    for (Field field : elementType.getDeclaredFields()) {
      if (field.getAnnotation(EntityParameter.class) != null) {
        ParameterType parameterType = field.getAnnotation(EntityParameter.class).parameterType();
        for (PropertyDescriptor pd : Introspector.getBeanInfo(elementType).getPropertyDescriptors()) {
          if (pd.getName().equals(field.getName())) {

            switch (parameterType) {
/*--------------------------------------------------------------------------------------------------------------------*/
              case INNER_CLASS:
                if (elementValue == null) {
                  applyFilter(company, pd.getPropertyType(), null);
                  break;
                } else {
                  applyFilter(company, pd.getPropertyType(), pd.getReadMethod().invoke(elementValue));
                  break;
                }
/*--------------------------------------------------------------------------------------------------------------------*/
              case INNER_CLASS_COLLECTION:
                Collection<E> collection;
                if (elementValue == null) collection = null;
                else collection = ((Collection<E>) pd.getReadMethod().invoke(elementValue));
                Class<?> newElementValue = (Class<?>) ((ParameterizedType) pd.getReadMethod().getGenericReturnType()).getActualTypeArguments()[0];
                if (collection != null) {
                  for (E innerElement : collection) {
                    applyFilter(company, newElementValue, innerElement);
                  }
                } else {
                  applyFilter(company, newElementValue, null);
                }
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              case URL:
              case RAW_STRING:
                if (!_parameters.containsKey(field)) break;
                if (elementValue == null) {
                  removeEntity(company);
                  break;
                }
                if (pd.getReadMethod().invoke(elementValue) == null) {
                  removeEntity(company);                  break;
                } else {
                  RestrictionValue restrictionValue = _parameters.get(field);
                  String string = (String) pd.getReadMethod().invoke(elementValue);
                  if(string.equals("")){
                    removeEntity(company); // nothing to eval
                    break;
                  }
                  String toEval = (String) restrictionValue.getValue();
                  if (!evaluateString(string, restrictionValue.getOperator(), toEval) ) {
                    removeEntity(company);
                  }
                }
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              case YAHOO_FIELD_NUMERIC:
              case YAHOO_LONG_FORMAT_FIELD:
                if (!_parameters.containsKey(field)) break;
                if (elementValue == null) {
                  removeEntity(company);
                  break;
                }
                if (pd.getReadMethod().invoke(elementValue) == null) {
                  removeEntity(company);
                  break;
                } else {
                  RestrictionValue restrictionValue = _parameters.get(field);
                  double number = ((YahooField) pd.getReadMethod().invoke(elementValue)).getRaw();
                  if (number == 0.0) {
                    removeEntity(company); // nothing to eval?
                    break;
                  }
                  double toEval = ((double) restrictionValue.getValue());
                  if (!evaluateNumber(number, restrictionValue.getOperator(), toEval)) {
                    removeEntity(company);
                  }
                }
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              case RAW_NUMERIC:
                if (!_parameters.containsKey(field)) break;
                if (elementValue == null) {
                  removeEntity(company);
                  break;
                }
                if (pd.getReadMethod().invoke(elementValue) == null) {
                  removeEntity(company);
                  break;
                } else {
                  RestrictionValue restrictionValue = _parameters.get(field);
                  double number = ((Number)(pd.getReadMethod().invoke(elementValue))).doubleValue();
                  if (number == 0.0) {
                    removeEntity(company); // nothing to eval?
                    break;
                  }
                  double toEval = (double) restrictionValue.getValue();
                  if (!evaluateNumber(number, restrictionValue.getOperator(), toEval) ) {
                    removeEntity(company);
                  }
                }
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              case YAHOO_FIELD_DATE:
                if (!_parameters.containsKey(field)) break;
                if (elementValue == null) {
                  removeEntity(company);
                  break;
                }
                if (pd.getReadMethod().invoke(elementValue) == null) {
                  removeEntity(company);
                  break;
                } else {
                  RestrictionValue restrictionValue = _parameters.get(field);
                  long timeStamp = ((Number)(((YahooField) pd.getReadMethod().invoke(elementValue)).getRaw())).longValue();
                  if (timeStamp == 0) {
                    removeEntity(company); // nothing to eval
                    break;
                  }
                  long stampToEval = (long) restrictionValue.getValue();
                  if (!evaluateTimeStamp(timeStamp, restrictionValue.getOperator(), stampToEval)) {
                    removeEntity(company);
                  }
                }
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              case YAHOO_FIELD_DATE_COLLECTION:
                if (!_parameters.containsKey(field)) break;
                if (elementValue == null) {
                  removeEntity(company);
                  break;
                }
                if (pd.getReadMethod().invoke(elementValue) == null) {
                  removeEntity(company);
                  break;
                } else {
                  Collection<YahooField> yahooFieldCollection = (Collection<YahooField>) pd.getReadMethod().invoke(elementValue);
                  if (yahooFieldCollection == null) {
                    removeEntity(company);
                    break;
                  }
                  RestrictionValue restrictionValue = _parameters.get(field);
                  boolean remove = true;
                  for (YahooField yahooField : yahooFieldCollection) {
                    long timeStamp = new Double(yahooField.getRaw()).longValue();
                    long stampToEval = (long) restrictionValue.getValue();
                    remove = remove && (!evaluateTimeStamp(timeStamp, restrictionValue.getOperator(), stampToEval) && timeStamp != 0);
                  }
                  if (remove) {
                    removeEntity(company);
                  }
                }
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              case HISTORICAL_DATA:
              case RAW_DATE_COLLECTION:
              case YAHOO_FIELD_COLLECTION:
              case RAW_DATE:
              case RAW_BOOLEAN:
              case NUMBER_COLLECTION:
              case OPTION_LINK_COLLECTION:
              case OPTION_TYPE:
              case CLASS:
              case IGNORE:
                break;
/*--------------------------------------------------------------------------------------------------------------------*/
              default:
                throw new IllegalArgumentException("Wrong Argument -> " + parameterType.name());
            } // switch parameterType
          } // if pd.getName().equals(field.getName())
        } // for PropertyDescriptor
      } // if field.getAnnotation(EntityParameter.class) != null
    } // for Field field : elementType.getDeclaredFields()
  }


}
