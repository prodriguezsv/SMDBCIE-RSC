package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* It's a subclass of a defined term
* Protege name: State
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultState implements State, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultState() {
    this._internalInstanceName = "";
  }

  public DefaultState(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: describes
   */
   private List describes = new ArrayList();
   public void addDescribes(Attribute elem) { 
     describes.add(elem);
   }
   public boolean removeDescribes(Attribute elem) {
     boolean result = describes.remove(elem);
     return result;
   }
   public void clearAllDescribes() {
     describes.clear();
   }
   public Iterator getAllDescribes() {return describes.iterator(); }
   public List getDescribes() {return describes; }
   public void setDescribes(List l) {describes = l; }

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
      abs.set(CBRTerminologyOntology.STATE_DESCRIBES, (AbsTerm) onto.fromObject(getDescribes()));
      abs.set(CBRTerminologyOntology.STATE_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(CBRTerminologyOntology.STATE_TERM, (AbsTerm) onto.fromObject(getTerm()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising State");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      describes = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.STATE_DESCRIBES));
      definition = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.STATE_DEFINITION));
      term = (String)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.STATE_TERM));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising State");
     }
   }

}
