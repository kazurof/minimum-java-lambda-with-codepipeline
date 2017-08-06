package codepipelinesample;

import com.amazonaws.services.lambda.runtime.Context;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;


/**
 * Start point for AWS Lambda.
 * Name of handler is 'codepipelinesample.Main::start'.
 */
public class Main {
  public String start(Map<?, ?> name, Context context) {
    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    return "The time in Los Angeles is: " + DateTimeFormatter.ISO_ZONED_DATE_TIME.format(now);
  }
}
