package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

/** @author gdulai */
public class OmdbSeries extends OmdbEntity {
  private static final long serialVersionUID = 1L;

  @SerializedName("totalSeasons")
  private int totalSeasons;

  public int getTotalSeasons() {
    return totalSeasons;
  }

  public void setTotalSeasons(int totalSeasons) {
    this.totalSeasons = totalSeasons;
  }
}
