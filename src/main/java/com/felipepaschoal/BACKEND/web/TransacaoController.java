package com.felipepaschoal.BACKEND.web;

import com.felipepaschoal.BACKEND.entity.TransacaoReport;
import com.felipepaschoal.BACKEND.service.TransacaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transacoes")
public class TransacaoController {
    private final TransacaoService service;

    public TransacaoController(TransacaoService service) {
        this.service = service;
    }

    @GetMapping
    List<TransacaoReport> listAll(){
        return service.listTotaisTransacoesPorNomeDaLoja();
    }
}
