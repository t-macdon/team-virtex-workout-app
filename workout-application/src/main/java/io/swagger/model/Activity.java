package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Review;
import io.swagger.model.Segment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Activity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-21T17:54:50.241-04:00[America/New_York]")


public class Activity   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("eventStart")
  private String eventStart = null;

  @JsonProperty("eventStop")
  private String eventStop = null;

  @JsonProperty("totalDuration")
  private Integer totalDuration = null;

  /**
   * Gets or Sets activityType
   */
  public enum ActivityTypeEnum {
    WALK("Walk"),
    
    HIKE("Hike"),
    
    RUN("Run"),
    
    SWIM("Swim"),
    
    CYCLE("Cycle"),
    
    MOUNTAIN_BIKE("Mountain Bike");

    private String value;

    ActivityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActivityTypeEnum fromValue(String text) {
      for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("activityType")
  private ActivityTypeEnum activityType = null;

  @JsonProperty("segments")
  @Valid
  private List<Segment> segments = null;

  @JsonProperty("reviews")
  @Valid
  private List<Review> reviews = null;

  @JsonProperty("avgRating")
  private Integer avgRating = null;

  public Activity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "activity-123", required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Activity userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "user-123", required = true, description = "")
      @NotNull

    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Activity eventStart(String eventStart) {
    this.eventStart = eventStart;
    return this;
  }

  /**
   * Get eventStart
   * @return eventStart
   **/
  @Schema(example = "2022-01-31T13:30:00Z", description = "")
  
    public String getEventStart() {
    return eventStart;
  }

  public void setEventStart(String eventStart) {
    this.eventStart = eventStart;
  }

  public Activity eventStop(String eventStop) {
    this.eventStop = eventStop;
    return this;
  }

  /**
   * Get eventStop
   * @return eventStop
   **/
  @Schema(example = "2022-01-31T15:00:00Z", description = "")
  
    public String getEventStop() {
    return eventStop;
  }

  public void setEventStop(String eventStop) {
    this.eventStop = eventStop;
  }

  public Activity totalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

  /**
   * The length of the activity in minutes
   * @return totalDuration
   **/
  @Schema(example = "90", description = "The length of the activity in minutes")
  
    public Integer getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
  }

  public Activity activityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
   **/
  @Schema(description = "")
  
    public ActivityTypeEnum getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }

  public Activity segments(List<Segment> segments) {
    this.segments = segments;
    return this;
  }

  public Activity addSegmentsItem(Segment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<Segment>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Get segments
   * @return segments
   **/
  @Schema(description = "")
      @Valid
    public List<Segment> getSegments() {
    return segments;
  }

  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  public Activity reviews(List<Review> reviews) {
    this.reviews = reviews;
    return this;
  }

  public Activity addReviewsItem(Review reviewsItem) {
    if (this.reviews == null) {
      this.reviews = new ArrayList<Review>();
    }
    this.reviews.add(reviewsItem);
    return this;
  }

  /**
   * Get reviews
   * @return reviews
   **/
  @Schema(description = "")
      @Valid
    public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public Activity avgRating(Integer avgRating) {
    this.avgRating = avgRating;
    return this;
  }

  /**
   * Get avgRating
   * @return avgRating
   **/
  @Schema(description = "")
  
    public Integer getAvgRating() {
    return avgRating;
  }

  public void setAvgRating(Integer avgRating) {
    this.avgRating = avgRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.id, activity.id) &&
        Objects.equals(this.userId, activity.userId) &&
        Objects.equals(this.eventStart, activity.eventStart) &&
        Objects.equals(this.eventStop, activity.eventStop) &&
        Objects.equals(this.totalDuration, activity.totalDuration) &&
        Objects.equals(this.activityType, activity.activityType) &&
        Objects.equals(this.segments, activity.segments) &&
        Objects.equals(this.reviews, activity.reviews) &&
        Objects.equals(this.avgRating, activity.avgRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, eventStart, eventStop, totalDuration, activityType, segments, reviews, avgRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventStart: ").append(toIndentedString(eventStart)).append("\n");
    sb.append("    eventStop: ").append(toIndentedString(eventStop)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
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
