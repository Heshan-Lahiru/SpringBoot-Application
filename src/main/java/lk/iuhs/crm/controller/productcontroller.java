package lk.iuhs.crm.controller;

import lk.iuhs.crm.model.product;
import lk.iuhs.crm.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class productcontroller {

    @Autowired
    productservice proservice;

    @PostMapping("/product")
    public product datapost(@RequestBody product pro){
    return proservice.postdata(pro);
     }

    @GetMapping("/product")
    public List<product> getdata(){
        return proservice.getdata();
    }


    @DeleteMapping("/product")
    public void deletedata(@RequestParam (name ="id") Integer id){
        proservice.deletedata(id);
    }


}
