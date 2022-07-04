package myspringserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
  private var counter: Int = 0

  @GetMapping(Array("/greeting"))
  def greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = {
    counter += 1
    Greeting(counter, String.format(GreetingController.template, name))
  }
}

object GreetingController {
  val template = "Hello, %s! How are you?"
}