package myspringserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation.{Bean, Primary}

@SpringBootApplication
class GreetingConfig {
  @Bean
  @Primary
  def objectMapper(): ObjectMapper = {
    val objectMapper = new ObjectMapper
    objectMapper.registerModule(DefaultScalaModule)
    objectMapper
  }
}

object GreetingApplication extends App {
  org.springframework.boot.SpringApplication.run(classOf[GreetingConfig])
}