package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/** @author gdulai */
public class OmdbSearch implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("Search")
  private List<OmdbSearchResult> results;

  @SerializedName("totalResults")
  private String totalResults;

  @SerializedName("Response")
  private String response;

  public List<OmdbSearchResult> getResults() {
    return results;
  }

  public void setResults(List<OmdbSearchResult> results) {
    this.results = results;
  }

  public String getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(String totalResults) {
    this.totalResults = totalResults;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }
}
