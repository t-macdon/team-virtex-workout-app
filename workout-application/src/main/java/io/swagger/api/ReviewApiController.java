package io.swagger.api;

import io.swagger.model.Review;
import io.swagger.model.Reviewpropertiesdifficulty;
import io.swagger.model.Reviewpropertiesid;
import io.swagger.model.Reviewpropertiesrating;
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
public class ReviewApiController implements ReviewApi {

    private static final Logger log = LoggerFactory.getLogger(ReviewApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReviewApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> reviewPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Review body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> reviewPut(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Review body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Review>> reviewQueryGet(@Parameter(in = ParameterIn.QUERY, description = "The review's difficulty value" ,schema=@Schema()) @Valid @RequestParam(value = "difficulty", required = false) Reviewpropertiesdifficulty difficulty,@Parameter(in = ParameterIn.QUERY, description = "The review's rating" ,schema=@Schema()) @Valid @RequestParam(value = "rating", required = false) Reviewpropertiesrating rating) {
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

    public ResponseEntity<Void> reviewReviewIdDelete(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Review", required=true, schema=@Schema()) @PathVariable("reviewId") Reviewpropertiesid reviewId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Review> reviewReviewIdGet(@Parameter(in = ParameterIn.PATH, description = "An id to uniquely locate a Review", required=true, schema=@Schema()) @PathVariable("reviewId") Reviewpropertiesid reviewId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Review>(objectMapper.readValue("{\n  \"difficulty\" : \"Easy\",\n  \"review\" : \"Wow, nice job! :D\",\n  \"rating\" : 1,\n  \"id\" : \"review-123\",\n  \"timestamp\" : \"2022-01-31T13:30:00Z\"\n}", Review.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Review>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Review>(HttpStatus.NOT_IMPLEMENTED);
    }

}
