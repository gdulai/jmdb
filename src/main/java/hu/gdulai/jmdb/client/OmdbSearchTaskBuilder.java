package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.OmdbEntityType;
import hu.gdulai.jmdb.model.OmdbSearchResultType;

import javax.annotation.Nonnull;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

/**
 * Builder class for creating an instance of {@link OmdbSearchTask}.
 *
 * @author gdulai
 */
public class OmdbSearchTaskBuilder {

  private final OmdbSearchTask instance;
  private String title;
  private OmdbEntityType type;
  private Year year;
  private OmdbSearchResultType resultType;
  private int pageNumber = 1;

  /**
   * @param apiKey to be used by the Omdb API.
   */
  public OmdbSearchTaskBuilder(@Nonnull final String apiKey) {
    this.instance = new OmdbSearchTask(apiKey);
  }

  /**
   * Builds the {@link OmdbSearchTask} instance.
   *
   * @return the task instance.
   */
  public OmdbSearchTask build() {
    Map<String, String> params = new HashMap<>();
    if (title != null) params.put("s", title);

    if (type != null) params.put("type", type.value());

    if (year != null) params.put("y", year.toString());

    if (resultType != null) params.put("r", resultType.value());

    params.put("page", String.valueOf(pageNumber));

    instance.params = params;

    return instance;
  }

  /**
   * Adds a title to the search parameters.
   *
   * @param title to search by.
   * @return {@link OmdbSearchTaskBuilder} instace.
   */
  public OmdbSearchTaskBuilder addTitle(@Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Adds an {@link OmdbEntityType} to the search parameters.
   *
   * @param type member of {@link OmdbEntityType} enum values.
   * @return {@link OmdbSearchTaskBuilder} instace.
   */
  public OmdbSearchTaskBuilder addType(@Nonnull OmdbEntityType type) {
    this.type = type;
    return this;
  }

  /**
   * Adds a year to the search parameters.
   *
   * @return {@link OmdbSearchTaskBuilder} instace.
   */
  public OmdbSearchTaskBuilder addYear(@Nonnull Year year) {
    this.year = year;
    return this;
  }

  /**
   * Adds an {@link OmdbSearchResultType} item to the search parameters.
   * This switches between JSON and XML results.
   *
   * @return {@link OmdbSearchTaskBuilder} instace.
   */
  public OmdbSearchTaskBuilder addResultType(@Nonnull OmdbSearchResultType resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Adds a pageNumber to the search parameters.
   * This should be used when a previous search results returns more than 1 pages of results.
   *
   * @return {@link OmdbSearchTaskBuilder} instace.
   */
  public OmdbSearchTaskBuilder addPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
}
