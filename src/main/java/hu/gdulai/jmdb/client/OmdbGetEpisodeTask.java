package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbEpisode;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * {@link AbstractOmdbTask} sub-class for fetching an {@link OmdbEpisode}.
 *
 * @author gdulai
 */
public class OmdbGetEpisodeTask extends AbstractOmdbTask<OmdbEpisode> {

  /**
   * @param apiKey to be used by the API.
   */
  protected OmdbGetEpisodeTask(@Nonnull String apiKey) {
    super(apiKey);
  }

  @Override
  public OmdbEpisode execute() throws IOException {
    params.put("apiKey", apiKey);

    return omdbService.callGetEpisode(params).execute().body();
  }
}
