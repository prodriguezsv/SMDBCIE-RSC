package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: IsSheetTaxon
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultIsSheetTaxon implements IsSheetTaxon, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultIsSheetTaxon() {
    this._internalInstanceName = "";
  }

  public DefaultIsSheetTaxon(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: taxon
   */
   private Taxon taxon;
   public void setTaxon(Taxon value) { 
    this.taxon=value;
   }
   public Taxon getTaxon() {
     return this.taxon;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(CBRTerminologyOntology.ISSHEETTAXON_TAXON, (AbsTerm) onto.fromObject(getTaxon()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising IsSheetTaxon");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      taxon = (Taxon)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ISSHEETTAXON_TAXON));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising IsSheetTaxon");
     }
   }

}
