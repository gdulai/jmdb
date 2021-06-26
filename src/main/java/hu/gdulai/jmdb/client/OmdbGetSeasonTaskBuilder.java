package hu.gdulai.jmdb.client;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * Specialized builder class for {@link OmdbGetEpisodeTask}.
 *
 * @author gdulai
 */
public class OmdbGetSeasonTaskBuilder {

  private final OmdbGetSeasonTask instance;
  private String imdbId;
  private Integer season;

  /**
   * @param apiKey to be used by the Omdb API.
   */
  public OmdbGetSeasonTaskBuilder(@Nonnull final String apiKey) {
    this.instance = new OmdbGetSeasonTask(apiKey);
  }

  /**
   * Builds the {@link OmdbGetSeasonTask} instance.
   *
   * @return the task instance.
   */
  public OmdbGetSeasonTask build() {
    Map<String, String> params = new HashMap<>();
    if (imdbId != null) params.put("i", imdbId);

    if (season != null) {
      params.put("Season", String.valueOf(season));
    }

    instance.params = params;
    return this.instance;
  }

  /**
   * Adds an unique imdbId and season number as task parameters.
   *
   * @param imdbId unique imdbId.
   * @param season number of the season.
   * @return
   */
  public OmdbGetSeasonTaskBuilder addImdbIdAndSeason(@Nonnull String imdbId, @Nonnull Integer season) {
    this.imdbId = imdbId;
    this.season = season;
    return this;
  }
}
