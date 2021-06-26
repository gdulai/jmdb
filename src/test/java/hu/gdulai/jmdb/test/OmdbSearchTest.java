package hu.gdulai.jmdb.test;

import hu.gdulai.jmdb.client.OmdbSearchTask;
import hu.gdulai.jmdb.client.OmdbSearchTaskBuilder;
import hu.gdulai.jmdb.model.OmdbSearch;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

/** @author gdulai */
public class OmdbSearchTest extends AbstractTest {

  // http://www.omdbapi.com/?apikey=bf4ab5d1&i=tt3896198
  @Test
  public void testSearch() {
    OmdbSearchTask searchTask = new OmdbSearchTaskBuilder(getOmdbApiKey()).addTitle("game").build();
    OmdbSearch result = null;
    try {
      result = searchTask.execute();
    } catch (IOException e) {
      fail(e.getMessage());
    }

    assertThat(result.getResults()).isNotEmpty();
  }
}
