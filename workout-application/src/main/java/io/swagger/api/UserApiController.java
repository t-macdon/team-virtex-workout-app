package io.swagger.api;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.User;
import io.swagger.model.Userpropertiesid;
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
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-30T20:31:30.649-04:00[America/New_York]")
@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> userPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> userPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Activity>> userUserIdActivitiesGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Activity>>(objectMapper.readValue("[ {\n  \"totalDuration\" : 90,\n  \"eventStop\" : \"2022-01-31T15:00:00Z\",\n  \"reviews\" : [ {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Wow, nice job! :D\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Wow, nice job! :D\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ],\n  \"eventStart\" : \"2022-01-31T13:30:00Z\",\n  \"avgRating\" : 5,\n  \"id\" : \"activity-123\",\n  \"activityType\" : \"Walk\",\n  \"userId\" : \"{}\",\n  \"segments\" : [ {\n    \"activityId\" : \"{}\",\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"activityId\" : \"{}\",\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ]\n}, {\n  \"totalDuration\" : 90,\n  \"eventStop\" : \"2022-01-31T15:00:00Z\",\n  \"reviews\" : [ {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Wow, nice job! :D\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Wow, nice job! :D\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ],\n  \"eventStart\" : \"2022-01-31T13:30:00Z\",\n  \"avgRating\" : 5,\n  \"id\" : \"activity-123\",\n  \"activityType\" : \"Walk\",\n  \"userId\" : \"{}\",\n  \"segments\" : [ {\n    \"activityId\" : \"{}\",\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"activityId\" : \"{}\",\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Activity>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Activity>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> userUserIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> userUserIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"zip\" : \"21218\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Smith\",\n  \"gender\" : \"Male\",\n  \"city\" : \"Baltimore\",\n  \"created\" : \"2000-01-23\",\n  \"numActivities\" : 5,\n  \"middleName\" : \"\",\n  \"dateOfBirth\" : \"2000-01-23\",\n  \"id\" : \"user-123\",\n  \"state\" : \"MD\",\n  \"email\" : \"john.smith@bitsplease.com\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Review>> userUserIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Review>>(objectMapper.readValue("[ {\n  \"difficulty\" : \"Easy\",\n  \"review\" : \"Wow, nice job! :D\",\n  \"rating\" : 1,\n  \"id\" : \"review-123\",\n  \"timestamp\" : \"2022-01-31T13:30:00Z\"\n}, {\n  \"difficulty\" : \"Easy\",\n  \"review\" : \"Wow, nice job! :D\",\n  \"rating\" : 1,\n  \"id\" : \"review-123\",\n  \"timestamp\" : \"2022-01-31T13:30:00Z\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Review>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Review>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
