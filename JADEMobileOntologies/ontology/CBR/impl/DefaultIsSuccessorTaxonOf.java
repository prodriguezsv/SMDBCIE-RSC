package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: IsSuccessorTaxonOf
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultIsSuccessorTaxonOf implements IsSuccessorTaxonOf, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultIsSuccessorTaxonOf() {
    this._internalInstanceName = "";
  }

  public DefaultIsSuccessorTaxonOf(String instance_name) {
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
      abs.set(CBRTerminologyOntology.ISSUCCESSORTAXONOF_OBJECTTAXON, (AbsTerm) onto.fromObject(getObjectTaxon()));
      abs.set(CBRTerminologyOntology.ISSUCCESSORTAXONOF_SUBJECTTAXON, (AbsTerm) onto.fromObject(getSubjectTaxon()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising IsSuccessorTaxonOf");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      objectTaxon = (Taxon)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ISSUCCESSORTAXONOF_OBJECTTAXON));
      subjectTaxon = (Taxon)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ISSUCCESSORTAXONOF_SUBJECTTAXON));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising IsSuccessorTaxonOf");
     }
   }

}
