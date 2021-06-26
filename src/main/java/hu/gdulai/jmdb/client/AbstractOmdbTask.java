package hu.gdulai.jmdb.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.Map;

/**
 * Base class for all Omdb API related Search/Get Tasks.
 *
 * @author gdulai
 */
public abstract class AbstractOmdbTask<T> {

  @Nonnull protected final IOmdbService omdbService;
  @Nonnull protected final String apiKey;
  @Nonnull protected Map<String, String> params;

  /**
   * @param apiKey to be used by the API.
   */
  protected AbstractOmdbTask(@Nonnull String apiKey) {
    this.omdbService =
        new Retrofit.Builder()
            .baseUrl("https://www.omdbapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(IOmdbService.class);
    this.apiKey = apiKey;
  }

  /**
   * Executed the created task.
   *
   * @return result of the task exectuion.
   * @throws IOException can be caused by the REST call.
   */
  public abstract T execute() throws IOException;
}
