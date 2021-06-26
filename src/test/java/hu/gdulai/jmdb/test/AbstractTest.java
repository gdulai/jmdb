package hu.gdulai.jmdb.test;

import org.junit.Before;

/** @author gdulai */
public abstract class AbstractTest {

  protected String omdbApiKey = "bf4ab5d1";

  @Before
  public void before() {
    omdbApiKey = System.getProperty("omdb_api_key");
  }

  public String getOmdbApiKey() {
    return omdbApiKey;
  }
}
