package io.swagger.api;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.UserProfile;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-21T17:54:50.241-04:00[America/New_York]")
@RestController
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    public static HashMap<String, UserProfile> ID_TO_USER_PROFILE_MAP = new HashMap<>();

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Retrieve all users
     *
     * @return
     */
    public ResponseEntity<List<UserProfile>> usersGet() {
        return new ResponseEntity<List<UserProfile>>(new ArrayList<>(ID_TO_USER_PROFILE_MAP.values()), HttpStatus.OK);
    }

    /**
     * Create new user
     *
     * @param body
     * @return
     */
    public ResponseEntity<Void> usersPost(
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody UserProfile body) {
        if (ID_TO_USER_PROFILE_MAP.containsKey(body.getId())) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        } else {
            ID_TO_USER_PROFILE_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
    }

    /**
     * Update existing user
     *
     * @param body
     * @return
     */
    public ResponseEntity<Void> usersPut(
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody UserProfile body) {
        if (!ID_TO_USER_PROFILE_MAP.containsKey(body.getId())) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else {
            ID_TO_USER_PROFILE_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get all activities associated with a user
     *
     * @param userId
     * @return
     */
    public ResponseEntity<List<Activity>> usersUserIdActivitiesGet(
            @Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required = true, schema = @Schema()) @PathVariable("userId") String userId) {
        List<Activity> activities = new ArrayList<>();
        for (Activity activity : ActivitiesApiController.ID_TO_ACTIVITY_MAP.values())
        {
            if (activity.getUserId() == userId)
            {
                activities.add(activity);
            }
        }
        return new ResponseEntity<List<Activity>>(activities, HttpStatus.OK);
    }

    /**
     * Delete user by userId
     *
     * @param userId
     * @return
     */
    public ResponseEntity<Void> usersUserIdDelete(
            @Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required = true, schema = @Schema()) @PathVariable("userId") String userId) {
        if (!ID_TO_USER_PROFILE_MAP.containsKey(userId)) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else {
            ID_TO_USER_PROFILE_MAP.remove(userId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get user by userId
     *
     * @param userId
     * @return
     */
    public ResponseEntity<UserProfile> usersUserIdGet(
            @Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required = true, schema = @Schema()) @PathVariable("userId") String userId) {
        if (!ID_TO_USER_PROFILE_MAP.containsKey(userId)) {
            return new ResponseEntity<UserProfile>(HttpStatus.NOT_FOUND);
        } else {
            UserProfile up = ID_TO_USER_PROFILE_MAP.get(userId);
            return new ResponseEntity<UserProfile>(up, HttpStatus.OK);
        }
    }

    /**
     * Get all reviews associated with user
     *
     * @param userId
     * @return
     */
    public ResponseEntity<List<Review>> usersUserIdReviewsGet(
            @Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required = true, schema = @Schema()) @PathVariable("userId") String userId) {
        List<Review> reviews = new ArrayList<>();
        for (Review review : ReviewsApiController.ID_TO_REVIEW_MAP.values())
        {
            if (review.getUserId() == userId)
            {
                reviews.add(review);
            }
        }
        return new ResponseEntity<List<Review>>(reviews, HttpStatus.OK);
    }

}
