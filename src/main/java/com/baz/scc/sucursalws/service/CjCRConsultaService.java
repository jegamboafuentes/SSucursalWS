/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baz.scc.sucursalws.service;

import com.baz.scc.apisucursal.logic.CjCRLConsultaSucursal;
import com.baz.scc.apisucursal.model.CjCRRespuesta;
import com.baz.scc.sucursalws.model.CjCRTransaccion;
import static java.lang.Math.abs;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <br><br>Copyright 2014 Banco Azteca. Todos los derechos reservados.
 *
 * @author B941337 Mariana Pineda Villa
 */
@Service
public class CjCRConsultaService {

    @Autowired
    private CjCRLConsultaSucursal sucursal;
    
    public List<CjCRRespuesta> respuestaService(CjCRTransaccion transaccion) {
        int idSucursal, limitRow;
        String consultas;

        idSucursal = transaccion.getIdSucursal();
        consultas = transaccion.getConsultas();

        if (transaccion.getLimitRow() == null) {
            limitRow = 100;
        } else {
            limitRow = abs(transaccion.getLimitRow());
        }          
        
        return sucursal.getResponse(idSucursal, consultas, limitRow);
    }
}
