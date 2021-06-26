package hu.gdulai.jmdb.client;

import hu.gdulai.jmdb.model.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Interface for Retrofit based service.
 *
 * @author gdulai
 */
interface IOmdbService {

  @Headers("Content-Type: application/json")
  @GET("/")
  Call<OmdbSearch> callSearch(@QueryMap Map<String, String> params);

  @Headers("Content-Type: application/json")
  @GET("/")
  Call<OmdbSeries> callGetSeries(@QueryMap Map<String, String> params);

  @Headers("Content-Type: application/json")
  @GET("/")
  Call<OmdbEpisode> callGetEpisode(@QueryMap Map<String, String> params);

  @Headers("Content-Type: application/json")
  @GET("/")
  Call<OmdbMovie> callGetMovie(@QueryMap Map<String, String> params);

  @Headers("Content-Type: application/json")
  @GET("/")
  Call<OmdbSeason> callGetSeason(@QueryMap Map<String, String> params);

  @Headers("Content-Type: application/json")
  @GET("/")
  Call<OmdbGame> callGetGame(@QueryMap Map<String, String> params);
}
