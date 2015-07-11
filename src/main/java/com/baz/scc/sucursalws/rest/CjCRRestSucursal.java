/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baz.scc.sucursalws.rest;

import com.baz.scc.apisucursal.model.CjCRRespuesta;
import com.baz.scc.sucursalws.model.CjCRTransaccion;
import com.baz.scc.sucursalws.service.CjCRConsultaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <br><br>Copyright 2014 Banco Azteca. Todos los derechos reservados.
 *
 * @author B941337 Mariana Pineda Villa
 */
@Controller
@RequestMapping("/services/rest")
public class CjCRRestSucursal {

    @Autowired
    private CjCRConsultaService consultaService;

    @ResponseBody
    @RequestMapping(value = "/consulta", 
            method = {RequestMethod.POST},
           consumes = { MediaType.APPLICATION_JSON },
            produces = { MediaType.APPLICATION_JSON })
    public List<CjCRRespuesta> ejecutar(
            @RequestBody CjCRTransaccion transaccion){
        return consultaService.respuestaService(transaccion);
    }
}
