package net.breezeware.spring_ai_rag.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class VectorStoreProperties {

    @Value("sfg.aiapp.vector-store-path")
    private String vectorStorePath;
}
