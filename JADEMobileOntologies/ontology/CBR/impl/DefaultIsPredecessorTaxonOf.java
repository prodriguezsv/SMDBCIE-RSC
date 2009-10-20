package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: IsPredecessorTaxonOf
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultIsPredecessorTaxonOf implements IsPredecessorTaxonOf, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

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
   * Protege name: objectTaxon
   */
   private Taxon objectTaxon;
   public void setObjectTaxon(Taxon value) { 
    this.objectTaxon=value;
   }
   public Taxon getObjectTaxon() {
     return this.objectTaxon;
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(CBRTerminologyOntology.ISPREDECESSORTAXONOF_OBJECTTAXON, (AbsTerm) onto.fromObject(getObjectTaxon()));
      abs.set(CBRTerminologyOntology.ISPREDECESSORTAXONOF_SUBJECTTAXON, (AbsTerm) onto.fromObject(getSubjectTaxon()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising IsPredecessorTaxonOf");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      objectTaxon = (Taxon)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ISPREDECESSORTAXONOF_OBJECTTAXON));
      subjectTaxon = (Taxon)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ISPREDECESSORTAXONOF_SUBJECTTAXON));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising IsPredecessorTaxonOf");
     }
   }

}
