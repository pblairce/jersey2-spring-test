package nl.bstoi.jersey2springexample.ws.rest.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.ext.ParamConverter;

public class DateParamConverter implements ParamConverter<Date> {
  private final SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
  @Override
  public Date fromString(String value) {
    if (value == null || value.isEmpty()) {
      return null;
    }
    try {
      return formatter.parse(value);
    } catch (ParseException e) {
      throw new IllegalArgumentException("Invalid date format. Please use yyyyMMdd");
    }
  }
  @Override
  public String toString(Date value) {
    if (value == null) return null;
    return formatter.format(value);
  }
}
