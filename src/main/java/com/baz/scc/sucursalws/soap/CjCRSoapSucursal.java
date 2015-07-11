/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baz.scc.sucursalws.soap;

import com.baz.scc.apisucursal.model.CjCRRespuesta;
import com.baz.scc.sucursalws.model.CjCRTransaccion;
import com.baz.scc.sucursalws.service.CjCRConsultaService;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br><br>Copyright 2014 Banco Azteca. Todos los derechos reservados.
 *
 * @author B941337 Mariana Pineda Villa
 *
 * Servicio SOAP
 */
@Component("apiSucursalService")
@WebService(serviceName = "apisucursal")
public class CjCRSoapSucursal {

    @Autowired
    private CjCRConsultaService consultaService;

    @WebMethod(operationName = "consultaSucursal")
    public List<CjCRRespuesta> ejecutar(CjCRTransaccion transaccion) {    
        return consultaService.respuestaService(transaccion);
    }
}
