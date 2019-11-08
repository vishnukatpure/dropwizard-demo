# Drop Wizard(Java based Micro Services Framework) demo
internally uses Jetty as Server, Jersey (JAX-RS implemeentation) Rest Services

# How to run
1. Run As -> Run Configuration <br/>
2. Click on Arguments copy-> server config.yml <- paste into Program arguments<br/>
3. Run<br/>

# config.yml?
  Dropwizard application has its own subclass of the Configuration class which specifies environment-specific parameters. These parameters are specified in a YAML configuration file which is deserialized to an instance of your application’s configuration class and validated
  
# How to check Rest Servcies in app
1. Get Employees<br/>
  Method: GET Url: http://localhost:8080/dropwizard-demo/api/employee/1 
