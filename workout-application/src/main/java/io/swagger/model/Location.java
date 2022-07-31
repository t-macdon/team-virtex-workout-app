package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-31T17:35:36.035-04:00[America/New_York]")


public class Location   {
  @JsonProperty("lat")
  private Integer lat = null;

  @JsonProperty("lon")
  private Integer lon = null;

  public Location lat(Integer lat) {
    this.lat = lat;
    return this;
  }

  /**
   * The latitudinal value accurate to 5 decimal places (~1.1 meters)
   * @return lat
   **/
  @Schema(required = true, description = "The latitudinal value accurate to 5 decimal places (~1.1 meters)")
      @NotNull

    public Integer getLat() {
    return lat;
  }

  public void setLat(Integer lat) {
    this.lat = lat;
  }

  public Location lon(Integer lon) {
    this.lon = lon;
    return this;
  }

  /**
   * The longitudinal value accurate to 5 decimal places (~1.1 meters)
   * @return lon
   **/
  @Schema(required = true, description = "The longitudinal value accurate to 5 decimal places (~1.1 meters)")
      @NotNull

    public Integer getLon() {
    return lon;
  }

  public void setLon(Integer lon) {
    this.lon = lon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.lon, location.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
