package org.gradle.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloWorldController {

    @RequestMapping(value="/", method=GET)
    @ResponseBody
    public String callScalaMovieRatingCode() {
        MovieRatings.CalculateAverageRating();
        return "Hello World!";
    }
}
