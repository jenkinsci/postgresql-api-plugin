package io.jenkins.plugins.postgresqlapi;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

class ClasspathTest {

    @Test
    void testClasspath() throws ClassNotFoundException {
        assertThat(Class.forName("org.postgresql.Driver"), notNullValue());
    }

    @Test
    void testDriver() {
        org.postgresql.Driver driver = new org.postgresql.Driver();
        assertThat(driver.acceptsURL("jdbc:postgresql://localhost/postgres"), is(true));
    }
}