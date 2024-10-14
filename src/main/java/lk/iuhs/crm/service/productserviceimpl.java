package lk.iuhs.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.iuhs.crm.entity.productentity;
import lk.iuhs.crm.model.product;
import lk.iuhs.crm.repository.productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class productserviceimpl implements productservice {

    @Autowired
    productrepository repo;

    @Autowired
    ObjectMapper mapper;

    public product postdata(product pro) {
        productentity productentity = mapper.convertValue(pro, productentity.class);
        repo.save(productentity);
        return mapper.convertValue(repo.save(productentity), product.class);

    }

    public List<product> getdata() {

        Iterable<productentity> all = repo.findAll();
        List<product> list = new ArrayList<>();
        all.forEach(productentity -> {
            list.add(mapper.convertValue(productentity, product.class));
        });
        return list;
    }

    public void deletedata(Integer id){

        Optional<productentity> byId = repo.findById(id);
        repo.delete(byId.get());

    }

}
