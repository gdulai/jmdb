package hu.gdulai.jmdb.client;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * Specialized builder class for {@link OmdbGetEpisodeTask}.
 *
 * @author gdulai
 */
public class OmdbGetEpisodeTaskBuilder {

  private final OmdbGetEpisodeTask instance;
  private String imdbId;
  private Integer season;
  private Integer episode;

  /**
   * @param apiKey to be used by the Omdb API.
   */
  public OmdbGetEpisodeTaskBuilder(@Nonnull final String apiKey) {
    this.instance = new OmdbGetEpisodeTask(apiKey);
  }

  /**
   * Builds the {@link OmdbGetEpisodeTask} instance.
   *
   * @return the task instance.
   */
  public OmdbGetEpisodeTask build() {
    Map<String, String> params = new HashMap<>();
    if (imdbId != null) params.put("i", imdbId);

    if (season != null) {
      params.put("Season", String.valueOf(season));
    }

    if (episode != null) {
      params.put("Episode", String.valueOf(episode));
    }

    instance.params = params;
    return this.instance;
  }

  /**
   * Adds an imdb id to task parameters.
   *
   * @param imdbId unique imdbId.
   * @return the builder instance.
   */
  public OmdbGetEpisodeTaskBuilder addImdbId(@Nonnull String imdbId) {
    this.imdbId = imdbId;
    return this;
  }

  /**
   * Adds a season and episode number to the task parameters.
   *
   * @param season number.
   * @param episode number.
   * @return the builder instance.
   */
  public OmdbGetEpisodeTaskBuilder addSeasonAndEpisode(@Nonnull Integer season, @Nonnull Integer episode) {
    this.season = season;
    this.episode = episode;
    return this;
  }
}
