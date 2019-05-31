package ru.kborodulin.task14;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JsonTest {
    private String type;
    private Value value;
}
