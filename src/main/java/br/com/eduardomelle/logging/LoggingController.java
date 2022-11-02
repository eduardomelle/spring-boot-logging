package br.com.eduardomelle.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

  Logger logger = LoggerFactory.getLogger(LoggingController.class);

  @RequestMapping("/")
  public String index() {
    logger.trace("A TRACE Message");
    logger.debug("A DEBUG Message");
    logger.info("An INFO Message");
    logger.warn("A WARN Message");
    logger.error("An ERROR Message");

    Person person = new Person();
    person.setId(1L);
    person.setName("Eduardo");
    person.setPassword("1234");
    logger.error(person.toString());

    return "Howdy! Check out the Logs to see the output...";
  }

}
