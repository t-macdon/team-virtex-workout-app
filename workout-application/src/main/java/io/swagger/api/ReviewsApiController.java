package io.swagger.api;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.Review;
import io.swagger.model.ReviewDifficulty;
import io.swagger.model.ReviewRating;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-21T17:54:50.241-04:00[America/New_York]")
@RestController
public class ReviewsApiController implements ReviewsApi {

    private static final Logger log = LoggerFactory.getLogger(ReviewsApiController.class);

    public static HashMap<String, Review> ID_TO_REVIEW_MAP = new HashMap<>();

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReviewsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Create review
     */
    public ResponseEntity<Void> reviewsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Review body) {
        if (ID_TO_REVIEW_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        } else
        {
            ID_TO_REVIEW_MAP.put(body.getId(), body);
            // also have to add the review to the associated activity
            ActivitiesApiController.ID_TO_ACTIVITY_MAP.get(body.getActivityId()).addReviewsItem(body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
    }

    /**
     * Update existing review
     */
    public ResponseEntity<Void> reviewsPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Review body) {
        if (!ID_TO_REVIEW_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            ID_TO_REVIEW_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get reviews based on query
     */
    public ResponseEntity<List<Review>> reviewsQueryGet(@Parameter(in = ParameterIn.QUERY, description = "The review's difficulty value" ,schema=@Schema()) @Valid @RequestParam(value = "difficulty", required = false) ReviewDifficulty difficulty,@Parameter(in = ParameterIn.QUERY, description = "The review's rating" ,schema=@Schema()) @Valid @RequestParam(value = "rating", required = false) ReviewRating rating) {
        return new ResponseEntity<List<Review>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Remove review by ID
     */
    public ResponseEntity<Void> reviewsReviewIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Review", required=true, schema=@Schema()) @PathVariable("reviewId") String reviewId) {
        if (!ID_TO_REVIEW_MAP.containsKey(reviewId))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            ID_TO_REVIEW_MAP.remove(reviewId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get review by ID
     */
    public ResponseEntity<Review> reviewsReviewIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Review", required=true, schema=@Schema()) @PathVariable("reviewId") String reviewId) {
        if (!ID_TO_REVIEW_MAP.containsKey(reviewId))
        {
            return new ResponseEntity<Review>(HttpStatus.NOT_FOUND);
        } else
        {
            Review review = ID_TO_REVIEW_MAP.get(reviewId);
            return new ResponseEntity<Review>(review, HttpStatus.OK);
        }
    }

}
