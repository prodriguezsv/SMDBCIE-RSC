package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: Retain
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultRetain implements Retain, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultRetain() {
    this._internalInstanceName = "";
  }

  public DefaultRetain(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: case
   */
   private Case case;
   public void setCase(Case value) { 
    this.case=value;
   }
   public Case getCase() {
     return this.case;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      abs.set(CBRTerminologyOntology.RETAIN_CASE, (AbsTerm) onto.fromObject(getCase()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Retain");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsAgentAction abs = (AbsAgentAction) absObj;
      case = (Case)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.RETAIN_CASE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Retain");
     }
   }

}
