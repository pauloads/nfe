package com.fincatto.nfe310.classes.nota.assinatura;

import org.simpleframework.xml.Element;

import com.fincatto.nfe310.classes.NFBase;

public class NFSignedInfo extends NFBase {

    @Element(name = "CanonicalizationMethod", required = false)
    private String canonicalizationMethod;

    @Element(name = "SignatureMethod", required = false)
    private String signatureMethod;

    @Element(name = "Reference", required = false)
    private NFReference reference;
}