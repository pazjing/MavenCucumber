package com.cucumber.MavenCucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jingbai on 6/17/17.
 */
@RunWith(Cucumber.class)
@Cucumber.Options (
        format ={"pretty","html:target/html/"},
        features = "src/test/resource",
        glue = { "com.cucumber.MavenCucumber"},
        tags = { "@web"}
)
public class webRunnerTest {
}
