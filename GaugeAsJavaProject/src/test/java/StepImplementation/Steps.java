package StepImplementation;

import Utils.DriverManager;

public class Steps {
    public Steps () {
        if(DriverManager.driver == null){
            new DriverManager();
        }
    }
}
