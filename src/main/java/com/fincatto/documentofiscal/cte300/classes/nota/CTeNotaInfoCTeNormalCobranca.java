package com.fincatto.documentofiscal.cte300.classes.nota;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;

/**
 * @author Caio
 * @info Dados da cobrança do CT-e
 * */

@Root(name = "cobr")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalCobranca extends DFBase{

	@Element(name = "fat", required = false)
    private CTeNotaInfoCTeNormalCobrancaFatura fatura;
	
	@Element(name = "dup", required = false)
    private List<CTeNotaInfoCTeNormalCobrancaDuplicata> duplicata;

	public CTeNotaInfoCTeNormalCobranca() {
		this.fatura = null;
		this.duplicata = null;
	}

	public CTeNotaInfoCTeNormalCobrancaFatura getFatura() {
		return fatura;
	}

	/**
	 * Dados da fatura
	 * */
	public void setFatura(CTeNotaInfoCTeNormalCobrancaFatura fatura) {
		this.fatura = fatura;
	}

	public List<CTeNotaInfoCTeNormalCobrancaDuplicata> getDuplicata() {
		return duplicata;
	}

	/**
	 * Dados das duplicatas
	 * */
	public void setDuplicata(List<CTeNotaInfoCTeNormalCobrancaDuplicata> duplicata) {
		this.duplicata = duplicata;
	}
}
