package com.fincatto.nfe310.classes.nota;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;
import com.fincatto.nfe310.classes.NFNotaInfoItemImpostoICMSModalidadeBaseCalulo;
import com.fincatto.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import com.fincatto.nfe310.classes.NFOrigem;
import com.fincatto.nfe310.classes.nota.NFNotaInfoItemImpostoICMS10;

public class NFNotaInfoItemImpostoICMS10Test {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setPercentualAliquota(new BigDecimal("100"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setPercentualAliquotaImpostoICMSST(new BigDecimal("100"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualMargemValorICMSSTComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setPercentualMargemValorICMSST(new BigDecimal("100"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualReducaoBCICMSSTComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setPercentualReducaoBCICMSST(new BigDecimal("100"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setValorBaseCalculo(new BigDecimal("1000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBCICMSSTTributoComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setValorBCICMSST(new BigDecimal("1000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSSTComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setValorICMSST(new BigDecimal("1000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS10().setValorTributo(new BigDecimal("1000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeBaseCalculoNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeDeterminacaoBCICMSNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaImpostoICMSSTNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test
    public void devePermitirPercentualMargemValorICMSSTNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test
    public void devePermitirPercentualReducaoBCICMSSTNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSSTNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSSTNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoNulo() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms10.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms10.setModalidadeDeterminacaoBCICMS(NFNotaInfoItemModalidadeBCICMSST.PAUTA);
        icms10.setOrigem(NFOrigem.NACIONAL);
        icms10.setPercentualAliquota(new BigDecimal("99.99"));
        icms10.setPercentualAliquotaImpostoICMSST(new BigDecimal("99.99"));
        icms10.setPercentualMargemValorICMSST(new BigDecimal("99.99"));
        icms10.setPercentualReducaoBCICMSST(new BigDecimal("99.99"));
        icms10.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA_OU_NAO_TRIBUTADA_COM_COBRANCA_ICMS_POR_SUBSTITUICAO_TRIBUTARIA);
        icms10.setValorBaseCalculo(new BigDecimal("999999999999.99"));
        icms10.setValorBCICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorICMSST(new BigDecimal("999999999999.99"));
        icms10.setValorTributo(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<NFNotaInfoItemImpostoICMS10><orig>0</orig><CST>30</CST><modBC>1</modBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><modBCST>5</modBCST><pMVAST>99.99</pMVAST><pRedBCST>99.99</pRedBCST><vBCST>999999999999.99</vBCST><pICMSST>99.99</pICMSST><vICMSST>999999999999.99</vICMSST></NFNotaInfoItemImpostoICMS10>";
        Assert.assertEquals(xmlEsperado, icms10.toString());
    }
}