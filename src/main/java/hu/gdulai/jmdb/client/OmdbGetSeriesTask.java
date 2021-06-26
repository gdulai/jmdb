package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbSeries;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * Specialized get task which returns an {@link OmdbSeries} instance.
 *
 * @author gdulai
 */
public class OmdbGetSeriesTask extends AbstractOmdbTask<OmdbSeries> {

  protected OmdbGetSeriesTask(@Nonnull String apiKey) {
    super(apiKey);
  }

  @Override
  public OmdbSeries execute() throws IOException {
    params.put("apiKey", apiKey);

    return omdbService.callGetSeries(params).execute().body();
  }
}
