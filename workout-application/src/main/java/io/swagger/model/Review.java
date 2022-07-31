package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.ReviewDifficulty;
import io.swagger.model.ReviewRating;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Review
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-31T17:35:36.035-04:00[America/New_York]")


public class Review   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("rating")
  private ReviewRating rating = null;

  /**
   * Gets or Sets difficulty
   */
  public enum DifficultyEnum {
    EASY("Easy"),
    
    MEDIUM("Medium"),
    
    HARD("Hard");

    private String value;

    DifficultyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DifficultyEnum fromValue(String text) {
      for (DifficultyEnum b : DifficultyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("difficulty")
  private DifficultyEnum difficulty = null;

  @JsonProperty("review")
  private ReviewDifficulty review = null;

  public Review id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "review-123", required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Review activityId(String activityId) {
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

  public Review userId(String userId) {
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

  public Review timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(example = "2022-01-31T13:30:00Z", required = true, description = "")
      @NotNull

    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Review rating(ReviewRating rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ReviewRating getRating() {
    return rating;
  }

  public void setRating(ReviewRating rating) {
    this.rating = rating;
  }

  public Review difficulty(DifficultyEnum difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  /**
   * Get difficulty
   * @return difficulty
   **/
  @Schema(required = true, description = "")
      @NotNull

    public DifficultyEnum getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(DifficultyEnum difficulty) {
    this.difficulty = difficulty;
  }

  public Review review(ReviewDifficulty review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
   **/
  @Schema(description = "")
  
    @Valid
    public ReviewDifficulty getReview() {
    return review;
  }

  public void setReview(ReviewDifficulty review) {
    this.review = review;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review review = (Review) o;
    return Objects.equals(this.id, review.id) &&
        Objects.equals(this.activityId, review.activityId) &&
        Objects.equals(this.userId, review.userId) &&
        Objects.equals(this.timestamp, review.timestamp) &&
        Objects.equals(this.rating, review.rating) &&
        Objects.equals(this.difficulty, review.difficulty) &&
        Objects.equals(this.review, review.review);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, userId, timestamp, rating, difficulty, review);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
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
