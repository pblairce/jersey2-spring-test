package nl.bstoi.jersey2springexample.ws.rest.resource;

import java.util.Date;

import javax.ws.rs.QueryParam;

public class QueryParams {
  @QueryParam("date")
  private Date date;

  @QueryParam("number")
  private int number;

  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    this.number = number;
  }
  public String toString() {
    String dateStr = (date == null) ? "null" : Long.toString(date.getTime());
    return "date: " + dateStr + ", number: " + number;
  }
}
