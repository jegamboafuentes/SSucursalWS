/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baz.scc.sucursalws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <br><br>Copyright 2014 Banco Azteca. Todos los derechos reservados.
 *
 * @author B941337 Mariana Pineda Villa
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CjCRTransaccion {

    @XmlElement(required = true)
    private int idSucursal;

    @XmlElement(required = true)
    private String consultas;

    @XmlElement(required = true, nillable = true)
    private Integer limitRow;

    public Integer getLimitRow() {
        return limitRow;
    }

    public void setLimitRow(Integer limitRow) {
        this.limitRow = limitRow;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getConsultas() {
        return consultas;
    }

    public void setConsultas(String consultas) {
        this.consultas = consultas;
    }

}
