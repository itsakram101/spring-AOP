package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name){
        String mssg = "Hello "+ name +" !!!";
        System.out.println(mssg);
        return mssg;
    }
}
