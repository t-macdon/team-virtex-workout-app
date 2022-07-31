package io.swagger.api;

import io.swagger.model.Activity;
import io.swagger.model.Activitypropertiesid;
import io.swagger.model.Review;
import io.swagger.model.Segment;
import io.swagger.model.Segmentpropertiesid;
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
public class ActivityApiController implements ActivityApi {

    private static final Logger log = LoggerFactory.getLogger(ActivityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ActivityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> activityActivityIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Activity> activityActivityIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Activity>(objectMapper.readValue("{\n  \"totalDuration\" : 90,\n  \"eventStop\" : \"2022-01-31T15:00:00Z\",\n  \"reviews\" : [ {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Wow, nice job! :D\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Wow, nice job! :D\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ],\n  \"eventStart\" : \"2022-01-31T13:30:00Z\",\n  \"avgRating\" : 5,\n  \"id\" : \"activity-123\",\n  \"activityType\" : \"Walk\",\n  \"userId\" : \"{}\",\n  \"segments\" : [ {\n    \"activityId\" : \"{}\",\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"activityId\" : \"{}\",\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ]\n}", Activity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Activity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Activity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Review>> activityActivityIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId) {
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

    public ResponseEntity<Void> activityActivityIdSegmentPost(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> activityActivityIdSegmentPut(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> activityActivityIdSegmentSegmentIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId,@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") Segmentpropertiesid segmentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Segment> activityActivityIdSegmentSegmentIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") Activitypropertiesid activityId,@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") Segmentpropertiesid segmentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Segment>(objectMapper.readValue("{\n  \"activityId\" : \"{}\",\n  \"index\" : 0,\n  \"location\" : {\n    \"lon\" : 6,\n    \"lat\" : 0\n  },\n  \"id\" : \"segment-123\",\n  \"timestamp\" : \"2022-01-31T13:30:00Z\"\n}", Segment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Segment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Segment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> activityPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Activity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> activityPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Activity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
