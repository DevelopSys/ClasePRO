package controller;

import repository.ProductCRUDRepository;

public class TiendaController {

    private ProductCRUDRepository productCRUDRepository;

    public TiendaController(){
        productCRUDRepository = new ProductCRUDRepository();


        productCRUDRepository.getProductoId();
    }
}
