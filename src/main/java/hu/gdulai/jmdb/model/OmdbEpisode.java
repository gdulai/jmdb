package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

/** @author gdulai */
public class OmdbEpisode extends OmdbEntity {
  private static final long serialVersionUID = 1L;

  @SerializedName("Season")
  private Integer season;

  @SerializedName("Episode")
  private Integer episode;

  public Integer getSeason() {
    return season;
  }

  public void setSeason(Integer season) {
    this.season = season;
  }

  public Integer getEpisode() {
    return episode;
  }

  public void setEpisode(Integer episode) {
    this.episode = episode;
  }
}
