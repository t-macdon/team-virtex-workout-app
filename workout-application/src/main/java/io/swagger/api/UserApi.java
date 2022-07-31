/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Activity;
import io.swagger.model.Review;
import io.swagger.model.User;
import io.swagger.model.Userpropertiesid;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-30T20:31:30.649-04:00[America/New_York]")
@Validated
public interface UserApi {

    @Operation(summary = "Create a new User object", description = "Instantiate User object and populate it with data", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The specified resource was created successfully") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody User body);


    @Operation(summary = "Update an existing User object", description = "Updates based on provided userId", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The specified resource was updated successfully"),
        
        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> userPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody User body);


    @Operation(summary = "Get all Activities for a User", description = "Gets a list of all known Activities associated with a provided User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The set of all Users", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Activity.class)))),
        
        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/user/{userId}/activities",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Activity>> userUserIdActivitiesGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId);


    @Operation(summary = "Delete User", description = "Deletes an existing User object", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "The specified resource was deleted successfully"),
        
        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/user/{userId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> userUserIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId);


    @Operation(summary = "Get single User", description = "Find the existing User with the provided userId", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The found User object", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/user/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> userUserIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId);


    @Operation(summary = "Get all Reviews made by a User", description = "Gets a list of all known Reviews posted by a User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The set of all Reviews", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Review.class)))),
        
        @ApiResponse(responseCode = "404", description = "One or more specified resources were not found") })
    @RequestMapping(value = "/user/{userId}/reviews",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Review>> userUserIdReviewsGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a User", required=true, schema=@Schema()) @PathVariable("userId") Userpropertiesid userId);

}
