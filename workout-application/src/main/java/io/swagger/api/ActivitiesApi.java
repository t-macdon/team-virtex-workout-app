/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.Segment;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-21T17:54:50.241-04:00[America/New_York]")
@Validated
public interface ActivitiesApi {

    @Operation(summary = "Delete Activity", description = "Deletes an existing Activity object", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "The specified resource was deleted successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities/{activityId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> activitiesActivityIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId);


    @Operation(summary = "Get single Activity", description = "Find an existing Activity with the provided activityId", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The found Activity object", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Activity.class))),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities/{activityId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Activity> activitiesActivityIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId);


    @Operation(summary = "Get all Reviews posted on an Activity", description = "Gets a list of all known Reviews posted on an Activity", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The set of all Reviews", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Review.class)))),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities/{activityId}/reviews",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Review>> activitiesActivityIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId);


    @Operation(summary = "Create a new Segment object within an Activity", description = "Instantiate Segment object, populate it with data, and attach to Activity", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "The specified resource was created successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities/{activityId}/segment",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> activitiesActivityIdSegmentPost(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body);


    @Operation(summary = "Update an existing Segment object", description = "Updates based on provided segmentId", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The specified resource was updated successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities/{activityId}/segment",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> activitiesActivityIdSegmentPut(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Segment body);


    @Operation(summary = "Delete Segment within Activity", description = "Deletes an existing Segment object inside of an Activity", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "The specified resource was deleted successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities/{activityId}/segment/{segmentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> activitiesActivityIdSegmentSegmentIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId, @Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") String segmentId);


    @Operation(summary = "Get single Segment", description = "Find an existing Segment with the provided segmentId", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The found Segment object", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Segment.class))),

        @ApiResponse(responseCode = "404", description = "No Segment found with provided segmentId attached to Activity with provided activityId") })
    @RequestMapping(value = "/activities/{activityId}/segment/{segmentId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Segment> activitiesActivityIdSegmentSegmentIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate an Activity", required=true, schema=@Schema()) @PathVariable("activityId") String activityId, @Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Segment", required=true, schema=@Schema()) @PathVariable("segmentId") String segmentId);


    @Operation(summary = "Create a new Activity object", description = "Instantiate Activity object and populate it with data", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "The specified resource was created successfully") })
    @RequestMapping(value = "/activities",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> activitiesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Activity body);


    @Operation(summary = "Update an existing Activity object", description = "Updates based on provided activityId", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The specified resource was updated successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/activities",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> activitiesPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Activity body);

}

