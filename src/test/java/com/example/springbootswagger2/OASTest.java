// package com.example.springbootswagger2;

// import io.github.robwin.swagger.test.SwaggerAssertions;
// import org.junit.jupiter.api.Test;

// import org.junit.runner.RunWith;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
// import org.springframework.boot.web.server.LocalServerPort;
// import org.springframework.test.context.junit4.SpringRunner;
// import java.io.File;
// import java.io.IOException;
// import java.io.InputStream;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.nio.file.StandardCopyOption;
// import java.net.URL;

// @RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes =
// DemoApplication.class)
// public class OASTest {

// @LocalServerPort
// int port;

// @Test
// public void implementationMatchesOasSpec() {
// // String oasFile = OASTest.class.getResource("/swagger.yaml").getPath();
// // String jsonSpecUrl = String.format("http://localhost:%d/api-docs", port);

// // System.out.println(">>> oasFile: " + oasFile);
// // System.out.println(">>> jsonSpecUrl: " + jsonSpecUrl);

// // String jsonSpec = System.getProperty("user.dir") +
// // "/src/test/resources/api-docs.json";

// // try {
// // InputStream inputStream = new URL(jsonSpecUrl).openStream();
// // Files.copy(inputStream, Paths.get(jsonSpec),
// // StandardCopyOption.REPLACE_EXISTING);
// // } catch (IOException e) {
// // System.out.println(">>> OOPS: " + e.getMessage());
// // }

// String oasFile = OASTest.class.getResource("/swagger.yaml").getPath();
// String jsonFile = OASTest.class.getResource("/api-docs.json").getPath();

// File X = new File(oasFile);
// File Y = new File(jsonFile);

// System.out.println(">>> oasFile: " + oasFile);
// System.out.println(">>> jsonFile: " + jsonFile);
// System.out.println(">>> X: " + X.getAbsolutePath());
// System.out.println(">>> Y: " + Y.getAbsolutePath());

// // SwaggerAssertions.assertThat(swaggerSchemaUrl).isEqualTo(apiContract);
// // SwaggerAssertions.assertThat(X).isEqualTo(X);
// SwaggerAssertions.assertThat(oasFile).isEqualTo(jsonFile);
// }
// }