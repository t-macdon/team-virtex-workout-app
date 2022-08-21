package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Segment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-21T17:54:50.241-04:00[America/New_York]")


public class Segment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("location")
  private Location location = null;

  public Segment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "segment-123", required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Segment activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Get activityId
   * @return activityId
   **/
  @Schema(example = "activity-123", required = true, description = "")
      @NotNull

    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public Segment index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * minimum: 0
   * @return index
   **/
  @Schema(example = "0", description = "")

  @Min(0)  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Segment timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(example = "2022-01-31T13:30:00Z", description = "")

    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Segment location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")

    @Valid
    public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(this.id, segment.id) &&
        Objects.equals(this.activityId, segment.activityId) &&
        Objects.equals(this.index, segment.index) &&
        Objects.equals(this.timestamp, segment.timestamp) &&
        Objects.equals(this.location, segment.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, index, timestamp, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
