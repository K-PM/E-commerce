package com.escuelita.demo.services.interfaces;

import com.escuelita.demo.controllers.dtos.requests.CreateProductRequest;
import com.escuelita.demo.controllers.dtos.requests.UpdateProductRequest;
import com.escuelita.demo.controllers.dtos.responses.BaseResponse;
import com.escuelita.demo.entities.Product;
import org.springframework.web.multipart.MultipartFile;

public interface IProductService {

    BaseResponse list();

    BaseResponse get(Long id);

    Product findProductbyId(Long id);

    BaseResponse create(CreateProductRequest request);

    BaseResponse update(Long id, UpdateProductRequest request);

    void delete(Long id);

}
