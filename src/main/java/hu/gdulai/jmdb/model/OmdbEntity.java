package hu.gdulai.jmdb.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/** @author gdulai */
public class OmdbEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("imdbID")
  private String imdbID;

  @SerializedName("Title")
  private String title;

  @SerializedName("Year")
  private String year;

  @SerializedName("Rated")
  private String rated;

  @SerializedName("Released")
  private String releaseDate;

  @SerializedName("Runtime")
  private String runtime;

  @SerializedName("Genre")
  private String genre;

  @SerializedName("Director")
  private String director;

  @SerializedName("Writer")
  private String writer;

  @SerializedName("Actors")
  private String actor;

  @SerializedName("Plot")
  private String plot;

  @SerializedName("Language")
  private String language;

  @SerializedName("Country")
  private String country;

  @SerializedName("Awards")
  private String awards;

  @SerializedName("Poster")
  private String posterUrl;

  @SerializedName("Rating")
  private OmdbRating[] ratings;

  @SerializedName("Metascore")
  private String metaScore;

  @SerializedName("imdbRating")
  private String imdbRating;

  @SerializedName("imdbVotes")
  private String imdbVotes;

  @SerializedName("Type")
  private OmdbEntityType type;

  public String getImdbID() {
    return imdbID;
  }

  public void setImdbID(String imdbID) {
    this.imdbID = imdbID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getRated() {
    return rated;
  }

  public void setRated(String rated) {
    this.rated = rated;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public String getPlot() {
    return plot;
  }

  public void setPlot(String plot) {
    this.plot = plot;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAwards() {
    return awards;
  }

  public void setAwards(String awards) {
    this.awards = awards;
  }

  public String getPosterUrl() {
    return posterUrl;
  }

  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }

  public OmdbRating[] getRatings() {
    return ratings;
  }

  public void setRatings(OmdbRating[] ratings) {
    this.ratings = ratings;
  }

  public String getMetaScore() {
    return metaScore;
  }

  public void setMetaScore(String metaScore) {
    this.metaScore = metaScore;
  }

  public String getImdbRating() {
    return imdbRating;
  }

  public void setImdbRating(String imdbRating) {
    this.imdbRating = imdbRating;
  }

  public String getImdbVotes() {
    return imdbVotes;
  }

  public void setImdbVotes(String imdbVotes) {
    this.imdbVotes = imdbVotes;
  }

  public OmdbEntityType getType() {
    return type;
  }

  public void setType(OmdbEntityType type) {
    this.type = type;
  }
}
