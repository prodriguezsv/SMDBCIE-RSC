package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Retrieve
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultRetrieve implements Retrieve, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultRetrieve() {
    this._internalInstanceName = "";
  }

  public DefaultRetrieve(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: similarTo
   */
   private Problem similarTo;
   public void setSimilarTo(Problem value) { 
    this.similarTo=value;
   }
   public Problem getSimilarTo() {
     return this.similarTo;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      abs.set(CBRTerminologyOntology.RETRIEVE_SIMILARTO, (AbsTerm) onto.fromObject(getSimilarTo()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Retrieve");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      similarTo = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.RETRIEVE_SIMILARTO));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Retrieve");
     }
   }

}
