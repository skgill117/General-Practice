package com.ecommerce;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ecommerce.entity.Product;
import com.ecommerce.service.BrandService;
import com.ecommerce.service.ColorService;
import com.ecommerce.service.ProductCategoryService;
import com.ecommerce.service.ProductService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ProductAPITest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;
    
    @MockBean
    private BrandService brandService;
    
    @MockBean
    private ColorService colorService;
    
    @MockBean
    private ProductCategoryService productCategoryService;

    @Test
    public void findAll() throws Exception {
        Product product = new Product();
        product.setBrandId(2);
        product.setCatagoryId(2);
        product.setId(1);
        product.setName("Shirt");
        product.setQuantity(5);

        List<Product> products = Arrays.asList(product);
        given(productService.findAll()).willReturn(products);

        this.mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'brandId' : 2,'name': 'Shirt','quantity' : 5}]"));
    }
}