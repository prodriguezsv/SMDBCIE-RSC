package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* It's a subclass of a defined term
* Protege name: Structure
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultStructure implements Structure, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultStructure() {
    this._internalInstanceName = "";
  }

  public DefaultStructure(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: owns
   */
   private List owns = new ArrayList();
   public void addOwns(Attribute elem) { 
     owns.add(elem);
   }
   public boolean removeOwns(Attribute elem) {
     boolean result = owns.remove(elem);
     return result;
   }
   public void clearAllOwns() {
     owns.clear();
   }
   public Iterator getAllOwns() {return owns.iterator(); }
   public List getOwns() {return owns; }
   public void setOwns(List l) {owns = l; }

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
      abs.set(CBRTerminologyOntology.STRUCTURE_OWNS, (AbsTerm) onto.fromObject(getOwns()));
      abs.set(CBRTerminologyOntology.STRUCTURE_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(CBRTerminologyOntology.STRUCTURE_TERM, (AbsTerm) onto.fromObject(getTerm()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Structure");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      owns = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.STRUCTURE_OWNS));
      definition = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.STRUCTURE_DEFINITION));
      term = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.STRUCTURE_TERM));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Structure");
     }
   }

}
