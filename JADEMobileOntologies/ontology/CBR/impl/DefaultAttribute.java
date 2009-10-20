package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* It's a subclass of a defined term
* Protege name: Attribute
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultAttribute implements Attribute, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultAttribute() {
    this._internalInstanceName = "";
  }

  public DefaultAttribute(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: apliesTo
   */
   private List apliesTo = new ArrayList();
   public void addApliesTo(Object elem) { 
     apliesTo.add(elem);
   }
   public boolean removeApliesTo(Object elem) {
     boolean result = apliesTo.remove(elem);
     return result;
   }
   public void clearAllApliesTo() {
     apliesTo.clear();
   }
   public Iterator getAllApliesTo() {return apliesTo.iterator(); }
   public List getApliesTo() {return apliesTo; }
   public void setApliesTo(List l) {apliesTo = l; }

   /**
   * Protege name: describedBy
   */
   private List describedBy = new ArrayList();
   public void addDescribedBy(Object elem) { 
     describedBy.add(elem);
   }
   public boolean removeDescribedBy(Object elem) {
     boolean result = describedBy.remove(elem);
     return result;
   }
   public void clearAllDescribedBy() {
     describedBy.clear();
   }
   public Iterator getAllDescribedBy() {return describedBy.iterator(); }
   public List getDescribedBy() {return describedBy; }
   public void setDescribedBy(List l) {describedBy = l; }

   /**
   * Protege name: definition
   */
   private String definition;
   public void setDefinition(String value) { 
    this.definition=value;
   }
   public String getDefinition() {
     return this.definition;
   }

   /**
   * Protege name: term
   */
   private String term;
   public void setTerm(String value) { 
    this.term=value;
   }
   public String getTerm() {
     return this.term;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CBRTerminologyOntology.ATTRIBUTE_APLIESTO, (AbsTerm) onto.fromObject(getApliesTo()));
      abs.set(CBRTerminologyOntology.ATTRIBUTE_DESCRIBEDBY, (AbsTerm) onto.fromObject(getDescribedBy()));
      abs.set(CBRTerminologyOntology.ATTRIBUTE_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(CBRTerminologyOntology.ATTRIBUTE_TERM, (AbsTerm) onto.fromObject(getTerm()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Attribute");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      apliesTo = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ATTRIBUTE_APLIESTO));
      describedBy = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ATTRIBUTE_DESCRIBEDBY));
      definition = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ATTRIBUTE_DEFINITION));
      term = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ATTRIBUTE_TERM));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Attribute");
     }
   }

}
