package hu.gdulai.jmdb.test;

import hu.gdulai.jmdb.client.OmdbGetEpisodeTask;
import hu.gdulai.jmdb.client.OmdbGetEpisodeTaskBuilder;
import hu.gdulai.jmdb.client.OmdbGetSeasonTask;
import hu.gdulai.jmdb.client.OmdbGetSeasonTaskBuilder;
import hu.gdulai.jmdb.model.OmdbEpisode;
import hu.gdulai.jmdb.model.OmdbSeason;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/** @author gdulai */
public class ContentIntegrityGOTTest extends AbstractTest {

  /** imdbId = tt0944947 */
  @Test
  public void testGetGOTFirstSeason() {
    OmdbGetSeasonTask getTask =
        new OmdbGetSeasonTaskBuilder(getOmdbApiKey()).addImdbIdAndSeason("tt0944947", 1).build();

    OmdbSeason result = null;
    try {
      result = getTask.execute();

      assertThat(result).isNotNull();
      assertThat(result.getTitle()).isEqualTo("Game of Thrones");
      assertThat(result.getSeasonNumber()).isEqualTo(1);
      assertThat(result.getTotalSeasons()).isEqualTo(8);
      assertThat(result.getEpisodes()).hasSize(10);
    } catch (IOException e) {
      fail(e.getMessage());
    }
  }

  /** imdbId = tt0944947 */
  @Test
  public void testGetGOTSecondSeason() {
    OmdbGetSeasonTask getTask =
        new OmdbGetSeasonTaskBuilder(getOmdbApiKey()).addImdbIdAndSeason("tt0944947", 2).build();

    OmdbSeason result = null;
    try {
      result = getTask.execute();

      assertThat(result).isNotNull();
      assertThat(result.getTitle()).isEqualTo("Game of Thrones");
      assertThat(result.getSeasonNumber()).isEqualTo(2);
      assertThat(result.getTotalSeasons()).isEqualTo(8);
      assertThat(result.getEpisodes()).hasSize(10);
    } catch (IOException e) {
      fail(e.getMessage());
    }
  }

  /**
   * // http://www.omdbapi.com/?apikey=bf4ab5d1&i=tt1480055
   *
   * <p>{ "Title": "Winter Is Coming", "Year": "2011", "Rated": "TV-MA", "Released": "17 Apr 2011",
   * "Season": "1", "Episode": "1", "Runtime": "62 min", "Genre": "Action, Adventure, Drama,
   * Fantasy, Romance", "Director": "Timothy Van Patten", "Writer": "David Benioff (created by),
   * D.B. Weiss (created by), George R.R. Martin (based on \"A Song of Ice and Fire\" by), David
   * Benioff, D.B. Weiss", "Actors": "Sean Bean, Mark Addy, Nikolaj Coster-Waldau, Michelle
   * Fairley", "Plot": "Eddard Stark is torn between his family and an old friend when asked to
   * serve at the side of King Robert Baratheon; Viserys plans to wed his sister to a nomadic
   * warlord in exchange for an army.", "Language": "English", "Country": "USA", "Awards": "N/A",
   * "Poster":
   * "https://m.media-amazon.com/images/M/MV5BMTQ2NDIzNjEzOV5BMl5BanBnXkFtZTcwOTU2ODg5NA@@._V1_SX300.jpg",
   * "Ratings": [ { "Source": "Internet Movie Database", "Value": "9.0/10" } ], "Metascore": "N/A",
   * "imdbRating": "9.0", "imdbVotes": "37446", "imdbID": "tt1480055", "seriesID": "tt0944947",
   * "Type": "episode", "Response": "True" }
   */
  @Test
  public void testGetGOTFirstSeasonEpisodeOne() throws Exception {
    OmdbGetEpisodeTask getTask =
        new OmdbGetEpisodeTaskBuilder(getOmdbApiKey())
            .addImdbId("tt0944947")
            .addSeasonAndEpisode(1, 1)
            .build();

    OmdbEpisode result = null;

    try {
      result = getTask.execute();

      assertThat(result).isInstanceOf(OmdbEpisode.class);

      assertThat(result).isNotNull();
      assertThat(result.getTitle()).isEqualTo("Winter Is Coming");
      assertThat(result.getYear()).isEqualTo("2011");
      assertThat(result.getRated()).isEqualTo("TV-MA");
      assertThat(result.getReleaseDate()).isEqualTo("17 Apr 2011");
      assertThat(result.getSeason()).isEqualTo(1);
      assertThat(result.getEpisode()).isEqualTo(1);
      assertThat(result.getRuntime()).isEqualTo("62 min");
      assertThat(result.getGenre()).isEqualTo("Action, Adventure, Drama");
      assertThat(result.getDirector()).isEqualTo("Timothy Van Patten");
      assertThat(result.getWriter())
          .contains("David Benioff, D.B. Weiss, George R.R. Martin");
      assertThat(result.getActor())
          .isEqualTo("Sean Bean, Mark Addy, Nikolaj Coster-Waldau");
      assertThat(result.getPlot())
          .isEqualTo(
              "Eddard Stark is torn between his family and an old friend when asked to serve at the side of King Robert Baratheon; Viserys plans to wed his sister to a nomadic warlord in exchange for an army.");
      assertThat(result.getLanguage()).isEqualTo("English");

      assertThat(result.getImdbID()).isEqualTo("tt1480055");

    } catch (IOException e) {
      fail(e.getMessage());
    }
  }
}
