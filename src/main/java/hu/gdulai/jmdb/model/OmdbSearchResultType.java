package hu.gdulai.jmdb.model;

/** @author gdulai */
public enum OmdbSearchResultType {
  JSON("json"),
  XML("xml");

  private final String value;

  OmdbSearchResultType(String value) {
    this.value = value;
  }

  public String value() {
    return this.value;
  }
}
