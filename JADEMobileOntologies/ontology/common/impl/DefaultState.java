package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.common.*;

/**
* It's a subclass of a defined term
* Protege name: State
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultState implements State, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CommonTerminologyOntology.STATE_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(CommonTerminologyOntology.STATE_TERM, (AbsTerm) onto.fromObject(getTerm()));
      abs.set(CommonTerminologyOntology.STATE_DESCRIBES, (AbsTerm) onto.fromObject(getDescribes()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising State");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      definition = (String)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.STATE_DEFINITION));
      term = (String)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.STATE_TERM));
      describes = (List)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.STATE_DESCRIBES));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising State");
     }
   }

}
