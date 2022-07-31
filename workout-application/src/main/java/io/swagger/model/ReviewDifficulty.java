package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

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
