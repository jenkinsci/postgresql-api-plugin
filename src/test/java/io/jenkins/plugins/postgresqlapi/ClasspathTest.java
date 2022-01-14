package io.jenkins.plugins.postgresqlapi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ClasspathTest {
    @Test
    public void testClasspath() throws ClassNotFoundException {
        assertThat(Class.forName("org.postgresql.Driver"), notNullValue());
    }

    @Test
    public void testDriver() {
        org.postgresql.Driver driver = new org.postgresql.Driver();
        assertThat(driver.acceptsURL("jdbc:postgresql://localhost/postgres"), is(true));
    }
}