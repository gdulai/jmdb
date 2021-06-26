package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/** @author gdulai */
public class OmdbSeason implements Serializable {
  private static final long serialVersionUID = 6233140478063014968L;

  @SerializedName("Title")
  private String title;

  @SerializedName("Season")
  private Integer seasonNumber;

  @SerializedName("totalSeasons")
  private Integer totalSeasons;

  @SerializedName("Episodes")
  private List<OmdbEpisode> episodes;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getSeasonNumber() {
    return seasonNumber;
  }

  public void setSeasonNumber(Integer seasonNumber) {
    this.seasonNumber = seasonNumber;
  }

  public Integer getTotalSeasons() {
    return totalSeasons;
  }

  public void setTotalSeasons(Integer totalSeasons) {
    this.totalSeasons = totalSeasons;
  }

  public List<OmdbEpisode> getEpisodes() {
    return episodes;
  }

  public void setEpisodes(List<OmdbEpisode> episodes) {
    this.episodes = episodes;
  }
}
