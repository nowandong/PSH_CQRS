package pshcqrs.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pshcqrs.OrderApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
