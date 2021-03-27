package spring.io.project.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Engine {

    @Value("${engine.type}")
    private String engineType;


}
