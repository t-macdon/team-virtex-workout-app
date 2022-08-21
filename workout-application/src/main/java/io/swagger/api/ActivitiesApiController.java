package io.swagger.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.Segment;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

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
        if (!ID_TO_ACTIVITY_MAP.containsKey(activityId))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            ID_TO_ACTIVITY_MAP.remove(activityId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Get Activity by ID
     */
    public ResponseEntity<Activity> activitiesActivityIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(activityId))
        {
            return new ResponseEntity<Activity>(HttpStatus.NOT_FOUND);
        } else
        {
            Activity activity = ID_TO_ACTIVITY_MAP.get(activityId);
            return new ResponseEntity<Activity>(activity, HttpStatus.OK);
        }
    }

    /**
     * Get reviews associated with activity ID
     */
    public ResponseEntity<List<Review>> activitiesActivityIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId) {
        List<Review> reviews = new ArrayList<>();
        for (Review review : ReviewsApiController.ID_TO_REVIEW_MAP.values())
        {
            reviews.add(review);
        }
        return new ResponseEntity<List<Review>>(reviews, HttpStatus.OK);
    }

    /**
     * Add segment to Activity with activity ID
     */
    public ResponseEntity<Void> activitiesActivityIdSegmentPost(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(activityId))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            Activity activity = ID_TO_ACTIVITY_MAP.get(activityId);
            activity.getSegments().add(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
    }

    /**
     * Update segment with segment ID in Activity with activity ID
     */
    public ResponseEntity<Void> activitiesActivityIdSegmentPut(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(activityId))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            Activity activity = ID_TO_ACTIVITY_MAP.get(activityId);
            Iterator<Segment> itr = activity.getSegments().iterator();
            while (itr.hasNext())
            {
                Segment segment = itr.next();
                if (segment.getId() == body.getId())
                {
                    segment.setActivityId(body.getActivityId());
                    segment.setId(body.getId());
                    segment.setIndex(body.getIndex());
                    segment.setLocation(body.getLocation());
                    segment.setTimestamp(body.getTimestamp());
                    return new ResponseEntity<Void>(HttpStatus.OK);
                }
            }
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Remove segment with segment ID from Activity with activity ID
     */
    public ResponseEntity<Void> activitiesActivityIdSegmentSegmentIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") String segmentId) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(activityId))
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else
        {
            Activity activity = ID_TO_ACTIVITY_MAP.get(activityId);
            Iterator<Segment> itr = activity.getSegments().iterator();
            while (itr.hasNext())
            {
                Segment segment = itr.next();
                if (segment.getId() == segmentId)
                {
                    itr.remove();
                    return new ResponseEntity<Void>(HttpStatus.OK);
                }
            }
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get segment with segment ID from Activity with activity ID
     */
    public ResponseEntity<Segment> activitiesActivityIdSegmentSegmentIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId,@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") String segmentId) {
        if (!ID_TO_ACTIVITY_MAP.containsKey(activityId))
        {
            return new ResponseEntity<Segment>(HttpStatus.NOT_FOUND);
        } else
        {
            Activity activity = ID_TO_ACTIVITY_MAP.get(activityId);
            for (Segment segment : activity.getSegments())
            {
                if (segment.getId() == segmentId)
                {
                    return new ResponseEntity<Segment>(segment, HttpStatus.OK);
                }
            }
            return new ResponseEntity<Segment>(HttpStatus.NOT_FOUND);
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
