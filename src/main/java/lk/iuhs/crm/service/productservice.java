package lk.iuhs.crm.service;

import lk.iuhs.crm.model.product;

import java.util.List;

public interface productservice {
    public product postdata(product pro);
    public List<product> getdata();
    public void deletedata(Integer id);
}
