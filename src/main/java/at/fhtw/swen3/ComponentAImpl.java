package at.fhtw.swen3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentAImpl implements ComponentA{

    @Autowired
    private ComponentB componentB;

    @Override
    public void demo(){
        componentB.sayHello();
        componentB.saveOnePerson();
        componentB.printAllPerson();
    }
}
