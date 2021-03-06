package com.fincatto.nfe200.classes.nota;

import org.simpleframework.xml.Element;

import com.fincatto.nfe200.classes.NFBase;
import com.fincatto.nfe200.classes.NFUnidadeFederativa;
import com.fincatto.nfe200.validadores.IntegerValidador;
import com.fincatto.nfe200.validadores.StringValidador;

public class NFInfoProdutorRuralReferenciada extends NFBase {
    @Element(name = "cUF", required = true)
    private NFUnidadeFederativa ufEmitente;

    @Element(name = "AAMM", required = true)
    private String anoMesEmissao;

    @Element(name = "CNPJ", required = false)
    private String cnpjEmitente;

    @Element(name = "CPF", required = false)
    private String cpfEmitente;

    @Element(name = "IE", required = true)
    private String ieEmitente;

    @Element(name = "mod", required = true)
    private String modeloDocumentoFiscal;

    @Element(name = "serie", required = true)
    private Integer serieDocumentoFiscal;

    @Element(name = "nNF", required = true)
    private Integer numeroDocumentoFiscal;

    public void setUfEmitente(final NFUnidadeFederativa ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public void setAnoMesEmissao(final String anoMesEmissao) {
        StringValidador.aamm(anoMesEmissao);
        this.anoMesEmissao = anoMesEmissao;
    }

    public void setCnpjEmitente(final String cnpjEmitente) {
        if (this.cpfEmitente != null) {
            throw new IllegalStateException("Nao pode setar CNPJ pois CPF ja esta setado");
        }
        StringValidador.cnpj(cnpjEmitente);
        this.cnpjEmitente = cnpjEmitente;
    }

    public void setCpfEmitente(final String cpfEmitente) {
        if (this.cnpjEmitente != null) {
            throw new IllegalStateException("Nao pode setar CPF pois CNPJ ja esta setado");
        }
        StringValidador.cpf(cpfEmitente);
        this.cpfEmitente = cpfEmitente;
    }

    public void setIeEmitente(final String ieEmitente) {
        StringValidador.inscricaoEstadual(ieEmitente);
        this.ieEmitente = ieEmitente;
    }

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
        StringValidador.exatamente2(modeloDocumentoFiscal);
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public void setSerieDocumentoFiscal(final Integer serieDocumentoFiscal) {
        IntegerValidador.tamanho3(serieDocumentoFiscal);
        this.serieDocumentoFiscal = serieDocumentoFiscal;
    }

    public void setNumeroDocumentoFiscal(final Integer numeroDocumentoFiscal) {
        IntegerValidador.tamanho6(numeroDocumentoFiscal);
        this.numeroDocumentoFiscal = numeroDocumentoFiscal;
    }
}