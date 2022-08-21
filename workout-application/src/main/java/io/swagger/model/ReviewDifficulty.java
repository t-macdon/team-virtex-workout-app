package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ReviewDifficulty
 */
public enum ReviewDifficulty {
  EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

  private String value;

  ReviewDifficulty(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReviewDifficulty fromValue(String text) {
    for (ReviewDifficulty b : ReviewDifficulty.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
