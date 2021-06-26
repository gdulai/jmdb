package hu.gdulai.jmdb.error;

/** @author gdulai */
public class OmdbError extends Exception {

  public OmdbError(String message) {
    super(message);
  }

  public OmdbError(String message, Throwable cause) {
    super(message, cause);
  }
}
