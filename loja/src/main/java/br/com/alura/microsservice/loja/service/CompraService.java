package br.com.alura.microsservice.loja.service;

import br.com.alura.microsservice.loja.controller.dto.CompraDTO;
import br.com.alura.microsservice.loja.controller.dto.infoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CompraService {
    public void realizaCompra(CompraDTO compra) {

        RestTemplate client = new RestTemplate();
        ResponseEntity<infoFornecedorDTO> exchange =
        client.exchange("http://localhosto:8081/info/"+compra.getEndereco().getEstado(),
        HttpMethod.GET, null, infoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEdereco());
    }
}
