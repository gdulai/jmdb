package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbMovie;

import java.io.IOException;

/**
 * Specialized get task which returns an {@link OmdbMovie} instance.
 *
 * @author gdulai
 */
public class OmdbGetMovieTask extends AbstractOmdbTask<OmdbMovie> {

  protected OmdbGetMovieTask(String apiKey) {
    super(apiKey);
  }

  @Override
  public OmdbMovie execute() throws IOException {
    params.put("apiKey", apiKey);

    return omdbService.callGetMovie(params).execute().body();
  }
}
