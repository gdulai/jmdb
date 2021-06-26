package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbSeason;

import java.io.IOException;

/**
 * Specialized get task which returns an {@link OmdbSeason} instance.
 *
 * @author gdulai
 */
public class OmdbGetSeasonTask extends AbstractOmdbTask<OmdbSeason> {

  OmdbGetSeasonTask(String apiKey) {
    super(apiKey);
  }

  @Override
  public OmdbSeason execute() throws IOException {
    params.put("apiKey", apiKey);

    return omdbService.callGetSeason(params).execute().body();
  }
}
