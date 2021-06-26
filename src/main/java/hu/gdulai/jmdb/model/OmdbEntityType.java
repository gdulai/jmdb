package hu.gdulai.jmdb.model;

/** @author gdulai */
public enum OmdbEntityType {
  MOVIE("movie"),
  SERIES("series"),
  EPISODE("episode"),
  GAME("game");

  private final String value;

  OmdbEntityType(final String value) {
    this.value = value;
  }

  public String value() {
    return value;
  }

  public static OmdbEntityType of(String value) {
    return OmdbEntityType.of(value.toUpperCase());
  }
}
