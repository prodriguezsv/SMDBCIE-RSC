package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.taxonomy.*;

/**
* Protege name: IsRootTaxon
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultIsRootTaxon implements IsRootTaxon, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultIsRootTaxon() {
    this._internalInstanceName = "";
  }

  public DefaultIsRootTaxon(String instance_name) {
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
      abs.set(TaxonomyOntology.ISROOTTAXON_TAXON, (AbsTerm) onto.fromObject(getTaxon()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising IsRootTaxon");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      taxon = (Taxon)onto.toObject(abs.getAbsObject(TaxonomyOntology.ISROOTTAXON_TAXON));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising IsRootTaxon");
     }
   }

}
