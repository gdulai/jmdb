package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbGame;

import java.io.IOException;

/**
 * Specialized get task which returns an {@link OmdbGame} instance.
 *
 * @author gdulai
 */
public class OmdbGetGameTask extends AbstractOmdbTask<OmdbGame> {

  protected OmdbGetGameTask(String apiKey) {
    super(apiKey);
  }

  @Override
  public OmdbGame execute() throws IOException {
    params.put("apiKey", apiKey);

    return omdbService.callGetGame(params).execute().body();
  }
}
