package football.exercise;

import java.util.Optional;

public class OptionalClass {
    public OptionalClass() {
    }
    public void test(String x, Optional<String> yOpt) { 
        String y = yOpt.isPresent() ? yOpt.get() : "Java 8 default parameter"; 
        System.out.println(x+" "+y); 
    }
    
}