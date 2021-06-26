package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbSearch;

import javax.annotation.Nonnull;
import java.io.IOException;

/** @author gdulai */
public class OmdbSearchTask extends AbstractOmdbTask<OmdbSearch> {

  /**
   * @param apiKey to be used by the API.
   */
  OmdbSearchTask(@Nonnull String apiKey) {
    super(apiKey);
  }

  @Override
  public OmdbSearch execute() throws IOException {
    params.put("apiKey", apiKey);

    return omdbService.callSearch(params).execute().body();
  }
}
