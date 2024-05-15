package nl.bstoi.jersey2springexample.ws.rest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;

import nl.bstoi.jersey2springexample.ws.rest.resource.DateParamConverter;

public class DateParamConverterProvider implements ParamConverterProvider {
  @Override
  public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
    if (rawType.equals(Date.class)) {
      return (ParamConverter<T>) new DateParamConverter();
    }
    return null;
  }

}
