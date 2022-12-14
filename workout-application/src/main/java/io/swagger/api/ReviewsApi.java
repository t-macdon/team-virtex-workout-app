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
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.model.Review;
import io.swagger.model.ReviewDifficulty;
import io.swagger.model.ReviewRating;
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
public interface ReviewsApi {

    @Operation(summary = "Create a new Review object", description = "Instantiate Review object and populate it with data", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "The specified resource was created successfully") })
    @RequestMapping(value = "/reviews",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> reviewsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Review body);


    @Operation(summary = "Update an existing Review object", description = "Updates based on provided reviewId", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The specified resource was updated successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/reviews",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> reviewsPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Review body);


    @Operation(summary = "Find reviews via a search query", description = "Narrow down reviews by querying by multiple parameters", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The set of Reviews that match search query", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Review.class)))) })
    @RequestMapping(value = "/reviews/query",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Review>> reviewsQueryGet(@Parameter(in = ParameterIn.QUERY, description = "The review's difficulty value" ,schema=@Schema()) @Valid @RequestParam(value = "difficulty", required = false) ReviewDifficulty difficulty, @Parameter(in = ParameterIn.QUERY, description = "The review's rating" ,schema=@Schema()) @Valid @RequestParam(value = "rating", required = false) ReviewRating rating);


    @Operation(summary = "Delete Review", description = "Deletes an existing Review object", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "The specified resource was deleted successfully"),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/reviews/{reviewId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> reviewsReviewIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Review", required=true, schema=@Schema()) @PathVariable("reviewId") String reviewId);


    @Operation(summary = "Get single Review", description = "Find the existing Review with the provided reviewId", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The found Review object", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Review.class))),

        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/reviews/{reviewId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Review> reviewsReviewIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Review", required=true, schema=@Schema()) @PathVariable("reviewId") String reviewId);

}

