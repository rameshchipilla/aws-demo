package io.swagger.api;

import io.swagger.model.Task;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-23T05:28:57.976Z[GMT]")
@RestController
public class TasksApiController implements TasksApi {

    private static final Logger log = LoggerFactory.getLogger(TasksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TasksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addTask(@Parameter(in = ParameterIn.DEFAULT, description = "Inventory item to add", schema=@Schema()) @Valid @RequestBody Task body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Task>> searchTask(@Parameter(in = ParameterIn.QUERY, description = "pass an optional search string for looking up task" ,schema=@Schema()) @Valid @RequestParam(value = "searchString", required = false) String searchString,@Parameter(in = ParameterIn.QUERY, description = "pass project name to lookup a task from project" ,schema=@Schema()) @Valid @RequestParam(value = "projectName", required = false) String projectName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Task>>(objectMapper.readValue("[ {\n  \"name\" : \"Conduct AWS Session\",\n  \"project\" : {\n    \"name\" : \"AWS Demo\",\n    \"description\" : \"Project to track tasks for AWS Demo\"\n  },\n  \"priority\" : \"High\",\n  \"completeDate\" : \"2016-08-29T09:12:33.001Z\"\n}, {\n  \"name\" : \"Conduct AWS Session\",\n  \"project\" : {\n    \"name\" : \"AWS Demo\",\n    \"description\" : \"Project to track tasks for AWS Demo\"\n  },\n  \"priority\" : \"High\",\n  \"completeDate\" : \"2016-08-29T09:12:33.001Z\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Task>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Task>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
