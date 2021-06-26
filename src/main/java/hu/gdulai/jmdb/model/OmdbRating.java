package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/** @author gdulai */
public class OmdbRating implements Serializable {
  private static final long serialVersionUID = 1L;

  public class Ratings {
    @SerializedName("Source")
    private String source;

    @SerializedName("Value")
    private String value;

    public void setSource(String source) {
      this.source = source;
    }

    public String getSource() {
      return this.source;
    }

    public void setValue(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }
}
