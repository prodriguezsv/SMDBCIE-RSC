package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.taxonomy.*;

/**
* Protege name: IsPredecessorTaxonOf
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultIsPredecessorTaxonOf implements IsPredecessorTaxonOf, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultIsPredecessorTaxonOf() {
    this._internalInstanceName = "";
  }

  public DefaultIsPredecessorTaxonOf(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: subjectTaxon
   */
   private Taxon subjectTaxon;
   public void setSubjectTaxon(Taxon value) { 
    this.subjectTaxon=value;
   }
   public Taxon getSubjectTaxon() {
     return this.subjectTaxon;
   }

   /**
   * Protege name: objectTaxon
   */
   private Taxon objectTaxon;
   public void setObjectTaxon(Taxon value) { 
    this.objectTaxon=value;
   }
   public Taxon getObjectTaxon() {
     return this.objectTaxon;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(TaxonomyOntology.ISPREDECESSORTAXONOF_SUBJECTTAXON, (AbsTerm) onto.fromObject(getSubjectTaxon()));
      abs.set(TaxonomyOntology.ISPREDECESSORTAXONOF_OBJECTTAXON, (AbsTerm) onto.fromObject(getObjectTaxon()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising IsPredecessorTaxonOf");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      subjectTaxon = (Taxon)onto.toObject(abs.getAbsObject(TaxonomyOntology.ISPREDECESSORTAXONOF_SUBJECTTAXON));
      objectTaxon = (Taxon)onto.toObject(abs.getAbsObject(TaxonomyOntology.ISPREDECESSORTAXONOF_OBJECTTAXON));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising IsPredecessorTaxonOf");
     }
   }

}
