package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Project;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Task
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-23T05:28:57.976Z[GMT]")


public class Task   {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    HIGH("High"),
    
    MEDIUM("Medium"),
    
    LOW("Low");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PriorityEnum fromValue(String text) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("priority")
  private PriorityEnum priority = null;

  @JsonProperty("completeDate")
  private OffsetDateTime completeDate = null;

  @JsonProperty("project")
  private Project project = null;

  public Task name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Conduct AWS Session", required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   **/
  @Schema(example = "High", required = true, description = "")
      @NotNull

    public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public Task completeDate(OffsetDateTime completeDate) {
    this.completeDate = completeDate;
    return this;
  }

  /**
   * Get completeDate
   * @return completeDate
   **/
  @Schema(example = "2016-08-29T09:12:33.001Z", description = "")
  
    @Valid
    public OffsetDateTime getCompleteDate() {
    return completeDate;
  }

  public void setCompleteDate(OffsetDateTime completeDate) {
    this.completeDate = completeDate;
  }

  public Task project(Project project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @Schema(description = "")
  
    @Valid
    public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.name, task.name) &&
        Objects.equals(this.priority, task.priority) &&
        Objects.equals(this.completeDate, task.completeDate) &&
        Objects.equals(this.project, task.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, priority, completeDate, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    completeDate: ").append(toIndentedString(completeDate)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
