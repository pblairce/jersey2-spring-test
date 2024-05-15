package nl.bstoi.jersey2springexample.ws.rest;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

public class DateConverterFeature implements Feature {
  @Override
  public boolean configure(FeatureContext context) {
    context.register(DateParamConverterProvider.class);
    return true;
  }
}
