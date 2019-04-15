# trueautomation-java-example

You must have installed TrueAutomation client, JDK 8 or later. 

## How to run test: 

* Checkout project
 
```
clone https://github.com/stegrial/TA-801-w3c.git
```

* Init project use `trueautomation init` command

* Start driver

In a separate command line window, go to the project directory and start a required driver by running the command:

```bash
  ./drivers/chromedriver --port=4444 // for ChromeDriver

  ./drivers/geckodriver --port 4444 // for Geckodriver

  safaridriver --port 4444 // for SafariDriver
```

* Run test

```bash
mvn -Dtest=exampleTest test
```