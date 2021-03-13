package com.lok.multifieldsearch.service;

import com.lok.multifieldsearch.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductService {

    Page<Product> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
