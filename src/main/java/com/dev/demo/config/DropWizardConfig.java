package com.dev.demo.config;

import com.dev.demo.controller.EmployeeController;

import io.dropwizard.*;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropWizardConfig extends Application<Configuration> {

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap) {
		super.initialize(bootstrap);
	}

	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
		environment.jersey().register(new EmployeeController(environment.getValidator()));
	}

	public static void main(String[] args) throws Exception {
		new DropWizardConfig().run(args);
	}
}
