package io.swagger.api;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.Segment;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-21T17:54:50.241-04:00[America/New_York]")
@RestController
public class ActivitiesApiController implements ActivitiesApi {

    private static final Logger log = LoggerFactory.getLogger(ActivitiesApiController.class);

    public static HashMap<String, Activity> ID_TO_ACTIVITY_MAP = new HashMap<>();

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ActivitiesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /**
     * Delete Activity by ID
     */
    public ResponseEntity<Void> activitiesActivityIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Get Activity by ID
     */
    public ResponseEntity<Activity> activitiesActivityIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Activity>(objectMapper.readValue("{\n  \"totalDuration\" : 90,\n  \"eventStop\" : \"2022-01-31T15:00:00Z\",\n  \"reviews\" : [ {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Easy\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"difficulty\" : \"Easy\",\n    \"review\" : \"Easy\",\n    \"rating\" : 1,\n    \"id\" : \"review-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ],\n  \"eventStart\" : \"2022-01-31T13:30:00Z\",\n  \"avgRating\" : 5,\n  \"id\" : \"activity-123\",\n  \"activityType\" : \"Walk\",\n  \"userId\" : \"user-123\",\n  \"segments\" : [ {\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  }, {\n    \"index\" : 0,\n    \"location\" : {\n      \"lon\" : 6,\n      \"lat\" : 0\n    },\n    \"id\" : \"segment-123\",\n    \"timestamp\" : \"2022-01-31T13:30:00Z\"\n  } ]\n}", Activity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Activity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Activity>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Get reviews associated with activity ID
     */
    public ResponseEntity<List<Review>> activitiesActivityIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Review>>(objectMapper.readValue("[ {\n  \"difficulty\" : \"Easy\",\n  \"review\" : \"Easy\",\n  \"rating\" : 1,\n  \"id\" : \"review-123\",\n  \"timestamp\" : \"2022-01-31T13:30:00Z\"\n}, {\n  \"difficulty\" : \"Easy\",\n  \"review\" : \"Easy\",\n  \"rating\" : 1,\n  \"id\" : \"review-123\",\n  \"timestamp\" : \"2022-01-31T13:30:00Z\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Review>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Review>>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Add segment to Activity with activity ID
     */
    public ResponseEntity<Void> activitiesActivityIdSegmentPost(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Update segment with segment ID in Activity with activity ID
     */
    public ResponseEntity<Void> activitiesActivityIdSegmentPut(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Remove segment with segment ID from Activity with activity ID
     */
    public ResponseEntity<Void> activitiesActivityIdSegmentSegmentIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") String segmentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Get segment with segment ID from Activity with activity ID
     */
    public ResponseEntity<Segment> activitiesActivityIdSegmentSegmentIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") String segmentId) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            Activity activity = ID_TO_ACTIVITY_MAP.get(body.getId());
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Create Activity
     */
    public ResponseEntity<Void> activitiesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Activity body) {
        if (ID_TO_ACTIVITY_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        } else
        {
            ID_TO_ACTIVITY_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
    }

    /**
     * Update Activity
     */
    public ResponseEntity<Void> activitiesPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Activity body) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(body.getId()))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            ID_TO_ACTIVITY_MAP.put(body.getId(), body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

}
