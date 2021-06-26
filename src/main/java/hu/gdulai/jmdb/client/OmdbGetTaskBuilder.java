package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.error.OmdbError;
import hu.gdulai.jmdb.model.*;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * Generic builder class for building an sub-class instance of {@link AbstractOmdbTask}.
 *
 *  @author gdulai
 */
public class OmdbGetTaskBuilder<T extends OmdbEntity> {

  private final AbstractOmdbTask<T> instance;
  private String imdbId;

  public OmdbGetTaskBuilder(final String apiKey, Class<T> classOfT) throws OmdbError {
    if (classOfT.equals(OmdbSeries.class))
      this.instance = (AbstractOmdbTask<T>) new OmdbGetSeriesTask(apiKey);
    else if (classOfT.equals(OmdbMovie.class))
      this.instance = (AbstractOmdbTask<T>) new OmdbGetMovieTask(apiKey);
    else if (classOfT.equals(OmdbEpisode.class))
      this.instance = (AbstractOmdbTask<T>) new OmdbGetEpisodeTask(apiKey);
    else if (classOfT.equals(OmdbGame.class))
      this.instance = (AbstractOmdbTask<T>) new OmdbGetGameTask(apiKey);
    else throw new OmdbError("Could not create OmdbGetTaskBuilder!");
  }

  /**
   * Builds the {@link AbstractOmdbTask} instance.
   *
   * @return instance of the {@link AbstractOmdbTask} sub-class.
   */
  public AbstractOmdbTask<T> build() {
    Map<String, String> params = new HashMap<>();
    if (imdbId != null) params.put("i", imdbId);

    instance.params = params;
    return this.instance;
  }

  /**
   * Adds an unique imdbId as task parameters.
   *
   * @param imdbId unique imdb id.
   * @return the instance of {@link OmdbGetTaskBuilder}.
   */
  public OmdbGetTaskBuilder<T> addImdbId(@Nonnull String imdbId) {
    this.imdbId = imdbId;
    return this;
  }
}
