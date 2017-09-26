package com.fincatto.documentofiscal.cte300.classes.consultastatusservico;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.DFUnidadeFederativa;

@Root(name = "retConsStatServCte")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeConsStatServRet extends DFBase{

	@Element(name = "tpAmb", required = false)
    private DFAmbiente ambiente;
	
	@Element(name = "verAplic", required = false)
    private String versaoAplicacao;
    
	@Element(name = "cStat", required = false)
    private String codigoStatus;
    
	@Element(name = "xMotivo", required = false)
    private String motivo;
    
	@Element(name = "cUF", required = false)
    private DFUnidadeFederativa uf;
    
	@Element(name = "dhRecbto", required = false)
    private String dataRecebimento;
    
	@Element(name = "tMed", required = false)
    private String tempoMedio;
    
	@Element(name = "dhRetorno", required = false)
    private String dataRetorno;
    
	@Element(name = "xObs", required = false)
    private String Observacao;
    
    @Attribute(name = "versao", required = false)
    private String versao;

    public CTeConsStatServRet(){
    	this.ambiente = null;
    	this.versaoAplicacao = null;
    	this.codigoStatus = null;
    	this.motivo = null;
    	this.uf = null;
    	this.dataRecebimento = null;
    	this.tempoMedio = null;
    	this.dataRetorno = null;
    	this.Observacao = null;
    	this.versao = null;
    }

	public DFAmbiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(DFAmbiente ambiente) {
		this.ambiente = ambiente;
	}

	public String getVersaoAplicacao() {
		return versaoAplicacao;
	}

	public void setVersaoAplicacao(String versaoAplicacao) {
		this.versaoAplicacao = versaoAplicacao;
	}

	public String getCodigoStatus() {
		return codigoStatus;
	}

	public void setCodigoStatus(String codigoStatus) {
		this.codigoStatus = codigoStatus;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public DFUnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(DFUnidadeFederativa uf) {
		this.uf = uf;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(String tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

	public String getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(String dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}
   
}
