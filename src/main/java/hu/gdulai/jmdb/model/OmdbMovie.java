package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

/** @author gdulai */
public class OmdbMovie extends OmdbEntity {
  private static final long serialVersionUID = 1L;

  @SerializedName("DVD")
  private String dvdRelease;

  @SerializedName("BoxOffice")
  private String boxOffice;

  @SerializedName("Production")
  private String productionCompany;

  @SerializedName("Website")
  private String website;

  public String getDvdRelease() {
    return dvdRelease;
  }

  public void setDvdRelease(String dvdRelease) {
    this.dvdRelease = dvdRelease;
  }

  public String getBoxOffice() {
    return boxOffice;
  }

  public void setBoxOffice(String boxOffice) {
    this.boxOffice = boxOffice;
  }

  public String getProductionCompany() {
    return productionCompany;
  }

  public void setProductionCompany(String productionCompany) {
    this.productionCompany = productionCompany;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }
}
