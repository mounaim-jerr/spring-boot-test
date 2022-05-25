package testcom.example.firsttest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/testModels")
public class FirstTestController {
    private List<TestModel> testModels;

    public FirstTestController() {
        testModels = new ArrayList<>();
        testModels.add(new TestModel("mohammed jerroudi", "FA132435",24,2,300));
        testModels.add(new TestModel("ilyass dahmani", "FA125435",34,5,200));
        testModels.add(new TestModel("mounaim jerroudi", "FA141735",27,1,300));
        testModels.add(new TestModel("nourdin arbaoui", "FA202015",14,3,150));
    }
    @RequestMapping(value ="/all",method = RequestMethod.GET)
    public List<TestModel> getAll(){
        return testModels;
    }
@RequestMapping(value = "ages/{ages}", method = RequestMethod.GET)
    public List<TestModel> getAges(@PathVariable double ages) {
        return testModels.stream().filter( x ->  x.getClientAge() <= ages).collect(Collectors.toList());
    }
}
