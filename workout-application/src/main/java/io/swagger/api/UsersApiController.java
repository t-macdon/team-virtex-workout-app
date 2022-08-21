package io.swagger.api;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.UserProfile;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @return
     */
    public ResponseEntity<List<UserProfile>> usersGet() {
        return new ResponseEntity<List<UserProfile>>(new ArrayList<>(ID_TO_USER_PROFILE_MAP.values()), HttpStatus.OK);
    }

    /**
     * Create new user
     * @param body
     * @return
     */
    public ResponseEntity<Void> usersPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserProfile body) {
        if (ID_TO_USER_PROFILE_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        } else
        {
            ID_TO_USER_PROFILE_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
    }

    /**
     * Update existing user
     * @param body
     * @return
     */
    public ResponseEntity<Void> usersPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserProfile body) {
        if (!ID_TO_USER_PROFILE_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            ID_TO_USER_PROFILE_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get all activities associated with a user
     * @param userId
     * @return
     */
    public ResponseEntity<List<Activity>> usersUserIdActivitiesGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") String userId) {
        return new ResponseEntity<List<Activity>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Delete user by userId
     * @param userId
     * @return
     */
    public ResponseEntity<Void> usersUserIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") String userId) {
        if (!ID_TO_USER_PROFILE_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            ID_TO_USER_PROFILE_MAP.remove(body.getId());
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get user by userId
     * @param userId
     * @return
     */
    public ResponseEntity<UserProfile> usersUserIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") String userId) {
        if (!ID_TO_USER_PROFILE_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            UserProfile up = ID_TO_USER_PROFILE_MAP.get(body.getId());
            return new ResponseEntity<Void>(up, HttpStatus.OK);
        }
    }

    /**
     * Get all reviews associated with user
     * @param userId
     * @return
     */
    public ResponseEntity<List<Review>> usersUserIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") String userId) {
        return new ResponseEntity<List<Review>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
